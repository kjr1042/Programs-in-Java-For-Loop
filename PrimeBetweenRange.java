import java.util.Scanner;

public class PrimeBetweenRange {
	static boolean primeNumber(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i*i <=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 	
		int a= sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(primeNumber(i))
			{
				System.out.println(i);
			}
		}
		
		
		

	}

}
