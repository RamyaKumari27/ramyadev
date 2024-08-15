package scripts;

public class demo1 {

	public static void main(String[] args) {
			{
				int no=292;
				int rev=0;
				int copy=no;
				while(no!=0)
				{
					int rem=no%10;
					rev=rev*10+rem;
					no=no/10;
					}
				if(copy==rev)
				{
					System.out.println("it is a no palindrome");
					}
				else
				{
					System.out.println("it is not a no palindrome");
				}
			}


	}
	}


