package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validate.EmailValidator;
import cc.somkiat.basicunittesting.validate.ValidateResult;

import static org.junit.Assert.assertTrue;

/**
 * Created by Pimpavee on 15/11/2560.
 */

public class EmailValidateSuccessTest {
    @Test
    public void emailIsNotEmpty(){
        EmailValidator emailValidator = new EmailValidator();
        ValidateResult result = emailValidator.validate("test@mail.com");
        assertTrue(result.getMessage(), result.isValid());
    }
}
