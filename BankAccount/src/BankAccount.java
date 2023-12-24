public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    

    public void depositFunds(double depositAmount) {
        accountBalance +=depositAmount;
        System.out.println("Deposited Amount : "+ depositAmount + " Now balance is  : " + accountBalance);

    }
    public void withdrawBalance(double withdrawalAmount) {
        if (accountBalance -withdrawalAmount < 0) {
            System.out.println("Insufficient Funds. Cannot Withdraw");
            
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal Amount : " + withdrawalAmount + " Now balance is : " + accountBalance);
        }

    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}


