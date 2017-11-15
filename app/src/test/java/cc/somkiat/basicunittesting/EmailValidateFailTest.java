package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validate.EmailValidator;
import cc.somkiat.basicunittesting.validate.ValidateResult;

import static org.junit.Assert.assertFalse;

public class EmailValidateFailTest {

    @Test
    public void emailIsEmpyt(){
        EmailValidator emailValidator = new EmailValidator();
        ValidateResult result = emailValidator.validate("");
        assertFalse(result.getMessage(), result.isValid());

    }
}
