package selflearn;
import java.util.regex.*;

public class MyRegex {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("aba");							//Simple Search
		Matcher m=p.matcher("abababa");
		
		Pattern p1=Pattern.compile("\\w");							//Search using Metacharacters \\
		Matcher m1=p1.matcher("a 1 56 _Z");
		
		Pattern p2=Pattern.compile("[abc]");						//Search using Metacharacters []
		Matcher m2=p2.matcher("abc12bca22aabc");
		
		Pattern p3=Pattern.compile("0[xX][0-9a-fA-F]");				//Search using Quantifiers
		Matcher m3=p3.matcher("abc 0x9A 0xdc");
		
		Pattern p4=Pattern.compile("\\d+");							//Search using Quantifiers \\d+
		Matcher m4=p4.matcher("abc1 2245d 12");
		
		Pattern p5=Pattern.compile("proj1([^,])*");
		Matcher m5=p5.matcher("proj3.txt,proj1abc.pdf,proj1.txt,proj2.txt,proj1.java");
		while(m.find())
		{
			System.out.println(m.start());
		}
		System.out.println();
		while(m1.find())
		{
			System.out.println(m1.start());
		}
		System.out.println();
		while(m2.find())
		{
			System.out.println(m2.start());
		}
		System.out.println();
		while(m3.find())
		{
			System.out.println(m3.start());
		}
		System.out.println();
		while(m4.find())
		{
			System.out.println(m4.start());
		}
		System.out.println();
		while(m5.find())
		{
		System.out.println(m5.start());
		}



	}

}
