package practice_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        /*
          15. Створіть функцію, яка приймає лямбда-функцію і два аргументи,
          і виконує цю лямбда-функцію з цими аргументами.
         */
        System.out.println("Завдання 1, варіант 15:");
        List<String> names = Arrays.asList("Олександр", "Костянтин", "Володимир",
                "Прохор", "Антон", "Бойовий Вертоліт");
        task_15_lambdaExample(names);
        System.out.println(System.lineSeparator());

        /*
          45. Напишіть програму, яка використовує лямбда-функції для розрахунку статистики
           за даними, що вводить користувач (наприклад, середнє значення, медіана,
           стандартне відхилення).
         */
        System.out.println("Завдання 2, варіант 45:");
        List<Double> data = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println("Середній показник: " + task_45_calculateAverage(data));
        System.out.println("Медіана: " + task_45_calculateMedian(data));
        System.out.println("Стандартне відхилення: " + task_45_calculateStandardDeviation(data));
        System.out.println(System.lineSeparator());

        /*
          75. Напишіть програму для керування проектами, яка використовує лямбда-функції
           для розподілу завдань між командою та відстеження прогресу.
         */
        System.out.println("Завдання 3, варіант 75:");
        task_75_ProjectManagement pm = new task_75_ProjectManagement();
        pm.addTask(new task_75_Task("Дизайн"));
        pm.addTask(new task_75_Task("Розробка"));
        pm.addTask(new task_75_Task("Тестування"));
        pm.addTask(new task_75_Task("Натягування противогазу на голову"));
        pm.addTask(new task_75_Task("Рефакторинг"));

        pm.assignTasks(task -> {
            if ("Дизайн".equals(task.name)) {
                task.assignTo("Олександр");
            } else if ("Розробка".equals(task.name) || "Рефакторинг".equals(task.name)) {
                task.assignTo("Костянтин");
            } else if ("Тестування".equals(task.name)) {
                task.assignTo("Бойовий Вертоліт");
            } else if ("Натягування противогазу на голову".equals(task.name)) {
                task.assignTo("Прохор");
            }
        });

        pm.printTasks();
    }

    private static void task_15_lambdaExample(List<String> names) {

        System.out.println("Вхідні дані: " + names);

        // довжина імені
        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .toList();
        System.out.println("Довжина імен: " + nameLengths);

        // сортування по довжині
        List<String> sortedNames = names.stream()
                .sorted((name1, name2) -> Integer.compare(name1.length(), name2.length()))
                .toList();
        System.out.println("Сортування за довжиною:" + sortedNames);
    }

    private static double task_45_calculateAverage(List<Double> numbers) {
        return numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    private static double task_45_calculateMedian(List<Double> numbers) {
        List<Double> sortedNumbers = numbers.stream().sorted().toList();
        int middle = sortedNumbers.size() / 2;
        if (sortedNumbers.size() % 2 == 0) {
            return (sortedNumbers.get(middle - 1) + sortedNumbers.get(middle)) / 2.0;
        } else {
            return sortedNumbers.get(middle);
        }
    }

    private static double task_45_calculateStandardDeviation(List<Double> numbers) {
        double average = task_45_calculateAverage(numbers);
        double variance = numbers.stream()
                .mapToDouble(n -> Math.pow(n - average, 2))
                .average()
                .orElse(0.0);
        return Math.sqrt(variance);
    }

    private static class task_75_Task {
        String name;
        String assignedTo;

        task_75_Task(String name) {
            this.name = name;
            this.assignedTo = "";
        }

        void assignTo(String person) {
            this.assignedTo = person;
        }
    }

    private static class task_75_ProjectManagement {
        List<task_75_Task> tasks = new ArrayList<>();

        void addTask(task_75_Task task) {
            tasks.add(task);
        }

        void assignTasks(Consumer<task_75_Task> assignStrategy) {
            tasks.forEach(assignStrategy);
        }

        void printTasks() {
            tasks.forEach(task -> System.out.println(task.name + " приписаний до " + task.assignedTo));
        }
    }
}
