package ordersanditems;
import java.util.ArrayList;

public class TestOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		Item item4 = new Item();
		
		item1.setName("mocha");
		item1.setPrice(3.0);
		item2.setName("cappuchino");
		item2.setPrice(3.5);
		item3.setName("drip coffee");
		item3.setPrice(4.0);
		item4.setName("latte");
		item4.setPrice(3.2);
		
		
		Order order1 = new Order();
		Order order2 = new Order();
		Order order3 = new Order();
		Order order4 = new Order();
		
		order1.setName("Corey");
		order2.setName("Doreyy");
		order3.setName("BoBorey");
		order4.setName("Bloop");
		
		System.out.println(order1.getName());
		System.out.println(order1.isReady());
		
		System.out.println(order2.getName());
		System.out.println(order2.isReady());
		
		
		Order order5 = new Order("Ariele");
		Order order6 = new Order("Jason");
		Order order7 = new Order("Jimbo");
		
		System.out.println(order5.getName());
		System.out.println(order6.getName());
		System.out.println(order7.getName());
		
		order1.addItem(item1);
		order1.addItem(item2);
		order1.addItem(item3);
		
		order2.addItem(item3);
		order2.addItem(item2);
		order2.addItem(item1);
		
		order3.addItem(item4);
		order3.addItem(item4);
		order3.addItem(item4);
		
		order4.addItem(item2);
		order4.addItem(item2);
		order4.addItem(item2);
		
		order5.addItem(item1);
		order5.addItem(item1);
		order5.addItem(item1);
		order5.addItem(item1);
		
		order6.addItem(item3);
		order6.addItem(item3);
		order6.addItem(item2);
		
		order7.addItem(item4);
		order7.addItem(item4);
		order7.addItem(item4);
		order7.addItem(item4);
		order7.addItem(item4);
		
		System.out.println(order1.getStatusMessage());
		
		order1.setReady(true);
		
		System.out.println(order1.isReady());
		
		System.out.println(order7.getOrderTotal());
		
		
		order1.display();
	}

}
