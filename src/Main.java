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
        System.out.println("how musch moy you want to add");
        double monyA=scan.nextInt();

        String message= LINK.addMony(monyA);
        System.out.println(message);

        System.out.println("enter amount you want  to witdraw");
        double monyW=scan.nextDouble();
        System.out.println("enter your passwored");
        String pass=scan.next();
        System.out.println(LINK.withdrawMony(monyW,pass));
        System.out.println(LINK.calculateInterest(10));
        System.out.println("ACCOUNT NO--->"+LINK.getAccountNo());


    }
}