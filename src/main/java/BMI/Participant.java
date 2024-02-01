package BMI;

public class Participant {
    private String name;
    private double BMI;

    public Participant(String name, double BMI) {
        this.name = name;
        this.BMI = BMI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", BMI=" + BMI +
                '}';
    }
}
