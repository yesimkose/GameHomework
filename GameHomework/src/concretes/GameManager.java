package concretes;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("yeni oyun eklendi : "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("oyun silindi : "+game.getGameName());
		
	}

}
