
import java.util.*;

public class ManagerStaff {
    Scanner scanner = new Scanner(System.in);
    List<Address> listAddress;
    List<Staff> listStaff;

    public ManagerStaff() {
        listAddress = new LinkedList<>();
        listAddress.add(new Address("Nam Định", "Nam Trực", "Nam Ninh", "18"));
        listAddress.add(new Address("Hà Nội", "Quốc Oai", "Nghĩa Hương", "29"));
        listAddress.add(new Address("Thái Bình", "Tiền Hải", "Yên Trung", "17"));
        listAddress.add(new Address("Sài Gòn", "Nhà Bè", "Nhà Tranh", "113"));
        listAddress.add(new Address("Hải Phòng", "Tiên Lãng", "Yên Bảng", "15"));
        listAddress.add(new Address("Nam Định", "Hải Hậu", "Hải Âu", "18"));

        listStaff = new LinkedList<>();
        StaffFullTime staff1 = new StaffFullTime(1, "Nam", 18, 888888, "Nam123@gmail.com", listAddress.get(0), 1000000, 3000000, 5000000);
        StaffFullTime staff2 = new StaffFullTime(2, "Phú", 30, 777777, "Phu123@gmail.com", listAddress.get(1), 1500000, 200000, 5000000);
        StaffFullTime staff3 = new StaffFullTime(3, "Thành", 15, 666666, "Thanh123@gmail.com", listAddress.get(2), 2000000, 200000, 5000000);
        StaffPartTime staff4 = new StaffPartTime(4, "Quang Anh", 16, 333333, "Quanganh123@gmail.com", listAddress.get(3), 15);
        StaffPartTime staff5 = new StaffPartTime(5, "Tài", 18, 2222222, "Tai@gmail.com", listAddress.get(4), 20);
        StaffPartTime staff6 = new StaffPartTime(6, "Việt Anh", 20, 111111, "VietAnh123@gmail.com", listAddress.get(5), 17);

        listStaff.add(staff1);
        listStaff.add(staff2);
        listStaff.add(staff3);
        listStaff.add(staff4);
        listStaff.add(staff5);
        listStaff.add(staff6);
    }

