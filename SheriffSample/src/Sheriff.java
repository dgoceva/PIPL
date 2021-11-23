import java.util.Random;

public class Sheriff extends Villain {
	public int Shoot(){
		Random result = new Random();
		if (getCartridge()==0)
			return 0;
		else {
			setCartridge(getCartridge()-1);
			return result.nextInt(81)+20;
		}
	}
}
