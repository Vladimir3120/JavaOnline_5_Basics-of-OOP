package basic.oop.task04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {

	public static void info() {

		DragonCave dragonCave = new DragonCave();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		boolean repeat = true;
		do {

			try {

				System.out.println("1 - посмотр всех сокровищ" + "\n2 - посмотреть сокровище по номеру"
						+ "\n3 - просмотр самого дорогого сокровища" + "\n4 - посмотреть сокровище по цене"
						+ "\n0 - выход");
				int key = scanner.nextInt();

				switch (key) {
				case 1:
					dragonCave.printTreasure();
					System.out.println("");
					break;

				case 2:

					System.out.println("Введите номер сокровища для подробного просмотра");
					int id = scanner.nextInt();
					dragonCave.printTreasureId(id);
					System.out.println("");

					break;

				case 3:

					dragonCave.expensiveTreasure();
					System.out.println("");

					break;

				case 4:

					System.out.println("Введите цену на которую следует найти сокровище");
					int price = scanner.nextInt();
					dragonCave.choiseForPrice(price);
					System.out.println("");

					break;

				default:

					if (key < 5 & key != 0) {
						repeat = true;
					} else {
						repeat = false;
					}

					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Некоректные данные " + e);
			}
		} while (repeat);

	}

}
