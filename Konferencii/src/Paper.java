import java.util.Arrays;

enum STAGE {
	NEW,INPROCESS,APPROVED,REJECTED;
}

public abstract class Paper {
	public final static int KEY_COUNT = 4;
	protected String Title;
	protected String Annotation;
	protected String[] Keys;
	protected String Text;
	protected STAGE Stage;
	protected Organizer reviewer;
	
	public Organizer getReviewer() {
		return reviewer;
	}
	public void setReviewer(Organizer reviewer) {
		this.reviewer = reviewer;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String value){
		Title = value;
	}
	public String getAnnotation() {
		return Annotation;
	}
	public void setAnnotation(String value) {
		Annotation = value;
	}
	public String[] getKeys() {
		return Keys;
	}
	public void setKeys(String[] value) throws Exception {
		if (value.length > KEY_COUNT ) {
			throw new Exception("The size is not good");
		}
		for(int i=0; i<Keys.length;i++) {
			if (i < value.length) {
				Keys[i] = value[i];
			} else {
				Keys[i] = null;
			}
		}
	}
	public String getText() {
		return Text;
	}
	public void setText(String value) {
		Text = value;
	}
	public String getStage() {
		return Stage.toString();
	}
	public void setStage(STAGE value) {
		Stage = value;
	}
	
	public Paper (String Title, String Annotation, String[] Keys, 
			String Text) throws Exception {
		this.Title = Title;
		this.Annotation = Annotation;
		this.Keys = new String[KEY_COUNT];
		
//		if (Keys.length > KEY_COUNT) {
//			throw new Exception("The array size is wrong");
//		}
//		for (int i=0;i<Keys.length;i++) {
//			this.Keys[i] = Keys[i];
//		}
		setKeys(Keys);
		this.Text = Text;
	}
	
	public void getStatus() {
		System.out.println("Paper status is "+Stage);
	}
	@Override
	public String toString() {
		return "Paper [Title=" + Title + ", Annotation=" + Annotation
				+ ", Keys=" + Arrays.toString(Keys) + ", Text=" + Text
				+ ", Stage=" + Stage + ", reviewer=" + reviewer + "]";
	}
	
}
