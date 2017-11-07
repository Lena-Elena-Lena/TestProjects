package lesson.starter;


import lesson.LessonsConfiguration;
import lesson.services.BeanWithDependency;
import lesson.services.GreetingService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Locale;

/**
 * Created by razgulyaeva on 03.09.2017.
 */
public class Starter {
    private static final Logger logger = LogManager.getLogger(Starter.class);

    public static void main(String[] args) {
        logger.info("Starting configuration...");

    /*    AbstractApplicationContext context = new AnnotationConfigApplicationContext(LessonsConfiguration.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        BeanWithDependency withDependency = context.getBean(BeanWithDependency.class);
        logger.info(greetingService.sayGreeting());  // "Greeting, user!"
        logger.info(withDependency.printText());

        logger.info("Message: " + context.getMessage("message", null, Locale.getDefault()));
        logger.info("Argument.required: " + context.getMessage("argument.required", new Object[]{"Test_Argument"}, Locale.getDefault()));

        context.registerShutdownHook();*/
        ApplicationContext context = new AnnotationConfigApplicationContext(LessonsConfiguration.class);
       // logger.info("Message: " + context.getMessage("message", null, Locale.getDefault()));
       // logger.info("Argument.required: " + context.getMessage("argument.required", new Object[]{"Test_UK_Argument"}, Locale.UK));
    }
}
