import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GSMStore {
	private ArrayList<GSMClass> gsms;

	public GSMStore() {
		super();
		// TODO Auto-generated constructor stub
		gsms = new ArrayList<>();
	}

	public GSMStore(ArrayList<GSMClass> gsms) {
		super();
		this.gsms = gsms;
	}

	public GSMStore(GSMClass[] gsms) {
		this(new ArrayList<>(Arrays.asList(gsms)));
	}
	
	public ArrayList<GSMClass> getGsms() {
		return gsms;
	}

	public void setGsms(ArrayList<GSMClass> gsms) {
		this.gsms = gsms;
	}

	@Override
	public String toString() {
		return "GSMStore [gsms=" + gsms + "]";
	}
	
	public void print() {
		System.out.println(Arrays.toString(gsms.toArray()));
	}
}
