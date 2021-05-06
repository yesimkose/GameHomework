package abstracts;

import entities.Gamer;
import entities.Order;

public interface OrderService {
	void order(Order order,Gamer gamer);
}
