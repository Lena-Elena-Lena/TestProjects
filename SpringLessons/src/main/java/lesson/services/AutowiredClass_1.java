package lesson.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Map;

/**
 * Created by razgulyaeva on 16.09.2017.
 */
public class AutowiredClass {
    @Autowired //к полям класса
    @Qualifier("main")
    //@Autowired(required = false) //чтобы не бросалось исключение,
    //если не с кем связать
    //рекомендуется использовать @Required
    private GreetingService greetingService;

    @Autowired //к полям класса в виде массива или коллекции
    private GreetingService[] services;

    @Autowired //к Map, где ключами являются имена бинов, значения - сами бины
    private Map<String, GreetingService> serviceMap;

    @Autowired //к конструктору
    public AutowiredClass(@Qualifier("main") GreetingService service) {}

    @Autowired //к обычным методам с произвольным названием аргументов и их количеством
    public void prepare(GreetingService prepareContext){/* что-то делаем... */}

    @Autowired //к "традиционному" setter-методу
    public void setContext(GreetingService service) { this.greetingService = service; }
}
