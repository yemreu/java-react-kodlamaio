package day_4_3.Concrete;

import day_4_3.Abstract.GameService;
import day_4_3.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: " + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi: " + game.getName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi: " + game.getName());
	}

}
