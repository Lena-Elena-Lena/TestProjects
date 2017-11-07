package lesson.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by razgulyaeva on 03.09.2017.
 */
@Component
@Scope("prototype")
@Qualifier("main")
public class GreetingServiceImpl implements GreetingService{
    private ApplicationContext context;

    @Required
    public void setContext(ApplicationContext context) {
        this.context = context;
    }
    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }
}
