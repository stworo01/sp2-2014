package myPackage;

public class Pair {
	private int x;
	private int y;

	public Pair() {
	}

	public Pair(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Pair))
			return false;
		Pair other = (Pair) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	// @Override
	// public boolean equals(Object obj){
	// if (this == obj) return true;
	// if (obj == null) return false;
	// if (!(obj instanceof Pair)) return false;
	// Pair another = (Pair)obj;
	// return this.getX() == another.getX() && this.getY() == another.getY();
	// }

	@Override
	public String toString() {
		return "x = " + getX() + " y = " + getY();
	}

}