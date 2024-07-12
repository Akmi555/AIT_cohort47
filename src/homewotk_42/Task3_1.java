package homewotk_42;
/*
@date 12.07.2024
@author Sergey Bugaienko
*/
/*
Task 1 Легкий
Дан список сотрудников (Employee) с полями name, department, salary.
Используя Stream API, сгруппируйте сотрудников по отделам

Task 3 Продвинутый
Опционально
Дан список Employee. Вычислите
среднюю зарплату сотрудников в каждом отделе и
найдите отдел с максимальной средней зарплатой.

 */

import lesson_42.grouping.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3_1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Petr", 2500, 25, "developer", "IT"),
                new Employee("Silvia", 1500, 22, "trainee", "IT"),
                new Employee("Stefan", 2500, 30, "PM", "IT"),
                new Employee("Olivia", 2700, 25, "manager", "Management"),
                new Employee("Sebastian", 3500, 28, "chef", "Management"),
                new Employee("Hanna", 2000, 25, "chef", "Cleaning"),
                new Employee("Petr", 1300, 45, "Cleaner", "Cleaning"),
                new Employee("John", 3200, 19, "chef", "IT")
        ));

        //  группировка сотрудников по отделам
        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(map);

        // средняя зарплата в каждом отдела
        Map<String, Double> averagesSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(empl -> empl.getSalary())));
//                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("averagesSalaries: " + averagesSalaries);

        // Два варианта поиска максимальной зп
        // получаем поток "пар клю-значение" из map-ы
        Map.Entry<String, Double> entryMax = averagesSalaries.entrySet().stream()
                .max((entry, entry1) -> entry.getValue().compareTo(entry1.getValue()))
                .orElse(null);

        Map.Entry<String, Double> entryMin = averagesSalaries.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .orElse(null);

        System.out.printf("Отдел с максимальной средней зп: %s (ср.зп: %.2f)\n", entryMax.getKey(), entryMax.getValue());
        System.out.println();

        System.out.printf("Отдел с минимальной средней зп (компаратор opt2): %s (ср.зп: %.2f)\n", entryMin.getKey(), entryMin.getValue());


    }
}
