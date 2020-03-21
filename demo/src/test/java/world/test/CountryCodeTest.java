package world.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import world.demo.WorldDemoApplication;
import world.demo.model.entity.Country;
import world.demo.services.CountryService;
import java.net.URI;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest(classes = WorldDemoApplication.class)
public class CountryCodeTest {

    @Autowired
    CountryService countryService;


    @Test
    public void validCountryCodeTest() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        final String baseUrl = "http://localhost:8080/api/country/BHR";
        URI uri = new URI(baseUrl);
        ResponseEntity<Country> result = restTemplate.getForEntity(uri, Country.class);
        Assert.assertEquals(200, result.getStatusCodeValue());
    }

     //  if the transaction get into the cathch exception it will return error which mean that server is down

    @Test
    public void validDataBaseConnection() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        final String baseUrl = "http://localhost:8080/api/country/BHR";
        URI uri = new URI(baseUrl);
        ResponseEntity<Country> result = restTemplate.getForEntity(uri, Country.class);
        Assert.assertEquals(200, result.getStatusCodeValue());
    }

}
