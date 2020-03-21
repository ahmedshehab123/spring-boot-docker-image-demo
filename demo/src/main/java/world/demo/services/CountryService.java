package world.demo.services;

import org.hibernate.exception.JDBCConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.client.HttpServerErrorException;
import world.demo.model.entity.Country;
import world.demo.model.repository.CountryRepository;
import world.demo.utils.ErrorCodes;
import world.demo.utils.WorldExceptions;

@Service
public class CountryService {
    CountryRepository countryRepository;

    @Autowired
    public  CountryService(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    public Country getCountryInfoByCountryCode(String countryCode){

        try {
            countryRepository.count();
        }catch (CannotCreateTransactionException  e){
            e.printStackTrace();
            throw new WorldExceptions(ErrorCodes.INTERNAL_ERROR);
        }

        Country country = countryRepository.findCountryByCode(countryCode);
        if (country == null)
            throw new WorldExceptions(ErrorCodes.INVALID_COUNTRY_CODE);

        return country;
    }
}
