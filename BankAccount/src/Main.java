
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount uttamAccount = new BankAccount("12635645454", 243133.0, "Uttam M", "uttambav@gmail.com", "9679244057") ;
        System.out.println(uttamAccount.getAccountBalance());


        uttamAccount.withdrawBalance(100.0);
        uttamAccount.depositFunds(200.0);
        uttamAccount.withdrawBalance(50.35);


    }
}