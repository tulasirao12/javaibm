
public class ArraysDemo {
	public static void main(String[] args) {

		int[] ar = { 10, 20, 30, 40, 50 };
		// Print values of this array

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		for (int i : ar) {
			System.out.println(i);
		}

		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// Print row wise output
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

		int[][] jag = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
		// Print row wise output
		for (int[] row : jag) {
			for (int n : row)
				System.out.print(n + "\t");
			System.out.println();
		}

		int[] sort = { 4, 2, 5, 3, 1 };
		// Sort and print this array
		for (int i = 0; i < sort.length; i++) {
			for (int j = i + 1; j < sort.length; j++) {
				int temp = 0;
				if (sort[i] > sort[j]) {
					temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;

				}
			}
		}
		for(int i=0;i<sort.length;i++) {
			System.out.println(sort[i]);
		}
	}
}
