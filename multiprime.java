package haneena;
import java.util.Scanner;
class multiplication extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+"5"+(1*5));
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("interrupted");
		}
	}
}
class prime extends Thread
{
	public void run()
	{
		int j,limit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		limit=sc.nextInt();
		try
		{
			int n=2,i=1;
			while(i<=limit)
			{
				int l=1;
				for(j=2;j<n;j++)
				{
					if(n%j==0)
					{
						l=0;
						break;
					}
				}
		if(l==1)
		{
			i++;
			System.out.println("prime Number:"+n);
		}
		n++;
		Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("interrupted");
		}
	}
}

public class multiprime {

	public static void main(String[] args) {
		multiplication m=new multiplication();
		prime p=new prime();
		m.start();
		p.start();

	}

}
