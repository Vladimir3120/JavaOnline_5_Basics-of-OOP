package basic.oop.task01;

public class Creator {

	private TextFile textFile;
	private String text = "";
	private boolean f = false;

	public Creator() {
		super();
	}

	public TextFile createTextFile(String path, String nameFile, String expansion) {
		textFile = new TextFile(path, nameFile, expansion, text);
		f = true;
		return textFile;
	}

	public TextFile rename(String nameFile) {
		textFile.setNameFile(nameFile);
		return textFile;

	}

	public void print() {
		System.out.println(textFile);
	}

	public String createText(String text) {

		try {
			if (textFile.getExpansion().equals(".txt") && f) {
				textFile.setText(text);
			} else {
				System.out.println("Неверное расширение файла");
			}

		} catch (NullPointerException e) {
			System.out.println("Файл не создан");
			e.printStackTrace();
		}
		return text;
	}

	public String addText(String text) {
		textFile.setText(textFile.getText() + text);
		return text;
	}

	public String deleteText() {
		return text = createText("");
	}

}
