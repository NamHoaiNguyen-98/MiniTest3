import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStaff staff = new ManagerStaff();
        int choice;
        do {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Menu");
            System.out.println("1.  AddStaffFullTime");
            System.out.println("2.  AddStaffPartTime");
            System.out.println("3.  UpdateStaff");
            System.out.println("4.  DeleteStaff");
            System.out.println("5.  DisplayListStaff");
            System.out.println("6.  SalaryFullTimeOfOneStaff");
            System.out.println("7.  SalaryPartTimeOfOneStaff");
            System.out.println("8.  ListSalaryFullTime");
            System.out.println("9.  ListSalaryPartTime");
            System.out.println("10. TotalSalaryFullTime");
            System.out.println("11. TotalSalaryPartTime");
            System.out.println("12. AverageSalary");
            System.out.println("13. ListStaffFullTimeIsSalaryLessThanAverageSalary");
            System.out.println("14. SortSalaryStaffFullTimeByAsCenDing");
            System.out.println("0. Exit ");
            System.out.println("Enter choice:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    staff.addStaffFullTime();
                    break;
                case 2:
                    staff.addStaffPartTime();
                    break;
                case 3:
                    staff.updateStaff();
                    break;
                case 4:
                    staff.deleteStaff();
                    break;
                case 5:
                    staff.displayListStaff();
                    break;
                case 6:
                    staff.salaryFullTimeOfOneStaff();
                    break;
                case 7:
                    staff.salaryPartTimeOfOneStaff();
                    break;
                case 8:
                    staff.listSalaryFullTime();
                    break;
                case 9:
                    staff.listSalaryPartTime();
                    break;
                case 10:
                    System.out.println(staff.totalSalaryFullTime());
                    break;
                case 11:
                    System.out.println(staff.totalSalaryPartTime());
                    break;
                case 12:
                    System.out.println(staff.averageSalary());
                    break;
                case 13:
                    staff.listStaffFullTimeIsSalaryLessThanAverageSalary();
                    break;
                case 14:
                    staff.sortSalaryStaffFullTimeByAsCenDing();
                    break;
            }
        } while (choice != 0);


    }
}
