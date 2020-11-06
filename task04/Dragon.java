package basic.oop.task04;

import java.util.ArrayList;
import java.util.List;

public class Dragon {
	private static List<Coin> addCoin() {

		List<Coin> coins = new ArrayList<>();

		for (int i = 0; i < (int) (50 + Math.random() * 100); i++) {

			Coin[] coins2 = { new Coin(MetallType.BRONZE, (int) (4 + Math.random() * 10)),
					new Coin(MetallType.GOLD, (int) (4 + Math.random() * 10)),
					new Coin(MetallType.SILVER, (int) (4 + Math.random() * 10)) };

			coins.add(coins2[(int) (0 + Math.random() * 3)]);

		}
		return coins;

	}

	public static List<Treasure> addTreasure() {

		List<Treasure> treasures = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			treasures.add(new Treasure(addCoin()));

		}
		return treasures;
	}

}
