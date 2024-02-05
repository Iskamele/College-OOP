package practice_01.Model;

public class Bachelor extends Person {
    private double scholarship;

    public Bachelor(String name, int age, double scholarship) {
        super(name, age);
        this.scholarship = scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public double getScholarship() {
        return scholarship;
    }

    public double getScholarship(double coefficient) {
        return scholarship * coefficient;
    }

    @Override
    public String getPersonalInfo() {
        return super.getPersonalInfo() + ", scholarship: " + getScholarship();
    }
}
