import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyRoster_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Department> departmentList = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if (input.length == 4){
             departmentList.add(new Department(new ArrayList<Employee>()));
            }if (input.length==5){
                if (input[3].contains("@")){
                    employeeList.add(new Employee(input[0],Double.parseDouble(input[1]),input[2],input[3],input[4] ));
                }else {
                    employeeList.add(new Employee(input[0],Double.parseDouble(input[1]),input[2],input[3],Integer.parseInt(input[4]) ));
                }
            }else {
                employeeList.add(new Employee(input[0],Double.parseDouble(input[1]),input[2],input[3],input[4],Integer.parseInt(input[5]) ));
            }
        }

    }

}

class Employee {
    String name;
    double salary;
    String position;
    String department;

    String email = "n/a";
    int age = -1;

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }
    public Employee(String name, double salary, String position, String department,String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;

    }
    public Employee(String name, double salary, String position, String department,int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;

    }

    public Employee(String name, double salary, String position, String department,String email,int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
class Department {
    List<Employee>employeeList;
    double averageSalary;

    public Department(List<Employee> employee) {
        employeeList = employee;
    }
    private void getAverageSalary(){
            int employeeCount = employeeList.size();
            double totalSalary = 0;
        for (int i = 0; i <employeeList.size() ; i++) {
            totalSalary += employeeList.get(i).salary;
        }
       this.averageSalary =  averageSalary/employeeCount;
    }
}
