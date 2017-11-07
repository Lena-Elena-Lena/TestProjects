import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import packforscan.myInterface;
import packforscan.myInterfaceImpl;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Created by razgulyaeva on 24.09.2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class StringUtilsTest {

   @Autowired
   myInterface mI;
   //AnnotationConfigApplicationContext context;//=new AnnotationConfigApplicationContext();


    @Test
    public void testToArray() {
        //assertThat(context, instanceOf(AnnotationConfigApplicationContext.class));
        assertThat(mI, instanceOf(myInterfaceImpl.class));
    }

    @Test
    public void testJoinArray() {
        assertEquals("Unexpected string value", 2, 2);

    }

    @Test
    public void testIsEmpty() {
        assertThat(new Integer(3), instanceOf(Integer.class));

    }

    @Test
    public void testToDouble() {
        double source = 3.1415;
        String expected="3.1415";

        String actual = StringUtils.fromDouble(source);
        assertEquals("Unexpected string value", expected, actual);

    }

    @Test
    public void testFromDouble() {

    }
}
