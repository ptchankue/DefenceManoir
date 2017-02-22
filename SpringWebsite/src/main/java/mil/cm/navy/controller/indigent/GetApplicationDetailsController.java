package mil.cm.navy.controller.indigent;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by patricktchankue on 1/25/17.
 */
@RestController
public class GetApplicationDetailsController {

    private static String service_url = "http://196.15.242.146:5555/ws/EMMIndigentUI.webServices.provider:getIndigentApplication/EMMIndigentUI_webServices_provider_getIndigentApplication_Port";

    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "/indigent")
    public ResponseEntity get(){
        String req = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "  <soapenv:Body>\n" +
                "    <getIndigentMobiAppDetail xmlns=\"http://EMMBPMPROD02TST.ekurhuleni.gov.za/EMMIndigentUI/webServices/provider/getIndigentApplication\">\n" +
                "      <getIndigentAppDetailsInput xmlns=\"\">\n" +
                "        <indigentApplicationHeader>\n" +
                "          <emmAccountNo/>\n" +
                "          <personID/>\n" +
                "          <applicationRefNo>1000047295</applicationRefNo>\n" +
                "          <applicationDate>2016-11-15T13:05:07.461Z</applicationDate>\n" +
                "          <applicationState/>\n" +
                "          <applicationStatus/>\n" +
                "          <applicantKind/>\n" +
                "          <applicationType/>\n" +
                "          <applicationCCA/>\n" +
                "          <applicationCCC/>\n" +
                "          <debtorKind/>\n" +
                "          <erfNo/>\n" +
                "        </indigentApplicationHeader>\n" +
                "      </getIndigentAppDetailsInput>\n" +
                "    </getIndigentMobiAppDetail>\n" +
                "  </soapenv:Body>\n" +
                "</soapenv:Envelope>";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_XML);
        HttpEntity<String> request = new HttpEntity<String>(req, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(service_url, request, String.class);

        System.out.println(response.getBody());

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response.getBody());
    }
}
