package basic.oop.task01;

public class Main01 {

	/*
	 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
	 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить,
	 * удалить.
	 */

	public static void main(String[] args) {

		Creator creator = new Creator();

		creator.createTextFile("D:\\", "Text", ".txt");
		creator.print();

		creator.rename("newFile");
		creator.print();

		creator.createText("This is file");
		creator.print();

		creator.addText(" plus new text");
		creator.print();

		creator.deleteText();
		creator.print();

	}

}
