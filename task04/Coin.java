package basic.oop.task04;

public class Coin implements Priceable {

	private static int count = 0;
	private MetallType metallType;
	private double weight;

	public Coin(MetallType metallType, double weight) {
		super();
		this.metallType = metallType;
		this.weight = weight;
		count++;
	}

	public static int getCount() {
		return count;
	}

	public MetallType getMetallType() {
		return metallType;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public double getPrice() {

		return weight * metallType.getPriceMetall();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((metallType == null) ? 0 : metallType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Coin other = (Coin) obj;
		if (metallType != other.metallType)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coin [metallType=" + metallType + ", weight=" + weight + ", price=" + getPrice() + "$" + "]";
	}

}

