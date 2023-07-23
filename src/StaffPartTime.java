public class StaffPartTime extends Staff{
    private double working_hours;

    public StaffPartTime() {

    }

    public StaffPartTime(int id, String name, int age, int phone, String email, Address address, double working_hours) {
        super(id, name, age, phone, email, address);
        this.working_hours = working_hours;
    }

    public double getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(double working_hours) {
        this.working_hours = working_hours;
    }
    public double getSalaryPartTime() {
        return (working_hours*100000);
    }

    @Override
    public String toString() {
        return super.toString()+
                " working_hours=" + working_hours+ " ]";
    }
}
