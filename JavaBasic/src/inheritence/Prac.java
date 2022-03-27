package inheritence;

import webdriverbasic.Header_Link;

public class Prac extends Header_Link{

	public static void main(String[] args) {
		//System.out.println(Header_Link.x);
		//Header_Link.x=56;
		//System.out.println(Header_Link.x);
		/*int val=Header_Link.getval();
		System.out.println(val);
		Header_Link.setval(80);
		 val=Header_Link.getval();
		System.out.println(val);*/
		
		int val=Header_Link.x;
		System.out.println(val);
		//Header_Link.x=56;
		System.out.println(val);
	}

}
