public class Hund extends Lebewesen implements Interfaces, Cloneable {

	public Hund(int alter) {
		this.alter = alter;
	}

	@Override
	public void laufen() {

	}

	public Hund clone() throws CloneNotSupportedException {

		return (Hund) super.clone();

	}

}

