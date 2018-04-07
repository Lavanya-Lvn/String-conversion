import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		String s1;
		int a,b;
		char h;
		System.out.println("enter a string::");
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
		//String s="welcome to valuelabs";
       char c[]=s.toCharArray();
       int length=c.length;
       System.out.println("length of string is"+length);
       for(int i=0;i<length;i++){
    	   if(c[i]=='l'){
               a=(int)c[i];    		   
                b=a-32;
                h=(char)b;
                c[i]=h;
    	   }
    	   else
    		   c[i]=c[i];
       }
       String str=String.valueOf(c);
       System.out.println("output string is:::"+str);
	}

}
