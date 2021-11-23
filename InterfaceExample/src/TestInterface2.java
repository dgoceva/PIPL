
public class TestInterface2 {
	public static void main(){  
		Bank b=new SBI();  
		System.out.println("ROI: "+b.rateOfInterest());  
		b=new PNB();
		System.out.println("ROI: "+b.rateOfInterest());
	}
}
interface Bank{  
	float rateOfInterest();  
}  
class SBI implements Bank{  
	public float rateOfInterest(){return 9.15f;}  
}  
class PNB implements Bank{  
	public float rateOfInterest(){return 9.7f;}  
}  

