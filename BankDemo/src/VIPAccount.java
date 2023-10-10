public class VIPAccount  extends Account {
    @Override
    public void reduceMoney(double money) {
        changeAmount(-money);
    }
}
