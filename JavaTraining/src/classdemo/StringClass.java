package classdemo;

public class StringClass {
	String myString;
	
	public StringClass(String myString)
	{
		this.myString=myString;
	}
	
	public int stringLength()									//Length
	{
		int len=0;
		for(char c:myString.toCharArray())
		{
			len++;
		}
		return len;
	}
	
	public char[] replaceString(char newChar,char oldChar)		//Replace
	{
		char[] charString=new char[stringLength()];
		int i=0;
		for(char ch:myString.toCharArray())
		{
			charString[i]=ch;
			i++;
		}
		for(i=0;i<stringLength();i++)
		{
			if(charString[i]==oldChar)
			{
				charString[i]=newChar;
			}
		}
		return charString;
	}
	
	public char[] subString1(int value)							//Substring
	{
		int val=value;
		int len=stringLength();
		char[] charString=new char[stringLength()];
		int i=0;
		for(char ch:myString.toCharArray())
		{
			charString[i]=ch;
			i++;
		}
		for(i=0;i<len;i++)
		{
			if(i<len-val)
			{
				charString[i]=charString[value];
				value++;
			}
			else
			{
				charString[i]='\0';
			}
		}
		return charString;
	}

	public static void main(String[] args) {
		StringClass myStringClass=new StringClass("satakshi");
		int length=myStringClass.stringLength();
		System.out.println(length);
		System.out.println(myStringClass.replaceString('A', 'a'));
		System.out.println(myStringClass.subString1(2));
	}

}
