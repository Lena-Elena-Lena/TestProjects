package lesson;

import lesson.AppConfig;
import lesson.services.DataModelService;
import lesson.services.MachineLearningService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Created by razgulyaeva on 23.09.2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class MachineLearningTest {
   // private static final Logger logger = LogManager.getLogger(Starter.class);
    //DI
    @Autowired
    @Qualifier("ml")
    DataModelService dataModelService;

    @Test
    public void test_ml_always_return_true() {

     //   logger.info("testing configuration...!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        //assert correct type/impl
        assertThat(dataModelService, instanceOf(MachineLearningService.class));

       // assertEquals("Unexpected string value", 2, 2);

        //assert true
       // assertThat(ml.isValid(""), is(true));

    }
}
