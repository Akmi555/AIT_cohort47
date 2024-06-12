package homework_20.finalExample;
/*
@date 12.06.2024
@author Sergey Bugaienko
*/

public class Children extends Base{

    @Override
    public void testNotFinal() {
        System.out.println("Переопределен метод testNotFinal");
    }
}
