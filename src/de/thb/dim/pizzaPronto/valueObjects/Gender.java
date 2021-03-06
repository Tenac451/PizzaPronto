package de.thb.dim.pizzaPronto.valueObjects;

public enum Gender {
	M(1),F(2),I(3),U(4);
	private int number;
	private Gender(int nr) {
		number = nr;
	}
	public int toNumber() {
		return this.number;
	};
	public String toString() {
		switch (this.number) {
			case 1: return "male";
			case 2: return "female";
			case 3: return "intersex";
			case 4: return "unknown";
		}
		return "";
	};
}
