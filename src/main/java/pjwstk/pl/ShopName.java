package pjwstk.pl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SomeAnnotationValidation.class)
@Target(ElementType.FIELD)
public @interface ShopName {
    public String key() default "";

    String message() default "Invalid data";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
