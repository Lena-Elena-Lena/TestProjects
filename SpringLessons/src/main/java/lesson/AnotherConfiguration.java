package lesson;

import lesson.services.BeanWithDependency;
import lesson.services.GreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by razgulyaeva on 16.09.2017.
 *
 */
@Configuration
public class AnotherConfiguration {

    //@Autowired
   // private GreetingService greetingService;

    @Bean
    BeanWithDependency beanWithDependency() {
        return new BeanWithDependency();
    }
}
