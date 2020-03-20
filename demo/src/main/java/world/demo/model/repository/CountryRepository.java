package world.demo.model.repository;

import org.springframework.data.repository.CrudRepository;
import world.demo.model.entity.Country;

public interface CountryRepository extends CrudRepository<Country,String> {
    Country findCountryByCode(String countryCode);
}
