public class MatrizAndVetor {
	public static void main(String[] args) {
		// binario
		int a[] = {1,2,0b101011,4};
		//octal
		int c[] = {1,2,053,4};
		// hexa
		int d[] = {1,2,0x2B,4};
		int b[][] = {{1,2,4}, {2,2,1}, {0,43,2}};

		System.out.println(a[3] == b[0][2]);
		System.out.println("Binário: "+ (a[2]==b[2][1]));
		System.out.println(" Octal: "+ (c[2]==b[2][1]));
		System.out.println(" Hexa: "+ (d[2]==b[2][1]));
	}
}
