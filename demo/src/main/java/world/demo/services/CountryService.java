package world.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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


        Country country = countryRepository.findCountryByCode(countryCode);
        if (country == null)
            throw new WorldExceptions(ErrorCodes.INVALID_COUNTRY_CODE);

        return country;
    }
}
