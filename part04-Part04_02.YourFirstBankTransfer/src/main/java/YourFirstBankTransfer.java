
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account Matthewsaccount = new Account("Matthews account", 1000);
        Account myAccount = new Account ("My account", 0);
        Matthewsaccount.withdrawal(100.0);
        myAccount.deposit(100);
        System.out.println(Matthewsaccount);
        System.out.println(myAccount);
    }
}
