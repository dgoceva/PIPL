public class Account {
    private String accountNumber;
    private Bank bank;
    private double money;

    public Account(){
        money = 0;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public Bank getBank(){
        return bank;
    }

    protected double getMoney(){
        return money;
    }

    protected void changeAmount(double money){
        this.money += money;
    }

    protected  void addMoney(double money) throws MoneyException {
        if (money<=0) {
            throw new MoneyException("The amount should be greather than zero\n");
        }else {
            changeAmount(money);
        }
    }

    protected void reduceMoney(double money) throws MoneyException {
        if (this.money<money) {
            throw new MoneyException("Not enough money\n");
        }else {
            changeAmount(-money);
        }
    }
}
