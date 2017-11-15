package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validate.NameValidator;
import cc.somkiat.basicunittesting.validate.ValidateResult;

import static org.junit.Assert.assertTrue;

public class NameValidateSuccessTest {

    @Test
    public void nameIsNotEmpty(){
        NameValidator nameValidator = new NameValidator();
        ValidateResult result = nameValidator.validate("Test");
        assertTrue(result.getMessage(), result.isValid());
    }

    @Test
    public void nameIsAlphabet(){
        NameValidator nameValidator = new NameValidator();
        ValidateResult result = nameValidator.validate("TestDADtat True");
        assertTrue(result.getMessage(), result.isValid());
    }
}
