public class Day11_Q4 {

    public static void main(String[] args) {

        Account ac = new Account(500.45);
        ac.getBalance();
        ac.deposit(200);
        ac.withdraw(701);
        ac.getBalance();
    }

}

class Account{
    private double balance;

    Account(){
        //setting default balance as 1000
        this.balance=1000;
    }
    Account(double balance){
//        set a balance while creating an obj
        this.balance=balance;
    }

    public void getBalance(){
        System.out.println(balance);
    }

    public void withdraw(int amt){
        if(balance-amt<0||amt>balance){
            System.out.println("insufficient funds");
        }else {
            System.out.println("Withdraw of "+ amt+ " is successfull");
            this.balance=balance-amt;
            System.out.printf("Available balance is %.2f", balance);
        }


    }
    public void deposit(int amt){
        this.balance=balance+amt;
        System.out.println("Available balance is "+balance);

    }




}
