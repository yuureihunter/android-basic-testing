package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validate.NameValidator;
import cc.somkiat.basicunittesting.validate.ValidateResult;

import static org.junit.Assert.assertFalse;

public class NameValidateFailTest {

    @Test
    public void nameIsEmapty(){
        NameValidator nameValidator = new NameValidator();
        ValidateResult result = nameValidator.vlidate("");
        assertFalse(result.getMessage(), result.isValid());
    }
}
