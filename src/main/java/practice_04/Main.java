package practice_04;

import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // Перший рівень
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java Mate Academy");
        removeIfContainsSubstring(list, "Java");
        System.out.println(list);

        // Другий рівень
        Library library = new Library();
        library.addBook(new Book("Mate Academy Java course", 10));
        library.addBook(new Book("Mate Academy Fullstack course", 15));
        System.out.println("Найпопулярніша книга: " + library.findMostPopularBook().getName());

        // Третій рівень
        LibraryFineCalculator calculator = new LibraryFineCalculator();
        System.out.println("Штрафу немає: "
                + calculator.calculatePenalty(0, "Звичайна книга"));
        System.out.println("Штраф за запізнення звичайної книги на 5 днів: "
                + calculator.calculatePenalty(5, "Звичайна книга")); // 7.5
        System.out.println("Штраф за запізнення старинної книги на 5 днів: "
                + calculator.calculatePenalty(10, "Старинна книга")); // 20
    }

    private static void removeIfContainsSubstring(List<String> list, String substring) {
        list.removeIf(s -> s.contains(substring));
    }
}