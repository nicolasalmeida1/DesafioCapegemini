import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> itens = new ArrayList<>();

		System.out.print("n = ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
		itens.add(" ".repeat(n - i) + "*".repeat(i + 1));
		}

		for (String d : itens ) {
		System.out.println(d);
		}
		
		sc.close();

	}

}
