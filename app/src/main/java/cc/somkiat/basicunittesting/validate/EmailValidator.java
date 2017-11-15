package cc.somkiat.basicunittesting.validate;

import cc.somkiat.basicunittesting.exception.ValidateException;

public class EmailValidator {

    public ValidateResult validate(String email) {
        try {
            emailIsEmpty(email);
        }catch (Exception e){
            return new ValidateResult(false, e.getMessage());
        }
        return new ValidateResult(true, null);
    }

    private void emailIsEmpty(String email) throws ValidateException {
        if (email.isEmpty()){
            throw new ValidateException("Email is Empty");
        }
    }
}
