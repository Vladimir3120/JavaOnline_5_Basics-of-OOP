package basic.oop.task03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main03 {

	/*
	 * Создать класс календарь с внутренним классом, с помощью объектов которого
	 * можно хранить информацию о выходых и праздничных днях.
	 */

	public static void main(String[] args) {

		Calendar calendar = new Calendar();

		List<Calendar.Notebook> lNotebooks = new ArrayList<>();
		lNotebooks.add(calendar.new Notebook(LocalDate.of(2021, 01, 1), "Новый год"));
		lNotebooks.add(calendar.new Notebook(LocalDate.of(2021, 01, 2), "Выходной"));
		lNotebooks.add(calendar.new Notebook(LocalDate.of(2021, 03, 8), "8 Марта"));
		lNotebooks.add(calendar.new Notebook(LocalDate.of(2021, 01, 3), "Выходной"));
		lNotebooks.add(calendar.new Notebook(LocalDate.of(2021, 02, 23), "23 Февраля"));

		Collections.sort(lNotebooks);
		calendar.print(lNotebooks);

	}

}
