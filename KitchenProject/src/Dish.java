
public class Dish {
	private String name;
	private short measure;
	
	public String getName() {
		return name;
	}
	
	public void setName(String value) {
		name = value;
	}
	
	public short getMeasure() {
		return measure;
	}
	
	public void setMeasure(short measure) {
		if (measure>=100 && measure<=200) {
			this.measure = measure;
		}
	}
	
	public Dish() {
		this(null,(short)0);
	}
	public Dish(String name, short measure) {
		this.name = name;
		setMeasure(measure);
	}
	
	public int hashCode(){
		return super.hashCode();
	}
	
	public boolean equals(Object obj){
		if (obj==null)
			return false;
		if (!(obj instanceof Dish))
			return false;
		return name.equals(((Dish)obj).name);
	}
	
	@Override
	public String toString() {
		return "Dish [name=" + name + ", measure=" + measure + "]";
	}
	
	
}
