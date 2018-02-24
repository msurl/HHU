public class Mensch extends Lebewesen implements Interfaces, Cloneable {

	int iq = 0;

	Hund hund;

	private static int anzahlMenschen = 0;

	static int getAnzahlMenschen() {
		return anzahlMenschen;
	}

	void bildung() {
		iq += 5;
	}

	void bildung(int wieviel) {
		iq += wieviel;
	}

	Mensch(int alter, int iq, String name, String haarfarbe, Hund hund)
			throws Exception {

		if (alter < 0) {
			throw new Exception("Negatives Alter!!!");
		}
		this.alter = alter;
		this.iq = iq;
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.hund = hund;

		anzahlMenschen++;
	}

	Mensch() {

	}

	@Override
	public String toString() {
		return String
				.format("Name: %s\nAlter: %s\nIQ: %s\nHaarfarbe: %s\nSpeicheradresse:/s\n",
						name, alter, iq, haarfarbe, super.toString());

	}

	@Override
	public void laufen() {

	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Mensch)) {
			return false;
		}

		Mensch m = (Mensch) obj;

		if (this.iq != m.iq) {
			return false;
		}
		if (this.alter != m.alter) {
			return false;
		}
		if (!(this.name.equals(m.name))) {
			return false;
		}
		if (!(this.haarfarbe.equals(m.haarfarbe))) {
			return false;
		}
		return true;

	}

	@Override
	public Mensch clone() throws CloneNotSupportedException {

		Mensch m = (Mensch) super.clone();
		Hund h = hund.clone();
		m.hund = h;
		return m;

	}

}