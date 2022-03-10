package teste;

import java.util.Arrays;

public class QuartaAtividade {

	public static void main(String[] args) {

		int[] a1 = { 00, 60, 80, 120, 160, 200 };
		int[] a2 = { 70, 90, 110, 130, 100 };

		int lenA1 = a1.length;
		int lenA2 = a2.length;

		int[] junta = new int[lenA1 + lenA2];
		System.arraycopy(a1, 0, junta, 0, lenA1);
		System.arraycopy(a2, 0, junta, lenA1, lenA2);
		System.out.println("a1: " + Arrays.toString(a1));
		System.out.println("a2: " + Arrays.toString(a2));
		System.out.println("Juntando Array: " + Arrays.toString(junta));
	}

}
