import java.util.Scanner;


public class revers {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
System.out.println("enter the no");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int rev = 0;
while(num!=0)
{
 rev=(rev*10)+num%10;
num=num/10;

	}
System.out.println("" +rev);

	}
}
