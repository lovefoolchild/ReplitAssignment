package encapsulation;

/* Create Class Account:
    Create the below variables:
        - acc_no;
        - name;
        - email;
        - double amount;
    Create the getter/setter methods for each variable.

    In Main Class and the main method.
    Using setter methods assign the values as:
    acc_no = 7560504000
    name = Sumair
    email = sumair@syntax.com
    amount = 50000.0
    Using getter methods print the values as below output.

    **Expected Output:**
    7560504000 Sumair sumair@syntax.com 50000.0
 */
public class Account {
    private String acc_no;
    private String name;
    private String email;
    private double amount;

    public Account(String acc_no, String name, String email, double amount){
        this.acc_no=acc_no;
        this.name=name;
        this.email=email;
        this.amount=amount;
    }

    public String setAcc_No(String acc_no){
        return acc_no;
    }

    public String setName(String name){
        return name;
    }

    public String setEmail(String email){
        return email;
    }

    public double setAmount(double amount){
        return amount;
    }

    public String getAcc_No(){
        return acc_no;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public double getAmount(){
        return amount;
    }
}

class MainAccount {
    public static void main(String[] args) {
        Account acct = new Account("7560504000", "Sumair", "sumair@syntax.com", 50000.0);
        System.out.println(acct.getAcc_No()+" "+acct.getName()+" "+acct.getEmail()+" "+acct.getAmount());
    }
}