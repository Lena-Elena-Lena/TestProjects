package lesson.services;

import org.springframework.stereotype.Service;

/**
 * Created by razgulyaeva on 23.09.2017.
 */

@Service("ml")
public class MachineLearningService implements DataModelService {
    @Override
    public boolean isValid(String input) {
        return true;
    }
}
