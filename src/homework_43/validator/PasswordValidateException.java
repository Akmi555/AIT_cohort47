package homework_43.validator;
/*
@date 15.07.2024
@author Sergey Bugaienko
*/

public class PasswordValidateException extends Exception {

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Password validate exception | "  + super.getMessage();
    }
}
