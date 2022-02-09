package ordersanditems;
import java.util.ArrayList;

public class Order {
	private String name;
	private boolean ready;
	private ArrayList<Item> items =new ArrayList<Item>();
	
	
	//constructors
	public Order() {
		name = "Guest";
	}
	
	public Order(String name) {
		this.name = name;
	}

	
	
	//class methods
	public void addItem(Item newItem) {
		this.items.add(newItem);
	}
	
	
	public String getStatusMessage() {
		if (this.ready) {
			return "Your order is ready!";
		}
		else {
			return "Thanks for your patience, your order isn't ready yet";
		}
	}
	
	public double getOrderTotal() {
		double sum = 0.0;
		for (int i=0;i<this.items.size();i++) {
			sum += this.items.get(i).getPrice();
		}
		return sum;
	}
	
	public void display() {
		System.out.printf("Order info:\nCustomer Name: %s\n",this.name);
		for (int i=0;i<this.items.size();i++) {
			System.out.printf("%s | $%s",this.items.get(i).getName(),this.items.get(i).getPrice());
		}
		System.out.printf("Total: $%s",getOrderTotal());
		

	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}
