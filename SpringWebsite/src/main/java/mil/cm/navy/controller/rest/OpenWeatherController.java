package mil.cm.navy.controller.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by patricktchankue on 12/12/16.
 */
@RestController
public class OpenWeatherController {

    private static String base_url = "http://api.openweathermap.org/data/2.5/weather?q=";
    private static String api_key = "&APPID=b9d3ba0965528e05c338a83363a28df1";

    private RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "/weather", produces = "application/json")
    public ResponseEntity getWeather(@RequestParam(value = "city", defaultValue = "Johannesburg") String city){

        StringBuffer str = new StringBuffer();
        str.append(base_url);
        str.append(city);
        str.append("&units=metric");
        str.append(api_key);

        System.out.println(str.toString());
//        ResponseEntity<String> response = restTemplate.getForEntity(str.toString(), String.class);
//
//        System.out.println(response.getBody());

        String result = restTemplate.getForObject(str.toString(), String.class, "42", "21");
        System.out.println(result);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(result);
    }
}
