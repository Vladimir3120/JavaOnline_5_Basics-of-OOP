package basic.oop.task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main02 {

	/*
	 * Создать класс Payment c внутренним классом, с помощью объектов кторого можно
	 * сформировать покупку из нескольких товаров.
	 */

	public static void main(String[] args) {

		Payment payment = new Payment();

		List<Payment.Product> order = new ArrayList<>();
		order.add(payment.new Product("printer", 45));
		order.add(payment.new Product("computer", 1250));
		order.add(payment.new Product("scanner", 30));

		Collections.sort(order);
		payment.info(order);
	}

}
