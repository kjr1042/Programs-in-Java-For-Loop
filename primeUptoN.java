import java.util.*;

public class primeUptoN {
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
		
		
		for(int i=1;i<=n;i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i);
			}
		}
		
		
	}

}
