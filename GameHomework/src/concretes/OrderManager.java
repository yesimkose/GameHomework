package concretes;

import abstracts.OrderService;
import entities.Gamer;
import entities.Order;

public class OrderManager implements OrderService{

	@Override
	public void order(Order order, Gamer gamer) {
		System.out.println(gamer.getFirstName()+" isimli kullanýcý "+order.getId()+" numaralý sipariþi vermiþtir.");
		
	}

}
