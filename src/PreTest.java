
public class PreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			UpperClass u = new UpperClass("Jay Z", 46, "Do I look like a mind reader, sir? I don't know");
			UpperClass.setNumRichPeople(100);
			UpperClass v = new UpperClass();
			UpperClass w = new UpperClass("Me", 42, 200, 200);
			int t = (int) (-u.getAge()+People.AVERAGE_AGE);
			u.setAge(t);
			//System.out.println(u.numBoats);
			System.out.println(u.getAge());
			System.out.println(u.getNumRichPeople());
	}
}
