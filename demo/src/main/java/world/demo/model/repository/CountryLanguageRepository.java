package world.demo.model.repository;

import org.springframework.data.repository.CrudRepository;
import world.demo.model.entity.CountryLanguage;

public interface CountryLanguageRepository extends CrudRepository<CountryLanguage,String> {
}
