import java.util.*;
public class commonMultiplesOfn1andn2 {
	static void commonMultiples(int a,int b)
	{
		
			for(int i=a;i>=1;i--)
			{
				if(a%i==0 && b%i==0)
				{
					System.out.println(i);
					break;//HCF
					
					
				}
			}
		
	
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		int b=scan.nextInt();
		
		commonMultiples(a,b);
		
	}

}
