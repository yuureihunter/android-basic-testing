package cc.somkiat.basicunittesting.validate;

public class ValidateResult {

    private String message;
    private boolean valid;

    public ValidateResult(boolean valid, String message) {
        this.valid = valid;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public boolean isValid() {
        return valid;
    }
}
