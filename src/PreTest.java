
public class PreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			UpperClass u = new UpperClass("Jay Z", 46, "Do I look like a mind reader, sir? I don't know");
			//BAD System.out.println(u.numBoats);
			int t = (int) (-u.getAge()+People.AVERAGE_AGE);
			u.setAge(t);
			System.out.print(u.getAge());
	}

}
