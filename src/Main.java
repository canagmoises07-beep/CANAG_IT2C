import java.util.Scanner;
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("+===PORTFOLIO OF ACTIVITY==+");
    System.out.println("|Name: CANAG, MOISES III R.|");
    System.out.println("|SECTION/YEAR: IT2C        |");
    System.out.println("+==========CONTENT=========+");
    System.out.println("| 1. ACTIVITY 1            |");
    System.out.println("| 2. ACTIVITY 2            |");
    System.out.println("+==========================+");
    System.out.print("| Enter Selection: ");
    int select = sc.nextInt();
    System.out.println("----------------------------");

    if(select == 1) {
        Activity1 act1 = new Activity1();
        act1.userGreetings();
    }else if(select == 2){
           Activity2 act2 = new Activity2();
           act2.run();

    }else{
        System.out.println("Selection not Found!");

    }

}