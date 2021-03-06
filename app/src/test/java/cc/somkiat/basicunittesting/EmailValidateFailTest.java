package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validate.EmailValidator;
import cc.somkiat.basicunittesting.validate.ValidateResult;

import static org.junit.Assert.assertFalse;

public class EmailValidateFailTest {

    @Test
    public void emailIsEmpty(){
        EmailValidator emailValidator = new EmailValidator();
        ValidateResult result = emailValidator.validate("");
        assertFalse(result.getMessage(), result.isValid());

    }

    @Test
    public void emailIsMissingUserName(){
        EmailValidator emailValidator = new EmailValidator();
        ValidateResult result = emailValidator.validate("@mail.com");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void emailIsMissingAtSign(){
        EmailValidator emailValidator = new EmailValidator();
        ValidateResult result = emailValidator.validate("testmail.com");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void emailIsMissingDomain(){
        EmailValidator emailValidator = new EmailValidator();
        ValidateResult result = emailValidator.validate("test@");
        assertFalse(result.getMessage(), result.isValid());
    }
}
