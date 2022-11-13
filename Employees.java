public class Employees extends Parson {
    private double salary;


    public Employees(String name, String gender, String phoneNumber, int age) {
        super(name, gender, phoneNumber, age);
        this.salary=salary;
    }

    @Override
    public String toString() {
       String fullInfo=super.toString()+
         "Employees{" +
                "salary=" + salary +
                '}';
       return fullInfo;
    }
}
