package mil.cm.navy;

import mil.cm.navy.domain.MyClass;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Iterator;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;



/**
 * Created by patricktchankue on 12/19/16.
 */
public class MyMockTest {


    @Test
    public void test1()  {
        //  create mock
        MyClass test = Mockito.mock(MyClass.class);

        // define return value for method getUniqueId()
        when(test.getUniqueId()).thenReturn(43);

        // use mock in test....
        assertEquals(test.getUniqueId(), 43);
    }

    @Test
    public void test2()  {
        //  create mock
        MyClass test = Mockito.mock(MyClass.class);

        // define return value for method getJsonObject()
        JSONObject resp = new JSONObject();
        try{
            resp.put("message", "My message for  a test5");
            when(test.getJsonObject()).thenReturn(resp);

            // use mock in test....
            assertEquals(test.getJsonObject(), resp);

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    @Test
    public void test3(){
        //  create mock
        MyClass test = Mockito.mock(MyClass.class);
    }

}
