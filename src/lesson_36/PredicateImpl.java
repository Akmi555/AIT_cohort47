package lesson_36;
/*
@date 03.07.2024
@author Sergey Bugaienko
*/

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<String> {
    @Override
    public boolean test(String string) {
        return string.startsWith("J");
    }
}
