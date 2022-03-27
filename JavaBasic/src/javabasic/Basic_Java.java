package javabasic;

public class Basic_Java {
	
	public static int t;
	public static String y;
	public  int j;

	public static void main(String[] args) {
		
	add("ram", " niwas");	
   System.out.println(y);
          int x=9;
         
          System.out.println(x);
    
          
         int s=add(7,8);
          
        System.out.println(s+50); 
        
        
        
       // String y="eee";
        
        //Basic_Java     obj=new Basic_Java();
       
       // obj.sub();
        
    // String str=add("ram", " niwas")  ; 
     //System.out.println(str);
        
        
        
	}
	
	
	
	public static void  add(String  a,String  b){
		  y=a+b;
System.out.println(y);



}
	
	
	public static int  add(int a,int b){
		int z=a+b;
System.out.println(z);

return z;

}
	
	public static int  add(int a,int b,int c){
				int z=a+b+c;
		System.out.println(z);
		return z;
		
	}
	
	
	
	public static int  add(int a){
		int z=a;
System.out.println(z);
return z;

}
	
	public static String  add(String  a){
		String z=a;
System.out.println(z);
return z;

}
	
	
	
	
	
	public  void sub(){
		int a=9;
		int b=20;
		int z=b-a;
		System.out.println(z);
	}
	
	public  void sub1(){
		int a=9;
		int b=20;
		int z=b-a;
		System.out.println(z);
		
		add(a, b);
		sub();
	}
	
	
	
	

}
