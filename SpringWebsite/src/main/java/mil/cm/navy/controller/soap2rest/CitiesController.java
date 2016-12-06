package mil.cm.navy.controller.soap2rest;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.json.XML;

/**
 * Created by patricktchankue on 12/5/16.
 */
@RestController
public class CitiesController {

    private static String service_url = "http://www.webservicex.com/globalweather.asmx";

    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "/cities", produces = "application/json")
    public ResponseEntity getListCities(@RequestParam(value = "country", defaultValue = "South Africa") String country){

        String req = "<soap:Envelope xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:web=\"http://www.webserviceX.NET\">\n" +
                "   <soap:Header/>\n" +
                "   <soap:Body>\n" +
                "      <web:GetCitiesByCountry>\n" +
                "         <!--Optional:-->\n" +
                "         <web:CountryName>"+ country +

                "</web:CountryName>\n" +
                "      </web:GetCitiesByCountry>\n" +
                "   </soap:Body>\n" +
                "  </soap:Envelope>";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_XML);
        HttpEntity<String> request = new HttpEntity<String>(req, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(service_url, request, String.class);

        System.out.println(response.getBody());

//        JSONObject obj = new JSONObject();

        System.out.println(XMLtoJSON(response.getBody()));

        JSONArray arrayResponse = new JSONArray();

        try {

            JSONObject obj = new JSONObject(XMLtoJSON(response.getBody()));
            obj = obj.getJSONObject("soap:Envelope").getJSONObject("soap:Body").getJSONObject("GetCitiesByCountryResponse");
            String xmlResult = obj.getString("GetCitiesByCountryResult");
            JSONArray jsonArray = XML.toJSONObject(xmlResult).getJSONObject("NewDataSet").getJSONArray("Table");
            System.out.println(jsonArray);
            for(int i=0; i<jsonArray.length(); i++){
                JSONObject _obj = jsonArray.getJSONObject(i);
                System.out.println(_obj.getString("City"));
            }
            arrayResponse = jsonArray;

        }catch (Exception e){
            e.printStackTrace();
        }

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(arrayResponse.toString());
    }

    public String XMLtoJSON(String xml) {

        try {
            JSONObject jsonObj = XML.toJSONObject(xml);
            String json = jsonObj.toString();
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

}
