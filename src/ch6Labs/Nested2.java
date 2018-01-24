package ch6Labs;

public class Nested2 {
	public static void main(String[] args) {
		int i = 1, j = 1;
		while(i<=2) {
			while(j<=4) {
				System.out.println(i + "\t" + j);
				j++;
			}
			i++;
		}
	}
}
