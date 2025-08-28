public class bank {
    private int balance=10000;
    public void withdraaw(int amount) {
        if (amount > balance) {
            throw new insufficientbalanceexception("not enough balance");
        }
        else{
            balance-=amount;
            System.out.println("Withdrawal succesful,remaining balance "+balance);
        }
    }
}
