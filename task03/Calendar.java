package basic.oop.task03;

import java.time.LocalDate;
import java.util.List;

public class Calendar {

	public void print(List<Calendar.Notebook> list) {

		for (Notebook notebook : list) {
			System.out.println(notebook);

		}
	}

	class Notebook implements Comparable<Calendar.Notebook> {

		private LocalDate localDate;
		private String event;

		public Notebook(LocalDate localDate, String event) {
			super();
			this.localDate = localDate;
			this.event = event;
		}

		public LocalDate getLocalDate() {
			return localDate;
		}

		public String getEvent() {
			return event;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((event == null) ? 0 : event.hashCode());
			result = prime * result + ((localDate == null) ? 0 : localDate.hashCode());
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
			Notebook other = (Notebook) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (event == null) {
				if (other.event != null)
					return false;
			} else if (!event.equals(other.event))
				return false;
			if (localDate == null) {
				if (other.localDate != null)
					return false;
			} else if (!localDate.equals(other.localDate))
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		@Override
		public String toString() {
			return "Notebook [" + localDate + ", " + event + "]";
		}

		@Override
		public int compareTo(Notebook o) {
			if (this.localDate.compareTo(o.localDate) > 0) {
				return 1;
			} else if (this.localDate.compareTo(o.localDate) < 0) {
				return -1;
			} else {
				return 0;
			}
		}

	}

}