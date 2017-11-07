import logic.Client;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Created by razgulyaeva on 03.10.2017.
 */
public class soaptest {
    Client c;
    @Before
    public void init(){
        c=new Client();

    }

    @Test
    public void testToArray() {
        String d=c.tryConnection("55", "55");
        System.out.println("STEP 7");
        assertEquals("Error! Unexpected code", "88885", d);
       // boolean b=d.equals("555");
       // Integer i=9;
        //assertThat(context, instanceOf(AnnotationConfigApplicationContext.class));
        //assertThat(i, instanceOf(Integer.class));
       // assertTrue("Unexpected string value", b);
    }
}
