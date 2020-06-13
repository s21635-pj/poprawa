package pjwstk.pl;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop(1,"dom");
        final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        final Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<Shop>> violations = validator.validate(shop);
    }
}
