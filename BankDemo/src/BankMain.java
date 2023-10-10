public class BankMain {
    public static void main(String[] args){
        VIPAccount acc1 = new VIPAccount();
        acc1.reduceMoney(5000);
        System.out.println("number: "+acc1.getAccountNumber()+
                ", bank: ");
//        acc1.getBank().print();
        System.out.println(", money: "+acc1.getMoney());
    }
}
