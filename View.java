import java.io.FileNotFoundException;
import java.util.Scanner;

public class View {
    private Controll c;
    private Scanner input;

    public View () throws FileNotFoundException{
        c=new Controll();
        input=new Scanner(System.in);

    }
    public void start()throws FileNotFoundException{
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("    Patients Reservation System");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    while (true)
    {
        System.out.println("1 add 2 view 3 search 4 edit 0 exiet");
        int chocies =input.nextInt();
        switch (chocies)
        {
            case 1:add();break;
            case 2:view();break;
            case 3:search();break;
            case 4:edit();break;
          //  case 0:c.

    }
    }}
    public void edit()
    {
        System.out.println("input ID of Patient:");
        String i=input.next();
        System.out.println("input new name of Patient:");
        String n=input.next();
        boolean edited= c.editPatient(i,n);
        if (edited)
            System.out.println("updated successfully");
        else System.out.println("no Patient with this id");

    }
    public void search()
    {
        System.out.println("input ID");
        String i=input.next();
        Patient s= c.searchForPatient(i);
        if(s!=null)
        {
            System.out.println("ID First Name Last Name Registration Year");
            System.out.println(s.getIdType()+"\t"+s.getName()
                    +"\t"+s.getGender()+"\t"+s.getAge());
        }
        else System.out.println("no Patient with this ID");

    }
    public void add() {
        System.out.println("ID First Name genderphoneNumber age  maritalStatus");
       String id=input.next();
       String name=input.next();
        String gen=input.next();
        String phone=input.next();
        int agee=input.nextInt();
        String mar=input.next();




        boolean duplicated = c.checkForDuplicate(new Patient(id,name,gen,phone,agee,mar));
        if (duplicated)
            System.out.println("there is already patient with this data");
        else {
            boolean added =c.addNewPatient(id,name,gen,phone,agee,mar);
            if (added)
                System.out.println("added successfully");
            else System.out.println("too mutch patient");
        }
    }
    public void view(){
        Patient[] all=c.viewPatient();
        System.out.println("ghjkl;kjn");
        for (int i = 0; i <all.length ; i++) {
            if(all[i]!=null)
                System.out.println(all[i].toString());

        }
    }


}
