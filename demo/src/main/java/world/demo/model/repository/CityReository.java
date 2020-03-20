package world.demo.model.repository;

import org.springframework.data.repository.CrudRepository;
import world.demo.model.entity.City;

public interface CityReository extends CrudRepository<City,Long> {
}