    public void addStaffFullTime() {
        System.out.println("input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input name: ");
        String name = scanner.nextLine();
        System.out.println("input age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("input phone: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("input email: ");
        String email = scanner.nextLine();
        System.out.println("input province: ");
        String province = scanner.nextLine();
        System.out.println("input district: ");
        String district = scanner.nextLine();
        System.out.println("input wards: ");
        String wards = scanner.nextLine();
        System.out.println("input number_home");
        String number_home = scanner.nextLine();
        System.out.println("input bonus_salary: ");
        double bonus_salary = Double.parseDouble(scanner.nextLine());
        System.out.println("input fine_salary: ");
        double fine_salary = Double.parseDouble(scanner.nextLine());
        System.out.println("input hard_salary: ");
        double hard_salary = Double.parseDouble(scanner.nextLine());
        Address address = new Address(province, district, wards, number_home);
        StaffFullTime staffFullTime = new StaffFullTime(id, name, age, phone, email, address, bonus_salary, fine_salary, hard_salary);
        listStaff.add(staffFullTime);
        System.out.println("Add successfully!!");
    }

    public void addStaffPartTime() {
        System.out.println("input id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("input name: ");
        String name = scanner.nextLine();
        System.out.println("input age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("input phone: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("input email: ");
        String email = scanner.nextLine();
        System.out.println("input province: ");
        String province = scanner.nextLine();
        System.out.println("input district: ");
        String district = scanner.nextLine();
        System.out.println("input wards: ");
        String wards = scanner.nextLine();
        System.out.println("input number_home");
        String number_home = scanner.nextLine();
        System.out.println("input works_hours: ");
        double works_hours = Double.parseDouble(scanner.nextLine());
        Address address = new Address(province, district, wards, number_home);
        StaffPartTime staffPartTime = new StaffPartTime(id, name, age, phone, email, address, works_hours);
        listStaff.add(staffPartTime);
        System.out.println("Add successfully!!");
    }


    public void updateStaff() {
        if (!listStaff.isEmpty()) {
            System.out.println("input idCheck: ");
            int idCheck = Integer.parseInt(scanner.nextLine());
            int index = getId(idCheck);
            if (index != -1) {
                if (listStaff.get(index) instanceof StaffFullTime || listStaff.get(index) instanceof StaffPartTime) {
                    System.out.println("input newId");
                    String id = scanner.nextLine();
                    if (!id.isEmpty()) {
                        int newId = Integer.parseInt(id);
                        listStaff.get(index).setId(newId);
                    }
                    System.out.println("input newName");
                    String newName = scanner.nextLine();
                    if (!newName.isEmpty()) {
                        listStaff.get(index).setName(newName);
                    }
                    System.out.println("input newAge");
                    String age = scanner.nextLine();
                    if (!age.isEmpty()) {
                        int newAge = Integer.parseInt(age);
                        listStaff.get(index).setAge(newAge);
                    }
                    System.out.println("input newPhone");
                    String phone = scanner.nextLine();
                    if (!phone.isEmpty()) {
                        int newPhone = Integer.parseInt(phone);
                        listStaff.get(index).setPhone(newPhone);
                    }
                    System.out.println("input newEmail");
                    String newEmail = scanner.nextLine();
                    if (!newEmail.isEmpty()) {
                        listStaff.get(index).setEmail(newEmail);
                    }
                    System.out.println("input newProvince");
                    String newProvince = scanner.nextLine();
                    if (!newProvince.isEmpty()) {
                        listAddress.get(index).setProvince(newProvince);
                    }
                    System.out.println("input newDistrict");
                    String newDistrict = scanner.nextLine();
                    if (!newDistrict.isEmpty()) {
                        listAddress.get(index).setDistrict(newDistrict);
                    }
                    System.out.println("input newWards");
                    String newWards = scanner.nextLine();
                    if (!newWards.isEmpty()) {
                        listAddress.get(index).setWards(newWards);
                    }
                    System.out.println("input newNumber_home");
                    String newNumber_home = scanner.nextLine();
                    if (!newNumber_home.isEmpty()) {
                        listAddress.get(index).setNumber_home(newNumber_home);
                    }
                    System.out.println("input newBonus_salary");
                    String bonus_salary = scanner.nextLine();
                    if (!bonus_salary.isEmpty()) {
                        double newBonus_salary = Double.parseDouble(bonus_salary);
                        ((StaffFullTime) listStaff.get(index)).setBonus_salary(newBonus_salary);
                    }
                    System.out.println("input newFine_salary");
                    String fine_salary = scanner.nextLine();
                    if (!fine_salary.isEmpty()) {
                        double newFine_salary = Double.parseDouble(fine_salary);
                        ((StaffFullTime) listStaff.get(index)).setFine_salary(newFine_salary);
                    }
                    System.out.println("input newHard_salary");
                    String hard_salary = scanner.nextLine();
                    if (!hard_salary.isEmpty()) {
                        double newHard_salary = Double.parseDouble(hard_salary);
                        ((StaffFullTime) listStaff.get(index)).setFine_salary(newHard_salary);
                    }

                    System.out.println("input newWorks_hours");
                    String works_hours = scanner.nextLine();
                    if (!works_hours.isEmpty()) {
                        double newWorks_hours = Double.parseDouble(works_hours);
                        ((StaffPartTime) listStaff.get(index)).setWorking_hours(newWorks_hours);
                    }
                    System.out.println("Update successfully!");
                }
            } else {
                System.out.println("id does not exist!");
            }
        } else{
            System.out.println("list staff is empty!");
        }

    }

    public void deleteStaff() {
        if (!listStaff.isEmpty()) {
            System.out.println("input idCheck: ");
            int idCheck = Integer.parseInt(scanner.nextLine());
            int index = getId(idCheck);
            if (index != -1) {
                listStaff.remove(index);
                System.out.println("Delete successfully!");
            } else {
                System.out.println("id does not exist!");
            }
        } else {
            System.out.println("list staff is empty!");
        }
    }


    public void displayListStaff() {
        for (Staff staff : listStaff) {
            System.out.println(staff);
        }

    }

    public void salaryFullTimeOfOneStaff() {
        System.out.println("input idCheck");
        int idCheck = Integer.parseInt(scanner.nextLine());
        int index = getId(idCheck);
        if (index != -1) {
            if (listStaff.get(index) instanceof StaffFullTime) {
                System.out.print(listStaff.get(index).getName()+" :");
                System.out.println( ((StaffFullTime) listStaff.get(index)).getSalaryFullTime());
            } else {
                System.out.println("id does not exist");
            }
        } else {
            System.out.println("id does not exist");
        }
    }

    public void salaryPartTimeOfOneStaff() {
        System.out.println("input idCheck");
        int idCheck = Integer.parseInt(scanner.nextLine());
        int index = getId(idCheck);
        if (index != -1) {
            if (listStaff.get(index) instanceof StaffPartTime) {
                System.out.print(listStaff.get(index).getName()+" :");
                System.out.println(((StaffPartTime) listStaff.get(index)).getSalaryPartTime());
            } else {
                System.out.println("id does not exist");
            }
        } else {
            System.out.println("id does not exist");
        }

    }

    public void listSalaryFullTime() {
        for (Staff staff : listStaff) {
            if (staff instanceof StaffFullTime) {
                System.out.println(staff.getName() + " :" + ((StaffFullTime) staff).getSalaryFullTime());
            }

        }
    }

    public void listSalaryPartTime() {
        for (Staff staff : listStaff) {
            if (staff instanceof StaffPartTime) {
                System.out.println(staff.getName() + " :" + ((StaffPartTime) staff).getSalaryPartTime());
            }
        }
    }

    public double totalSalaryFullTime() {
        double total = 0;
        for (Staff staff : listStaff) {
            if (staff instanceof StaffFullTime) {
                total += ((StaffFullTime) staff).getSalaryFullTime();
            }
        }
        return total;
    }

    public double totalSalaryPartTime() {
        double total = 0;
        for (Staff staff : listStaff) {
            if (staff instanceof StaffPartTime) {
                total += ((StaffPartTime) staff).getSalaryPartTime();
            }
        }
        return total;
    }

    public double averageSalary() {
        return (totalSalaryFullTime() + totalSalaryPartTime()) / listStaff.size();
    }

    public void listStaffFullTimeIsSalaryLessThanAverageSalary() {
        for (Staff staff : listStaff) {
            if (staff instanceof StaffFullTime) {
                if ((((StaffFullTime) staff).getSalaryFullTime() < this.averageSalary())) {
                    System.out.println(staff);
                }
            }
        }
    }

    public void sortSalaryStaffFullTimeByAsCenDing() {
        List<StaffFullTime> listStaffFullTime = new LinkedList<>();
        for (Staff staff : listStaff) {
            if (staff instanceof StaffFullTime) {
                listStaffFullTime.add(((StaffFullTime) staff));
            }
        }
        Collections.sort(listStaffFullTime);
        for (StaffFullTime staffFullTime : listStaffFullTime) {
            System.out.println(staffFullTime);
        }

    }

    private int getId(int id) {
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }


}

