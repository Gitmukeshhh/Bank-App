import java.util.Objects;
import java.util.UUID;

public class SBI implements BankInterface {
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private  double rateOfInterest;


    public SBI(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterest=6.5;
        this.accountNo=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }



    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMony(double amount) {

        balance+=amount;
        System.out.println("ADD BAL-->"+ balance);
        return "UPPDATE BALANCES";
    }

    @Override
    public String withdrawMony(double amount, String enterpasswored) {
         if(Objects.equals(password,enterpasswored)){
             if(amount>balance){
                 System.out.println(balance-amount);
                 return "sorry bro no mony";
             }else{
                 balance-=amount;
                 System.out.println("withdwaw-->"+ balance);
                 return "PAISA HE PASIA";
             }

         }else{
             return "WRONG Paswored";
         }
    }

    @Override
    public double calculateInterest(int years) {
        System.out.println("INTREST--->");
        return (balance*years*rateOfInterest)/100;
    }
}

