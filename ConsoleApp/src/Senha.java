import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		int countMaiusculo = 0;
		int countMinusculo = 0;
		int countDigito = 0;
		int countCaractereEspecial = 0;
		
		System.out.print("Pro favor, insira a sua senha: ");
		Scanner sc = new Scanner(System.in);
		String senha = sc.next();
		
		if(senha.length() < 6) {
			int digitosRestantes = 6 - senha.length();
			System.out.printf("Sua senha ainda n�o � segura. ela possui menos de 6 d�gitos, por favor, insira mais %d d�gitos", digitosRestantes);
		}
		
		for(int i = 0; i < senha.length(); i++) {
			char c = senha.charAt(i);
			if(Character.isUpperCase(c)) {
				countMaiusculo += 1;
			}
			else if(Character.isLowerCase(c)) {
				countMinusculo += 1;
			}
			else if(Character.isDigit(c)) {
				countDigito += 1;
			}
			else if(senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$") || senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*") || senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
				countCaractereEspecial +=1;
			}
			
		}
		
		if(countMaiusculo == 0) {
			System.out.println("Sua senha ainda n�o � segura. ela n�o possui letra mai�scula");
		}
		else if(countMinusculo == 0) {
			System.out.println("Sua senha ainda n�o � segura. ela n�o possui letra mi�scula");
		}
		else if(countDigito == 0) {
			System.out.println("Sua senha ainda n�o � segura. ela n�o possui d�gito");
		}
		else if(countCaractereEspecial == 0) {
			System.out.println("Sua senha ainda n�o � segura. ela n�o possui caractere especial");
		}
		else {
			System.out.println("Sua senha est� segura!");
		}
		
		sc.close();
	}

}
