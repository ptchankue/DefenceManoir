package mil.cm.navy.controller.db;

import mil.cm.navy.domain.Country;
import mil.cm.navy.repository.CountryRepository;
import mil.cm.navy.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patricktchankue on 1/17/17.
 */
@RestController
@RequestMapping("api/v1/customer")
public class DbTestController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("test")
    public void testing(){
        logger.info("Using JPA for insert and find");
        List<Country> results = (List)countryRepository.findAll();
        for(Country c: results){
            System.out.println(c);
        }
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Country> getAll() {
        return (List<Country>)countryRepository.findAll();
    }
}
