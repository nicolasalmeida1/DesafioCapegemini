import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
	

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, insira a palavra: ");
		String palavra = sc.next();
		String palavraInvertida = "";
		
		palavraInvertida = new StringBuffer(palavra).reverse().toString();
		
		
		int y = 0;
		while(y < palavra.length()) {
			for(int i = palavra.length(); i > y; i--) {
				int z = 0;
				String c = palavra.substring(y,i);
				while(z < palavra.length()) {
					for(int j = palavra.length(); j > z; j--) {
						String d = palavraInvertida.substring(z,j);
						if(c.equals(d)){
							count+=1;
						}
					}
					z += 1;
				}
				y+=1;
			}
		}
		
		System.out.println(count);	
	}

}
