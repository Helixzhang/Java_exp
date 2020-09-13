package exp7;

public class exp7_1 {
    public static class AccountException extends Exception{
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public AccountException(String message) {
            super(message);
        }
    }
    public static class Account{
        private double balance = 0;
        public void deposit(double amount) throws AccountException {
            if(amount > 2000) {
                throw new AccountException("单笔交易金额不能大于2000");
            }
            this.balance += amount;
            System.out.println("成功存款："+amount);
        }

        public void withdraw(double amount) throws AccountException {
            if(amount > this.balance){
                throw new AccountException("取款不成功，余额不足！");
            }
            if(amount>2000) {
                throw new AccountException("单笔交易金额不能大于2000");
            }
            this.balance -= amount;
            System.out.println("成功取款："+amount);
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Account account_1 = new Account();
        Account account_2 = new Account();
        Account account_3 = new Account();

        try{  //成功
            account_1.deposit(2000);
            account_1.withdraw(2000);
        }catch (AccountException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("当前余额："+account_1.getBalance()+"\n");
        }

        try{  //异常1
            account_2.deposit(2000);
            account_2.withdraw(2001);
        }catch (AccountException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("当前余额："+account_2.getBalance()+"\n");
        }

        try{  //异常2
            account_3.deposit(3000);
        }catch (AccountException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("当前余额："+account_3.getBalance()+"\n");
        }
    }
}
