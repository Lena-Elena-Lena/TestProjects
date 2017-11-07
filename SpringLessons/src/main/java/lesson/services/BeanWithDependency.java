package lesson.services;

import org.springframework.stereotype.Component;

/**
 * Created by razgulyaeva on 16.09.2017.
 */
@Component
public class BeanWithDependency {
    public BeanWithDependency(GreetingService greetingService) {

    }

    public BeanWithDependency() {

    }
    public String printText() {
        return "Some text";
    }
}
