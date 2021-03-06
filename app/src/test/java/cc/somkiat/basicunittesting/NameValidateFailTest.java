package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validate.NameValidator;
import cc.somkiat.basicunittesting.validate.ValidateResult;

import static org.junit.Assert.assertFalse;

public class NameValidateFailTest {

    @Test
    public void nameIsEmpty(){
        NameValidator nameValidator = new NameValidator();
        ValidateResult result = nameValidator.validate("");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void nameIsNotAlphabet(){
        NameValidator nameValidator = new NameValidator();
        ValidateResult result = nameValidator.validate("Tes1");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void nameIsTooLong(){
        NameValidator nameValidator = new NameValidator();
        ValidateResult result = nameValidator.validate("ThaiJapanKoreaAmericaItalyChinaFranceNeverLand");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void nameIsTooShort(){
        NameValidator nameValidator = new NameValidator();
        ValidateResult result = nameValidator.validate("T");
        assertFalse(result.getMessage(), result.isValid());
    }
}
