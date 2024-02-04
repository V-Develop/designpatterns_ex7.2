public class App {
    public static void main(String[] args) {
        EmployeeComponent ceo = new Employee("Settha", "CEO", 500000);

        EmployeeComponent headsale = new Employee("Kamphaka", "Head Sales", 300000);
        EmployeeComponent saleSubordinate1 = new Employee("Wiroj", "Sales", 150000);
        EmployeeComponent saleSubordinate2 = new Employee("Weeranan", "Sales", 100000);
        headsale.addSubordinate(saleSubordinate1);
        headsale.addSubordinate(saleSubordinate2);

        EmployeeComponent headMarketing = new Employee("UngInk", "Head Marketing", 300000);
        EmployeeComponent marketingSubordinate1 = new Employee("Oak", "Marketing", 200000);
        EmployeeComponent marketingSubordinate2 = new Employee("Aem", "Marketing", 250000);
        headMarketing.addSubordinate(marketingSubordinate1);
        headMarketing.addSubordinate(marketingSubordinate2);

        ceo.addSubordinate(headsale);
        ceo.addSubordinate(headMarketing);

        printAllEmployee(ceo);
    }

    public static void printAllEmployee(EmployeeComponent ceo) {
        ceo.showPersonelDetail();
    }
}
