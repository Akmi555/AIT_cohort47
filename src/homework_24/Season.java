package homework_24;
/*
@date 18.06.2024
@author Sergey Bugaienko
*/
/*
Реализуйте Enum для определения четырех времен года с методами, возвращающими среднюю температуру для каждого времени года.

 */
public enum Season {
    WINTER("Winter", -5),
    SPRING("Spring", 8),
    SUMMER("Summer", 22),
    AUTUMN("Autumn", 15);

    // Ctrl + Shift + U - перевод выделения в нижний / верхний регистр

    private final String name;
    private final double avgTemp;

    Season(String name, double avgTemp) {
        this.name = name;
        this.avgTemp = avgTemp;
    }

    public String getName() {
        return name;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", avgTemp=" + avgTemp +
                '}';
    }
}
