package classdemo;

public class LoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		int parrot=1000;
		int year=0;
		while(parrot<=1500)
		{
			parrot=parrot+40;
			year++;
		}
		System.out.println("Population first exceeds 1500 in "+year+" years");
	}

}
