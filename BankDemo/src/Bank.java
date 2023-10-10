public class Bank {
    private String name;
    private String city;
    private int number;

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public void print(){
        System.out.println(getName()+"\t"+getCity()+"\t"+getNumber());
    }

    public static void print(Bank bank){
        System.out.println(bank.getName()+"\t"+bank.getCity()+"\t"+bank.getNumber());
    }

    public Bank(String name, String city, int number){
        this.name = name;
        this.city = city;
        this.number = number;
    }
    public Bank(){
        this("","",0);
    }
}
