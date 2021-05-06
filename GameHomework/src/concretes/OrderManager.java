package concretes;

import abstracts.OrderService;
import entities.Gamer;
import entities.Order;

public class OrderManager implements OrderService{

	@Override
	public void order(Order order, Gamer gamer) {
		System.out.println(gamer.getFirstName()+" isimli kullan�c� "+order.getId()+" numaral� sipari�i vermi�tir.");
		
	}

}
