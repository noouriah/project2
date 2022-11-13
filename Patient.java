public class Patient extends Parson{
    private String idType,maritalStatus;
    public static int counter=0;


    public Patient(String idType,String name, String gender, String phoneNumber, int age,String maritalStatus) {
        super(name, gender, phoneNumber, age);
        this.idType=idType;
        this.maritalStatus=maritalStatus;
    }

    @Override
    public String toString() {
       String fullInfo=super.toString()+"  "+"ID Type="+idType +"  "+"Marital Status="+maritalStatus;
       return fullInfo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Patient.counter = counter;
    }
}
