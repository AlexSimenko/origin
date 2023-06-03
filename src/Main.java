import myPackage.SameName;
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee1 =new Employee("Volodimir", "Zelensky", "Oleksandrovich", "President",
                "President@Gmail.com", "+3805040540", 45, 200000);
        Employee employee2 = new Employee("Olexiy", "Reznikov", "Yurievich",54,2000);
    employee.setAge(20);
    employee.setEmail("MyMail@Gmail.com");
    employee.setPosition("Security worker");
    employee.setPhoneNumber("3805565454");
    employee.setSalary(2000);
    employee.ShowInfo();
    employee1.ShowInfo();
    employee2.ShowInfo();

    Car car = new Car();
    car.Start();

        SameName sameName = new SameName();

        SameName sameName1= new myPackage.again.SameName();

sameName.printClassName();
sameName1.printClassName();

        System.out.println("зміни в окремій гілці2");
        System.out.println("Зміни в гілці Сіменко");
    }


}