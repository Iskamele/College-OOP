package practice_01.Model;

public class Master extends Person {
    private String scientificWork;

    public Master(String name, int age, String scientificWork) {
        super(name, age);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public String getPersonalInfo() {
        return super.getPersonalInfo() + ", scientific work: " + getScientificWork();
    }
}
