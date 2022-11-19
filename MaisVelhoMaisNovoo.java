import java.util.Scanner;
public class MaisVelhoMaisNovoo {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int maior = 0, menor, anoAtual, anoNasc, id, idNovo = 0, idVelho = 0;
		
		System.out.println("Para calcular a sua idade...");
		System.out.println("Digite o ano atual: ");
		
		anoAtual = leitura.nextInt();
		menor = anoAtual;
		
		for (int i = 1; i <= 10; i++  ) {
			
			System.out.println("Digite o seu ano de nascimento:");
			anoNasc = leitura.nextInt();
			id = anoAtual-anoNasc;
			System.out.println("Você tem " + id +" anos.");
			if(maior < id){
				maior = id;
				idVelho = i;
			}
			if (menor > id) {
				menor = id;
				idNovo = i;
			}
			System.out.println("O mais velho tem "   + ( +  maior + " anos.")); 
			System.out.println("O mais novo tem " + ( +  menor+ " anos.")); 
			
		}
	}

}
