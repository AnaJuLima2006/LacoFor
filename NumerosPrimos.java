import java.util.Scanner; //Exercício 3

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int nPrimo;
		int nDivisor = 0;
		
		System.out.println("Digite um número:");
		nPrimo = leitura.nextInt();
		
		for (int i=1; i <=nPrimo; i++) {
			if( nPrimo % i == 0) {
				nDivisor++;
	        }
		}
		
		if(nDivisor == 2) {
			System.out.print("É um número primo!");
		} else {
		    System.out.print("Não é um número primo!");
		}
	}

}
