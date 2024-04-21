package practice_04;

public class LibraryFineCalculator {
    public double calculatePenalty(int daysLate, String category) {
        double penalty = 0.0;
        switch (category) {
            case "Звичайна книга":
                penalty = daysLate * 1.5;
                break;
            case "Старинна книга":
                penalty = daysLate * 2.0;
                break;
        }
        return penalty;
    }
}