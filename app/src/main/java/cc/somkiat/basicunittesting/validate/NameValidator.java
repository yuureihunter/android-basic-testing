package cc.somkiat.basicunittesting.validate;

import cc.somkiat.basicunittesting.exception.ValidateException;

/**
 * Created by Pimpavee on 15/11/2560.
 */

public class NameValidator {
    public ValidateResult validate(String name) {
        try {

            nameIsEmpty(name);
            nameIsNotAlphabet(name);
            nameLengthIsMoreThirty(name);
            nameLengthIsLessTwo(name);

        }catch (Exception e){
            return new ValidateResult(false, e.getMessage());
        }
        return new ValidateResult(true, null);
    }

    private void nameLengthIsLessTwo(String name) throws ValidateException {
        if (name.length() < 2){
            throw new ValidateException("Name is Too Short");
        }
    }

    private void nameLengthIsMoreThirty(String name) throws ValidateException {
        if (name.length() > 30){
            throw new ValidateException("Name is Too Long");
        }
    }

    private void nameIsNotAlphabet(String name) throws ValidateException {
        if (!name.matches("^[ A-Za-z]+$")){
            throw new ValidateException("Name is incorrect");
        }
    }



    private void nameIsEmpty(String name) throws ValidateException {
        if (name.isEmpty()){
            throw new ValidateException("Name is Empty");
        }
    }
}
