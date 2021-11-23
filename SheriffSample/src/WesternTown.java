
public class WesternTown {

	private String city;
	private short year;
	private int bars;
	private int sheriffs;
	
	public WesternTown() {
		// TODO Auto-generated constructor stub
		this("West America",(short)1850,2,1);
	}
	public WesternTown(String city, short year, int bars, 
			int sheriffs) {
		this.city = city;
		this.year = year;
		this.bars = bars;
		this.sheriffs = sheriffs;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short value) {
		year = value;
	}
	public int getBars() {
		return bars;
	}
	public void setBars(int bars) {
		this.bars = bars;
	}
	public int getSheriffs() {
		return sheriffs;
	}
	public void setSheriffs(int value) {
		sheriffs = value;
	}

}
