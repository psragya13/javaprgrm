package javaquestion;

import java.util.Random;

public class javacodingquest {
	public static void main(String[] args) {
		Random rd = new Random();
	long a = 123456789;
	 int b = rd.nextInt(999);
	

     
	 String s1=Long.toString(a);    // converting long to String
     String s2=Long.toString(b);
    String s3=s1+s2;
     long l3=Long.valueOf(s3).longValue();    // converting String to long
     System.out.println(l3);
	
		
	 
	 
		int len=s3.length(); 
	    int arr[]=new int[len]; 
	    for(int i=0;i<s3.length();i++) 
	         arr[i]=Integer.valueOf(s3.charAt(i)+""); 
	     // output list of integers 
	        for(int i=0;i<arr.length;i++) 
	           System.out.print(arr[i]+" ");
	
	//it will add 13th number to it
	        
int[] CONTROL_VALUES = new int[] {
        2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9
    };

    int k = 0;
    for (int i = 0; i < 12; i++) {
    
        k += CONTROL_VALUES[i] * (i+1);
        
    }
    k %= 11;
    if (k == 10) {
        k = 1;
    }
    System.out.println("/n");
    System.out.println("The 13th digit which will be added to our number is "+k);
   
	System.out.println("The final 13 digit number is "+s3);
	
}
}
