
public class Q10 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(5);
		String s="";
		
		if (sb.equals(s)) {
			System.out.println("A");
		} else if (sb.toString().equals(s.toString())) {
			System.out.println("b");
		} else {
			System.out.println("c");
		}
	}
}
