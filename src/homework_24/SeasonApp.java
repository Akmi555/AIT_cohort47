package homework_24;
/*
@date 18.06.2024
@author Sergey Bugaienko
*/

public class SeasonApp {
    public static void main(String[] args) {

        Season winter = Season.WINTER;

        System.out.println(winter.getAvgTemp());
        System.out.println(winter.getName());

        Season[] seasons = Season.values();

        double sum = 0;
        for (int i = 0; i < seasons.length; i++) {
            sum += seasons[i].getAvgTemp();
        }

        double avgYear = sum / seasons.length;

        System.out.println("Средняя годовая температура: " + avgYear);

    }
}
