package practice_04;

public class Book {
    private String name;
    private int issueCount;

    public Book(String name, int issueCount) {
        this.name = name;
        this.issueCount = issueCount;
    }

    public String getName() {
        return name;
    }

    public int getIssueCount() {
        return issueCount;
    }
}