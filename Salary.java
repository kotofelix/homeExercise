package homeExerciseIsupov;

public class Salary implements MailContent<Integer>{
    String from;
    String to;
    int salary;

    public Salary(String from, String to, int salary) {
        this.from = from;
        this.to = to;
        this.salary = salary;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public Integer getMailContent() {
        return this.getSalary();
    }
}
