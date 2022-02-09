package ordersanditems;
import java.util.ArrayList;

public class TestOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		Item item4 = new Item();
		
		item1.name = "mocha";
		item1.price = 3.0;
		item2.name = "cappuchino";
		item2.price = 3.5;
		item3.name = "drip coffee";
		item3.price = 4.0;
		item4.name = "latte";
		item4.price = 3.2;
		
		
		Order order1 = new Order();
		Order order2 = new Order();
		Order order3 = new Order();
		Order order4 = new Order();
		
		order1.name = "Corey";
		order2.name = "Doreyy";
		order3.name = "BoBorey";
		order4.name = "Bloop";
		
		System.out.println(order1.name);
		System.out.println(order1.total);
		
		order2.items.add(item1);
		order2.total += item1.price;
		
		order3.items.add(item2);
		order3.total += item2.price;
		
		order4.items.add(item4);
		order4.total += item4.price;
		
		order1.ready = true;
		
		order2.items.add(item4);
		order2.items.add(item4);
		order2.ready = true;
		
		order3.ready = true;
		
		System.out.println(order2.name);
		System.out.println(order2.total);
		System.out.println(order2.ready);
		System.out.println(order2.items);
	}

}
