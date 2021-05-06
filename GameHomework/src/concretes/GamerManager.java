package concretes;

import abstracts.BaseGamerManager;
import abstracts.GamerCheckService;
import entities.Gamer;

public class GamerManager implements BaseGamerManager{

	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		System.out.println("Kullan�c� eklendi : "+gamer.getFirstName());

		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullan�c� g�ncellendi : "+gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� silindi : "+gamer.getFirstName());

		
	}

}
