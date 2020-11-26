package classdemo;

import java.util.Scanner;

public class PizzaAppApplicationStartup {	
		public static String pizzaName;
		public static String size;
		public static String crust;
		public static String toppings;
		public static double price;
		public static boolean addToppings;
		

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pizza Name : ");
		pizzaName=sc.nextLine();
		System.out.println("Choose the Size of Pizza (Regular|Medium|Large) : ");
		size=sc.nextLine();
		System.out.println("Choose Crust of Pizza : ");
		crust=sc.nextLine();
		System.out.println("Do you want to add topping? ");
		addToppings=sc.nextBoolean();
		if(addToppings)
		{
			
			System.out.println("Veg Toppings : Jalapeno | Black Olive | Onion | Red Peprika | Fresh Tomato | Golden Corn | Crisp Capsicum | Paneer | Grilled Mushroom | Paneer Tikka");
			System.out.println("Non Veg Toppings : Pepper Barbeque Chicken | Peri Peri Chicken | Grilled Chicken Rusher | Grilled Chicken Sausage | Chicken Tikka | Chicken Peproni | Chicken Keema");
			System.out.println("Choose Toppings : ");
			toppings=sc.next();
			orderPizza(pizzaName,size,crust);
			price+=60;
		}
		else
		{
			orderPizza(pizzaName,size,crust);
		}
		
		displayOrder(pizzaName,size,crust,price);
		
		
	}


	private static void displayOrder(String pizzaName, String size, String crust, double price) {
		System.out.println("Pizza Name : "+pizzaName);
		System.out.println("Size : "+size);
		System.out.println("Crust : "+crust);
		System.out.println("Added toppings : "+toppings);
		System.out.println("Total : "+price);
		
	}


	private static void orderPizza(String pizzaName, String size, String crust) {
		if(pizzaName.equals(PizzaConstants.DELUX_VEGGIE))
		{
			if(size.equals(PizzaConstants.REGULAR_SIZE))
			{
				if(crust.equals(PizzaConstants.NEW_HAND_TOSSED))
				{
					price=PizzaConstants.DELUX_VEGGIE_REGULAR_NEW_HAND_TOSSED;
				}
				else if(crust.equals(PizzaConstants.CHEESE_BURST))
				{
					price=PizzaConstants.DELUX_VEGGIE_REGULAR_CHEESE_BURST;
				}
				else
				{
					price=PizzaConstants.DELUX_VEGGIE_REGULAR_FRESH_PAN_PIZZA;
				}
			}
			else if(size.equals(PizzaConstants.MEDIUM_SIZE))
			{
				if(crust.equals(PizzaConstants.NEW_HAND_TOSSED))
				{
					price=PizzaConstants.DELUX_VEGGIE_MEDIUM_NEW_HAND_TOSSED;
				}
				else if(crust.equals(PizzaConstants.CHEESE_BURST))
				{
					price=PizzaConstants.DELUX_VEGGIE_MEDIUM_CHEESE_BURST;
				}
				else
				{
					price=PizzaConstants.DELUX_VEGGIE_MEDIUM_FRESH_PAN_PIZZA;
				}
			}
			else
			{
				if(crust.equals(PizzaConstants.NEW_HAND_TOSSED))
				{
					price=PizzaConstants.DELUX_VEGGIE_LARGE_NEW_HAND_TOSSED;
				}
				else if(crust.equals(PizzaConstants.CHEESE_BURST))
				{
					price=PizzaConstants.DELUX_VEGGIE_LARGE_CHEESE_BURST;
				}
				else
				{
					price=PizzaConstants.DELUX_VEGGIE_LARGE_FRESH_PAN_PIZZA;
				}
			}
		}
		else if(pizzaName.equals(PizzaConstants.VEG_EXTRAVAGANZA))
		{
			if(size.equals(PizzaConstants.REGULAR_SIZE))
			{
				if(crust.equals(PizzaConstants.NEW_HAND_TOSSED))
				{
					price=PizzaConstants.VEG_EXTRAVAGANZA_REGULAR_NEW_HAND_TOSSED;
				}
				else if(crust.equals(PizzaConstants.CHEESE_BURST))
				{
					price=PizzaConstants.VEG_EXTRAVAGANZA_REGULAR_CHEESE_BURST;
				}
				else
				{
					price=PizzaConstants.VEG_EXTRAVAGANZA_REGULAR_FRESH_PAN_PIZZA;
				}
			}
			else if(size.equals(PizzaConstants.MEDIUM_SIZE))
			{
				if(crust.equals(PizzaConstants.NEW_HAND_TOSSED))
				{
					price=PizzaConstants.VEG_EXTRAVAGANZA_MEDIUM_NEW_HAND_TOSSED;
				}
				else if(crust.equals(PizzaConstants.CHEESE_BURST))
				{
					price=PizzaConstants.VEG_EXTRAVAGANZA_MEDIUM_CHEESE_BURST;
				}
				else
				{
					price=PizzaConstants.VEG_EXTRAVAGANZA_MEDIUM_FRESH_PAN_PIZZA;
				}
			}
			else
			{
				if(crust.equals(PizzaConstants.NEW_HAND_TOSSED))
				{
					price=PizzaConstants.VEG_EXTRAVAGANZA_LARGE_NEW_HAND_TOSSED;
				}
				else if(crust.equals(PizzaConstants.CHEESE_BURST))
				{
					price=PizzaConstants.VEG_EXTRAVAGANZA_LARGE_CHEESE_BURST;
				}
				else
				{
					price=PizzaConstants.VEG_EXTRAVAGANZA_LARGE_FRESH_PAN_PIZZA;
				}
			}
			
		}
		else
		{
			if(size.equals(PizzaConstants.REGULAR_SIZE))
			{
				if(crust.equals(PizzaConstants.NEW_HAND_TOSSED))
				{
					price=PizzaConstants.FARMHOUSE_REGULAR_NEW_HAND_TOSSED;
				}
				else if(crust.equals(PizzaConstants.CHEESE_BURST))
				{
					price=PizzaConstants.FARMHOUSE_REGULAR_CHEESE_BURST;
				}
				else
				{
					price=PizzaConstants.FARMHOUSE_REGULAR_FRESH_PAN_PIZZA;
				}
			}
			else if(size.equals(PizzaConstants.MEDIUM_SIZE))
			{
				if(crust.equals(PizzaConstants.NEW_HAND_TOSSED))
				{
					price=PizzaConstants.FARMHOUSE_MEDIUM_NEW_HAND_TOSSED;
				}
				else if(crust.equals(PizzaConstants.CHEESE_BURST))
				{
					price=PizzaConstants.FARMHOUSE_MEDIUM_CHEESE_BURST;
				}
				else
				{
					price=PizzaConstants.FARMHOUSE_MEDIUM_FRESH_PAN_PIZZA;
				}
			}
			else
			{
				if(crust.equals(PizzaConstants.NEW_HAND_TOSSED))
				{
					price=PizzaConstants.FARMHOUSE_LARGE_NEW_HAND_TOSSED;
				}
				else if(crust.equals(PizzaConstants.CHEESE_BURST))
				{
					price=PizzaConstants.FARMHOUSE_LARGE_CHEESE_BURST;
				}
				else
				{
					price=PizzaConstants.FARMHOUSE_LARGE_FRESH_PAN_PIZZA;
				}
			}
		}
	}
}