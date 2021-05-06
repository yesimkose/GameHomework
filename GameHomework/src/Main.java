import java.time.LocalDate;

import abstracts.GamerCheckService;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerCheckManager;
import concretes.GamerManager;
import concretes.OrderManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
import entities.Order;

public class Main {

	public static void main(String[] args) {
		Gamer yesim=new Gamer(1,"Yeþim","Köse","49360683560",2000);
		GamerCheckService gamerCheckService=new GamerCheckManager();		

		GamerManager gamerManager=new GamerManager(gamerCheckService);
		gamerManager.add(yesim);
		
		Game pubg=new Game(1,"pubg",100);
		Game driver=new Game(2,"driver",200);
		
		GameManager gameManager=new GameManager();
		gameManager.add(pubg);
		gameManager.add(driver);
		gameManager.delete(driver);
		
		Order order=new Order(1,1,1,LocalDate.of(2021,05,06),1000,10);
		OrderManager orderManager=new OrderManager();
		orderManager.order(order, yesim);
		
		Campaign campaign=new Campaign(1,"Büyük indirim",50);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		
	}

}
