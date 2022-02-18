import java.util.Scanner; 
class Reversing_String 
{
	public static void main (String[] args) 
	{       
        	String str1, str2="";
        	char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String :");
		str1 = sc.nextLine();
       
      		System.out.println("Original word: "+str1);
       
      		for (int i=0; i<str1.length(); i++)
      		{
        		ch= str1.charAt(i); 
        		str2= ch+str2; 
      		}
      		System.out.println("Reversed word: "+ str2);
    }
}
 