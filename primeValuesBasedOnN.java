import java.util.Scanner;

public class primeValuesBasedOnN {
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
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int count =0;
		for(int i=1;count<n;i++)
		{
			if(checkPrime(i))
			{
				System.out.println(i);
				count++;
			}
		}

	}

}
