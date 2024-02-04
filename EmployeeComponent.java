import java.util.List;

interface EmployeeComponent {
    public String getName();

    public void setName(String name);

    public String getPosition();

    public void setPosition(String dept);

    public int getSalary();

    public void setSalary(int salary);

    public String toString();

    public void addSubordinate(EmployeeComponent subordinate);

    public void removeSubordinate(EmployeeComponent subordinate);

    public List<EmployeeComponent> getSubordinate();

    public void showPersonelDetail();
}
