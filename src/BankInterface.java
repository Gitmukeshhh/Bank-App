import java.nio.charset.CharsetEncoder;

public interface BankInterface {
    double checkBalance();
    String addMony(double amount);

    String withdrawMony(double amount,String passwored);
    double calculateInterest(int years);
}
