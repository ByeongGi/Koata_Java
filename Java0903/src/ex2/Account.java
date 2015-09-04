package ex2;

// @author kosta, 2015. 9. 3 , 오전 11:38:14 , Account 
public class Account {
    private int balance; // 예치금
    public void withdraw(int money){
        synchronized(this){
        if (balance>=money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= money;
        }
        }
    } // end withDraw()

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
