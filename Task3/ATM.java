public class ATM {
    User u = new User();

    public void withdraw(float amount){

        if(amount > u.getBalance())
            System.out.println("Not enough balance");
        else {
            System.out.println(amount + " withdrawn");
            float remainBalance= u.getBalance() - amount;
            u.setBalance(remainBalance);
            System.out.println("Your current balance= " + u.getBalance());
        }
    }

    public void deposit(float amount){

        float newBalance = u.getBalance() + amount;
        u.setBalance(newBalance);
        System.out.println("Your current balance= " + u.getBalance());
    }

    public void checkBalance(){
        System.out.println("Your current balance= " + u.getBalance());
    }


}
