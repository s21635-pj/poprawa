package pjwstk.pl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SomeAnnotationValidation implements ConstraintValidator<ShopName, String> {
   @Override
   public void initialize(ShopName shopName) {
   }
   @Override
   public boolean isValid(String shopName, ConstraintValidatorContext constraintValidatorContext) {

      return shopName.length() >= 6 && shopName.matches("[a-zA-z]+");
   }
}
