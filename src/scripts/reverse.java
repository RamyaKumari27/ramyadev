package scripts;

import org.testng.annotations.Test;

public class reverse {
@Test
	public void  demo1() {
		String s="ramya";
		String empty="";
		for(int i=4;i>=0;i--)
		{
			empty=empty+s.charAt(i);
		}
		System.out.println(empty);
	}

	}


