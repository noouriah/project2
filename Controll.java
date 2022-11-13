import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Controll {
    Patient[] patients;
    private int numOfPatients;
    public Controll() throws FileNotFoundException{
        patients=new Patient[10];
        numOfPatients=0;
        readPatientFile();

    }


    public boolean addNewPatient(String idType,String name, String gender, String phoneNumber, int age,String maritalStatus)
    {
        if (numOfPatients<patients.length) {
          Patient b=new Patient(idType,name, gender, phoneNumber,age, maritalStatus);
            patients[numOfPatients]=b;
            numOfPatients++;
           Patient.counter++;
            return true;
        }else return false;

    }
    public boolean checkForDuplicate(Patient b)
    {
        for (int i = 0; i <numOfPatients ; i++) {
            if (patients[i].equals(b))
                return true;
        }
        return false;
    }

    public Patient[] viewPatient()
    {
        return patients;
    }
    public Patient searchForPatient(String id)
    {
        int i=0;
        boolean found=false;

        while (!found&&i<patients.length)
        {
            if (patients[i]!=null)
            {
                if (patients[i].getIdType()==id)
                    found=true;
                else i++;

            }
            else i++;
        }
        if (i<patients.length)
            return patients[i];
        else
            return null;

    }
    public int searchForPatientIndex(String id)
    {
        int i=0;
        boolean found=false;

        while (!found&&i<patients.length)
        {
            if (patients[i]!=null)
            {
                if (patients[i].getIdType()==id)
                    found=true;
                else i++;

            }
            else i++;
        }
        if (i<patients.length)
            return i;
        else
            return -1;

    }
    public boolean editPatient(String id,String newName)
    {
        int index=  searchForPatientIndex(id);
        if (index!=-1)
        {
           patients[index].setName(newName);
            return true;
        }
        else return false;

    }
    public void readPatientFile()throws FileNotFoundException{
        Scanner input=new Scanner(new File("D:\\PatientFile.txt"));
       while (input.hasNext())
       {
           String i=input.next();
           String n=input.next();
           String g=input.next();
           String ph=input.next();
           int ag=input.nextInt();
           String ma=input.next();
           addNewPatient(i,n,g,ph,ag,ma);
       }
       input.close();
    }
    public void writePatientFile()throws FileNotFoundException{
        PrintWriter w= new PrintWriter(new File("D:\\PatientFile.txt"));
        for (int i = 0; i <numOfPatients ; i++) {
            w.write(patients[i].getIdType()+"   "+patients[i].getName()+"   "+patients[i].getGender()+"  "
            +patients[i].phoneNumber+"   "+patients[i].getAge()+"   "+patients[i].getMaritalStatus()+"\n");

        }
        w.close();
    }
}
