package lesson;

import lesson.services.DataModelService;
import lesson.services.MachineLearningService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by razgulyaeva on 24.09.2017.
 *
 */

@Configuration
@ComponentScan(basePackages = {"lesson.services"})
public class AppConfig {
    @Bean(name = "ml")
    DataModelService dataModelService() {

        return new MachineLearningService();
    }

}
