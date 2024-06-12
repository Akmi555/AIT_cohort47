package lesson_21.paper;
/*
@date 12.06.2024
@author Sergey Bugaienko
*/

public class Pencil extends Pen{
    @Override
    public void draw(String figure) {
        System.out.println("Рисую карандашом " + figure);
    }
}
