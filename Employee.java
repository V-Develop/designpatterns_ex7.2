import java.util.ArrayList;
import java.util.List;

public class Employee implements EmployeeComponent {
    private String name;
    private String position;
    private int salary;
    private List<EmployeeComponent> subordinate;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.subordinate = new ArrayList<EmployeeComponent>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String dept) {
        this.position = dept;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
    }

    @Override
    public void addSubordinate(EmployeeComponent subordinate) {
        this.subordinate.add(subordinate);
    }

    @Override
    public void removeSubordinate(EmployeeComponent subordinate) {
        this.subordinate.remove(subordinate);
    }

    @Override
    public List<EmployeeComponent> getSubordinate() {
        return this.subordinate;
    }

    @Override
    public void showPersonelDetail() {
        System.out.println(this.toString());
        showSubordinates(this.subordinate, 1);
    }

    public void showSubordinates(List<EmployeeComponent> subordinates, int depth) {
        for (EmployeeComponent subordinate : subordinates) {
            StringBuilder indent = new StringBuilder();
            for (int i = 0; i < depth; i++) {
                indent.append("     ");
            }
            System.out.println(indent.toString() + subordinate.toString());
            if (!subordinate.getSubordinate().isEmpty()) {
                showSubordinates(subordinate.getSubordinate(), depth + 1);
            }
        }
    }

}