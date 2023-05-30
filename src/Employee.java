public class Employee {
    private final String firstName;
    private final String lastName;
    private final String patronymic;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;
    private  double salary;
    // Констр за замовчуванням
    public Employee(){
        this.firstName = "Worker name";
        this.lastName = "Worker surname";
        this.patronymic = "Worker patronymic";


    }
    //Констр з усіма полями
    public Employee(String firstName, String lastName,String patronymic, String position,
    String email, String phoneNumber, int age, double salary) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.patronymic = patronymic;

        this.position = position;

        this.email = email;

        this.phoneNumber = phoneNumber;

        this.age = age;

        this.salary = salary;

}
// Констр для бухгалтера з фіксованою позиціею, робочим емейлом і номером
public Employee(String firstName, String lastName, String patronymic,int age,double salary ) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.patronymic = patronymic;

        this.position = "Accountant";

        this.email = "WorkMailAccountant@ukr.net";

        this.phoneNumber = "+38034050044";

        this.age = age;

        this.salary = salary;
}
// гет і сет
public String getFirstName() {
    return firstName;
}

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
// Метод, що показує всю інформацію
    public void ShowInfo(){
        System.out.println("Worker " + firstName+" "+lastName+" "+patronymic+" age is "+age+
                "\n"+"Works in a position "+position+" "+
                "\n"+"With salary "+salary+"  Email is "+ email+" phone number is "+ phoneNumber);
        System.out.println();










    }


}



