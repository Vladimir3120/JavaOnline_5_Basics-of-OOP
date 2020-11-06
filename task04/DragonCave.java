package basic.oop.task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DragonCave {

	private static List<Treasure> treasures = Dragon.addTreasure();

	public void printTreasure() {

		for (Treasure treasure : treasures) {
			System.out
					.println("В сокровище=" + treasure.getId() + ", монет на общую сумму=" + treasure.getPrice() + "$");
		}

	}

	public void printTreasureId(int id) {

		int countBronze = 0;
		int countSilver = 0;
		int countGold = 0;

		double costBronze = 0;
		double costSilver = 0;
		double costGold = 0;

		double sumWeightBronze = 0;
		double sumWeightSilver = 0;
		double sumWeightGold = 0;

		List<Coin> coins = new ArrayList<>();

		for (Treasure treasure : treasures) {

			if (treasure.getId() == id) {
				System.out.println("В сокровище=" + treasure.getId() + ", монет на сумму=" + treasure.getPrice() + "$");
				coins = treasure.getCoins();
			}
		}

		for (Coin coin : coins) {

			if (coin.getMetallType().getName().equalsIgnoreCase("Bronze")) {
				countBronze++;
				costBronze = coin.getMetallType().getPriceMetall();
				sumWeightBronze += coin.getWeight();
			}
			if (coin.getMetallType().getName().equalsIgnoreCase("Silver")) {
				countSilver++;
				costSilver = coin.getMetallType().getPriceMetall();
				sumWeightSilver += coin.getWeight();
			}
			if (coin.getMetallType().getName().equalsIgnoreCase("Gold")) {
				countGold++;
				costGold = coin.getMetallType().getPriceMetall();
				sumWeightGold += coin.getWeight();
			}

		}
		System.out.println("золотых=" + countGold + "(" + sumWeightGold + "гр.)-ценой за грамм=$" + costGold);
		System.out.println("серебрянных=" + countSilver + "(" + sumWeightSilver + "гр.)-ценой за грамм=$" + costSilver);
		System.out.println("бронзовых=" + countBronze + "(" + sumWeightBronze + "гр.)-ценой за грамм=$" + costBronze);

	}

	public void expensiveTreasure() {

		for (Treasure treasure : treasures) {

			if (treasure.getPrice() == maxPrice()) {
				System.out.println("Самое дорогое сокровище сокровище!!! ");
				printTreasureId(treasure.getId());
			}

		}

	}

	private double maxPrice() {

		double[] sort = arr();

		double max = 0;

		for (int i = 0; i < sort.length; i++) {
			if (sort[i] > max) {
				max = sort[i];
			}

		}
		return max;

	}

	private double[] arr() {
		double[] arr = new double[treasures.size()];
		int count = 0;

		List<Treasure> treasuresSort = new ArrayList<>();
		treasuresSort = DragonCave.treasures;
		for (Treasure treasure : treasuresSort) {

			arr[count++] = treasure.getPrice();

		}
		return arr;

	}

	private double setAmmount(double price) {

		double[] arr = arr();

		Arrays.sort(arr);

		double max = 0;

		for (int i = 0; i < arr.length; i++) {

			if (price <= arr[i]) {
				max = arr[i];
				break;
			}
			if (price >= arr[i]) {
				max = arr[i];
			}

		}
		return max;

	}

	public void choiseForPrice(double price) {

		for (Treasure treasure : treasures) {

			if (treasure.getPrice() == setAmmount(price)) {
				printTreasureId(treasure.getId());
			}

		}

	}
}
