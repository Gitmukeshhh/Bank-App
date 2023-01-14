import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name");
        String name=scan.nextLine();
        System.out.println("entere passwored");
        String passwored =scan.nextLine();
        System.out.println("enter balences");
        double balance =scan.nextDouble();
        SBI LINK=new SBI(name,balance,passwored);

        String message= LINK.addMony(balance);
        System.out.println(message);

        System.out.println("enter amount you want  to witdraw");
        double mony=scan.nextDouble();
        System.out.println("enter your passwored");
        String pass=scan.next();
        System.out.println(LINK.withdrawMony(mony,pass));


    }
}