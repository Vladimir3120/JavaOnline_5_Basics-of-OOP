package basic.oop.task04;

import java.util.List;

public class Treasure implements Priceable {

	private static int count = 1;
	private int id = 0;
	private List<Coin> coins;

	public Treasure(List<Coin> coins) {
		super();
		this.coins = coins;
		id = count++;
	}

	public static int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public List<Coin> getCoins() {
		return coins;
	}

	@Override
	public double getPrice() {

		double price = 0;

		for (Coin coin : coins) {
			price += coin.getPrice();
		}
		return price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coins == null) ? 0 : coins.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		if (coins == null) {
			if (other.coins != null)
				return false;
		} else if (!coins.equals(other.coins))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Treasure [id=" + id + ", coins=" + coins + ", price=" + getPrice() + "$" + "]";
	}

}
