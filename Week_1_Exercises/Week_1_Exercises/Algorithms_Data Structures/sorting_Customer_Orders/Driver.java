package sorting_Customer_Orders;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		Order[] order = new Order[5];
		order[0] = new Order(1, "Abishek", 12.55);
		order[1] = new Order(2, "Kannuswamy", 30.43);
		order[2] = new Order(3, "Jack", 457.22);
		order[3] = new Order(4,"Sparrow",234.754);
		order[4] = new Order(5,"Nenjikulle",345.05);
		System.out.println("Before Sort:");
		for (Order orders : order) {
			if (orders != null) {
				System.out.println("Order ID: " + orders.getOrderId());
				System.out.println("Customer Name: " + orders.getCustomerName());
				System.out.println("Total Price: " + orders.getTotalPrice());
				System.out.println();
			}
		}
		System.out.println("After Bubble Sort:");
		Order.sortOrdersByBubble(order);
		System.out.println("\nAfter sort:");
		for (Order orders : order) {
			if (orders != null) {
				System.out.println("Order ID: " + orders.getOrderId() + ", Customer Name: " + orders.getCustomerName()
						+ ", Total Price: " + orders.getTotalPrice());
			}
		}
	
		System.out.println("After Quick Sort");
		order = Arrays.stream(order).filter(o -> o != null).toArray(Order[]::new);

		Order.sortOrdersByQuick(order,0,order.length-1);
		for (Order orders : order) {
            if (orders != null) {
                System.out.println("Order ID: " + orders.getOrderId() +
                                   ", Customer Name: " + orders.getCustomerName() +
                                   ", Total Price: " + orders.getTotalPrice());
            }
        }

	}
}
