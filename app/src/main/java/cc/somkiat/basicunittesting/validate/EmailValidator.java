package cc.somkiat.basicunittesting.validate;

import java.util.regex.Pattern;

import cc.somkiat.basicunittesting.exception.ValidateException;

public class EmailValidator {

    public ValidateResult validate(String email) {
        try {

            emailIsEmpty(email);
            emailIsCorrect(email);

        }catch (Exception e){
            return new ValidateResult(false, e.getMessage());
        }
        return new ValidateResult(true, null);
    }

    private void emailIsCorrect(String email) throws ValidateException {
        String emailPattern = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";

        if(!Pattern.matches(emailPattern, email)) {
            throw new ValidateException("Email is Incorrect");
        }
    }

    private void emailIsEmpty(String email) throws ValidateException {
        if (email.isEmpty()){
            throw new ValidateException("Email is Empty");
        }
    }
}
