package RecursionPatternsSorting;

public class RPatterns {

	public static void main(String[] args) {
		// tringle(4, 0);
		tringle2(4, 0);
	}

	private static void tringle(int r, int c) {
		if (r == 0) {
			return;
		}
		if (c < r) {
			System.out.print("*");
			tringle(r, c + 1);
		} else {
			System.out.println();
			tringle(r - 1, 0);
		}
	}

	private static void tringle2(int r, int c) {
		if (r == 0) {
			return;
		}
		if (c < r) {
			tringle2(r, c + 1);
			System.out.print("*");
		} else {
			tringle2(r - 1, 0);
			System.out.println();
		}
	}

}
