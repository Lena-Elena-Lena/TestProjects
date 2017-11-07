
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import packforscan.myInterface;
import packforscan.myInterfaceImpl;

/**
 * Created by razgulyaeva on 24.09.2017.
 *
 */

@Configuration
@ComponentScan(basePackages = {"packforscan"})
public class AppConfig {
    @Bean(name = "mI")
    myInterface dataModelService() {

        return new myInterfaceImpl();
    }

}
