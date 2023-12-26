import java.util.Scanner;

public class CheckPrimeOrNot {
	static boolean checkPrime(int n)
	{
		if (n<=1)
		{
			return false;
		}
		for(int i=2 ;i*i <=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(checkPrime(n))
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
		
			
		
	}
}
