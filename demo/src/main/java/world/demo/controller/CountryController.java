package world.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.demo.model.entity.Country;
import world.demo.services.CountryService;
import world.demo.utils.WorldExceptions;

@RestController
@RequestMapping("/api")
public class CountryController {

    CountryService countryService;
    @Autowired
    public CountryController(CountryService countryService){
        this.countryService =  countryService;
    }

    @GetMapping(value = "/country/{code}")
    public ResponseEntity<?> getCountryInfo(@PathVariable String code){

        try {
            return new ResponseEntity<>(countryService.getCountryInfoByCountryCode(code), HttpStatus.OK);
        } catch (WorldExceptions ex) {
            return new ResponseEntity<>(ex.getErrorCode(), HttpStatus.BAD_REQUEST);
        }
    }

}
