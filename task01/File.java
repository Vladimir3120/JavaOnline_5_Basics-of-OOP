package basic.oop.task01;

public class File extends Directory {

	private String nameFile;
	private String expansion;

	public File(String path, String nameFile, String expansion) {
		super(path);
		this.nameFile = nameFile;
		this.expansion = expansion;
	}

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getExpansion() {
		return expansion;
	}

	public void setExpansion(String expansion) {
		this.expansion = expansion;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((expansion == null) ? 0 : expansion.hashCode());
		result = prime * result + ((nameFile == null) ? 0 : nameFile.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		if (expansion == null) {
			if (other.expansion != null)
				return false;
		} else if (!expansion.equals(other.expansion))
			return false;
		if (nameFile == null) {
			if (other.nameFile != null)
				return false;
		} else if (!nameFile.equals(other.nameFile))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "File [nameFile=" + nameFile + ", expansion=" + expansion + "]";
	}

}
