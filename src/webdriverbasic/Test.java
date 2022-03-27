package webdriverbasic;

public class Test {

	public static void main(String[] args) {
		
	String S = "Hello Word";  // olleh drow
	
	String[] abc =S.split(" ");
	
	System.out.println(abc[0]);
	
	abc[0].length();
	
	for (int i =abc[0].length(); i<abc[0].length(); i--){
		
		System.out.println(i);
		System.out.println( abc[0].charAt(i));
		
	}
	
	
	System.out.println(abc[1]);
		
	}
	

}
