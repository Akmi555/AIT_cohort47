package homework_43.validator;
/*
@date 12.07.2024
@author Sergey Bugaienko
*/

public class EmailValidateException extends Exception {
    /*
    getMessage() - возвращает строку с коротким описание исключения
    getCause() - возвращает исключение, которое вызвало текущее исключении
    toString() - Строковое представление исключения
    printStackTrace() - выводит трассировку исключения.
     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " +  super.getMessage();
    }
}
