package mil.cm.navy.domain;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by patricktchankue on 12/19/16.
 */
public class MyClass {

    public MyClass(){

    }
    public int getUniqueId(){
        return 43;
    }
    public JSONObject getJsonObject(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("response", "The request was successful!");

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("message", "My message for  a test");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
    public Article getArticle(long id){
        return new Article(1, "Climate change","Global climate is changing rapidly");
    }
}
