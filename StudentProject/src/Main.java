
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student();
		System.out.println(st1);
		Student st2=new Student(123,"Ivan",6);
		System.out.println(st2);
		st1.setFacNum(111);
//		Student.setFacNum(200);
		System.out.println(st1);
		st1 = st2;
		System.out.println(st1);
		System.out.println(st2);
		st2.setMark(5.65);
		System.out.println(st1);
		System.out.println(st2);
	}

}
