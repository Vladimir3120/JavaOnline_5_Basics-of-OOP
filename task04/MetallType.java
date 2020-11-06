package basic.oop.task04;

public enum MetallType {
	
	BRONZE(45, "Bronze"), SILVER(89, "Silver"), GOLD(250, "Gold");

	private double priceMetall;
	private String name;

	MetallType(double i, String name) {
		this.priceMetall = i;
		this.name = name;
	}

	public double getPriceMetall() {
		return priceMetall;
	}

	public String getName() {
		return name;
	}

}
