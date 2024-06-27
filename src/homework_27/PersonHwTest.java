package homework_27;
/*
@date 21.06.2024
@author Sergey Bugaienko
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonHwTest {
    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    @Test
    void testValidEmail() {
        String validEmail = "valid@test.com";
        System.out.println("getEmail before: " + person.getEmail());

        person.setEmail(validEmail);

        System.out.println("getEmail after: " + person.getEmail());
        Assertions.assertEquals(validEmail, person.getEmail());
    }

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testSetInvalidEmail(String invalidEmail) {
        System.out.println("current Person: " + person);
        person.setEmail(invalidEmail);

        Assertions.assertEquals(startEmail, person.getEmail());
        Assertions.assertNotEquals(invalidEmail, person.getEmail());
    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
           "test_email.net",
                "test@ema@il.net",
                "test@emailnet",
                "test@email.ne.t",
                "test@email.net.",
                "test@.email.net",
                "test@em ail.net",
                "test@email.net ",
                "test@em%ail.net",
                "t$est@email.net",
                "test@ema*il.net",
                "@email.net",
                "1@email.net",
                "_@email.net"
        );
    }

}
