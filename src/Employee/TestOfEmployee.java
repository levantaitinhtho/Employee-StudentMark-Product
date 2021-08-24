package Employee;

public class TestOfEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.getInfo();

        Employee employee2 = new Employee("A","VanTai","QuangNgai","CEO",45000000);
        employee1.show();
        employee2.show();
    }
}
