package practice_03;

public class Main {

    public static void main(String[] args) {
        // 1 рівень
        Sortable sorter = new QuickSort();
        int[] array = {10, 7, 8, 9, 1, 5};
        int[] sortedArray = sorter.sort(array);

        // + 2 рівень
        Logger logger = new ConsoleLogger();
        logger.log("Відсортований масив:");
        for (int number : sortedArray) {
            System.out.print(number + " ");
        }
        System.out.println();

        logger.log("Демонстрація роботи ConsoleLogger завершена.");

        System.out.println();

        // 3 + 2 рівень
        GeometricShape rectangle = new Rectangle(10, 5);
        logger.log("Площа прямокутника: " + rectangle.area());
        logger.log("Периметр прямокутника: " + rectangle.perimeter());
    }
}
