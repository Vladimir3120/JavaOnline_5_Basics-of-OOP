package basic.oop.task02;

import java.util.List;

public class Payment {

	private int countProduct;
	private int sumPrice;

	public Payment() {
		super();
	}

	public void info(List<Payment.Product> order) {

		for (Product product : order) {
			System.out.println(product);
			countProduct++;
			sumPrice += product.getPrice();
		}
		System.out.println(toString());
	}

	public int getCountProduct() {
		return countProduct;
	}

	public int getSumPrice() {
		return sumPrice;
	}

	@Override
	public String toString() {
		return "Payment [countProduct=" + countProduct + ", sumPrice=" + sumPrice + "]";
	}

	class Product implements Comparable<Product> {

		private String name;
		private int price;

		public Product(String name, int price) {
			super();
			this.name = name;
			this.price = price;
			countProduct++;
			sumPrice += price;
		}

		public String getName() {
			return name;
		}

		public int getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return "Product [" + name + ", price=" + price + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + price;
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
			Product other = (Product) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (price != other.price)
				return false;
			return true;
		}

		private Payment getEnclosingInstance() {
			return Payment.this;
		}

		@Override
		public int compareTo(Product o) {
			if (this.price < o.getPrice()) {
				return 1;
			} else if (this.price > o.getPrice()) {
				return -1;
			} else {
				return 0;
			}

		}

	}

}