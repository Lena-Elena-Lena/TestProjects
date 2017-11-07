package lesson;
import lesson.services.*;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * Created by razgulyaeva on 03.09.2017.
 */
@Configuration
@ComponentScan(basePackages = "lesson.services")
@Import(AnotherConfiguration.class)
//@ImportResource("classpath:/lesson/xml-config.xml")
public class LessonsConfiguration {


    @Bean
    MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }

    @Bean
    @Scope("prototype")
    public Object asyncCommand() {
        return new Object();
    }

    @Bean
    public CommandManager commandManager() {
        // возвращаем новую анонимную реализацию CommandManager
        // с новым объектом
        return new CommandManager() {
            protected Object createCommand() {
                return asyncCommand();
            }
        };
    }
    @Bean
    BeanWithDependency beanWithDependency() {
        return new BeanWithDependency(greetingService());
    }

    @Bean(name = "gServiceName")
    @Description("Текстовое описание бина greetingService")
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}
