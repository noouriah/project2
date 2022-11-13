public class Parson {
    protected String name,gender,phoneNumber;
    protected int age;

    public Parson(String name, String gender, String phoneNumber, int age) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    @Override
    public String toString() {
        String fullInfo=
                "{ name='" + name + "   "+
                ", gender='" + gender + "   " +
                ", phoneNumber='" + phoneNumber + "   " +
                ", age=" + age +
                '}';
        return fullInfo;
    }
}
