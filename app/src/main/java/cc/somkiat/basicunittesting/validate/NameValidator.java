package cc.somkiat.basicunittesting.validate;

import cc.somkiat.basicunittesting.exception.ValidateException;

/**
 * Created by Pimpavee on 15/11/2560.
 */

public class NameValidator {
    public ValidateResult vlidate(String name) {
        try {
            nameIsEmpty(name);
        }catch (Exception e){
            return new ValidateResult(false, e.getMessage());
        }
        return new ValidateResult(true, null);
    }

    private void nameIsEmpty(String name) throws ValidateException {
        if (name.isEmpty()){
            throw new ValidateException("Name is Empty");
        }
    }
}
