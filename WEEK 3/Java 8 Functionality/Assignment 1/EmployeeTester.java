import java.util.Arrays;
import java.util.List;

public class EmployeeTester {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "John", 5000),
            new Employee(2, "Jane", 6000),
            new Employee(3, "Jim", 7000)
        );

        employees.stream()
            .map(emp -> new Employee(emp.getId(), emp.getName(), Math.round(emp.getSalary() * 1.1)))
            .forEach(emp -> System.out.println(emp.getName() + ": " + emp.getSalary()));
    }
}
