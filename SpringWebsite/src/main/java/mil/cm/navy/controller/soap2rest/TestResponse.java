package mil.cm.navy.controller.soap2rest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

/**
 * Created by patricktchankue on 12/5/16.
 */
public class TestResponse {

    // remove the _ to test this class independently
    public static void _main(String[] args) {
        String res = "{\n" +
                "\t\"soap:Envelope\": {\n" +
                "\t\t\"xmlns:xsd\": \"http://www.w3.org/2001/XMLSchema\",\n" +
                "\t\t\"xmlns:soap\": \"http://www.w3.org/2003/05/soap-envelope\",\n" +
                "\t\t\"xmlns:xsi\": \"http://www.w3.org/2001/XMLSchema-instance\",\n" +
                "\t\t\"soap:Body\": {\n" +
                "\t\t\t\"GetCitiesByCountryResponse\": {\n" +
                "\t\t\t\t\"xmlns\": \"http://www.webserviceX.NET\",\n" +
                "\t\t\t\t\"GetCitiesByCountryResult\": \"<NewDataSet>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Alexander Bay<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Aliwal North<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Bloemfontein J. B. M. Hertzog<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Bethlehem Airport<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Beaufort West<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Carolina<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Cape Town D. F. Malan<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Calvinia<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>De Aar<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Durban Louis Botha<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>East London<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Ellisras<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Frankfort<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Fraserburg<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Gough Island<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>George Airport<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Graaff Reinet<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Hoedspruit<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Pretoria Irene<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Jan Smuts<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Kimberley<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Lichtenburg<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Langebaanweg<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Ladysmith<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Middelburg<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Marion Island<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Mmabatho Airport<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Mossel Bay Cape Saint Blaize<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Nelspruit<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Oudtshoorn<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Pietersburg<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Port Elizabeth<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Phalaborwa<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Port St Johns<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Pretoria<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Queenstown<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Richard Bay<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Springbok<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Tristan Da Cunha<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Upington<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Umtata<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Vryburg<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Vredendal<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Waterkloof Lmb<\\/City>\\r\\n  <\\/Table>\\r\\n  <Table>\\r\\n    <Country>South Africa<\\/Country>\\r\\n    <City>Welkom<\\/City>\\r\\n  <\\/Table>\\r\\n<\\/NewDataSet>\"\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}";

        try {
            JSONObject obj = new JSONObject(res);
            obj = obj.getJSONObject("soap:Envelope").getJSONObject("soap:Body").getJSONObject("GetCitiesByCountryResponse");
            String xmlResult = obj.getString("GetCitiesByCountryResult");
            JSONArray jsonArray = XML.toJSONObject(xmlResult).getJSONObject("NewDataSet").getJSONArray("Table");
            System.out.println(jsonArray);
            for(int i=0; i<jsonArray.length(); i++){
                JSONObject _obj = jsonArray.getJSONObject(i);
                System.out.println(_obj.getString("City"));
            }
            //System.out.println(obj.getString("GetCitiesByCountryResult"));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
