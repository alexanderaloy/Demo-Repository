package packagePush;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s = "Alex";
	String s1 = "Alex";
    String s2 = new String("alex");
    System.out.println("Output of Compare string using Equals method is "+s1.equals(s2)+"\n" +"Output of Compare string using Equals Ignorecase method is "+s1.equalsIgnoreCase(s2));
    System.out.println("abc"+s==s1);
    System.out.println(s1==s2);
	}

}
