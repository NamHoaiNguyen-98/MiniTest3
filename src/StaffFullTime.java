public class StaffFullTime extends Staff implements Comparable<StaffFullTime> {
    private double bonus_salary;
    private double fine_salary;
    private double hard_salary;

    public StaffFullTime() {
    }

    public StaffFullTime(int id, String name, int age, int phone, String email, Address address, double bonus_salary, double fine_salary, double hard_salary) {
        super(id, name, age, phone, email, address);
        this.bonus_salary = bonus_salary;
        this.fine_salary = fine_salary;
        this.hard_salary = hard_salary;
    }

    public double getBonus_salary() {
        return bonus_salary;
    }

    public void setBonus_salary(double bonus_salary) {
        this.bonus_salary = bonus_salary;
    }

    public double getFine_salary() {
        return fine_salary;
    }

    public void setFine_salary(double fine_salary) {
        this.fine_salary = fine_salary;
    }

    public double getHard_salary() {
        return hard_salary;
    }

    public void setHard_salary(double hard_salary) {
        this.hard_salary = hard_salary;
    }

    public double getSalaryFullTime() {
        return (hard_salary + bonus_salary - fine_salary);
    }

    @Override
    public String toString() {
        return super.toString() +
                " bonus_salary=" + bonus_salary +
                ", fine_salary=" + fine_salary +
                ", hard_salary=" + hard_salary + " ]";
    }

    @Override
    public int compareTo(StaffFullTime staffFullTime) {
       return Double.compare(this.getSalaryFullTime(),staffFullTime.getSalaryFullTime());
    }
}
