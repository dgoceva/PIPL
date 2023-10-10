public class MoneyException extends Exception {
    public MoneyException(){
        System.out.println("Bad amount\n");
    }

    public MoneyException(String message){
        System.out.println(message);
    }
}
