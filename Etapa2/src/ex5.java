import java.util.Scanner;

public class ex5 {
    	
		// Declaração de uma classe Conversão
		public static class Conversao{
			int min; // Declaração dos atributos
			int horas;
			int sobra;
			
		    // Construtor da classe OS minutos, horas e sobra
			public Conversao(int min, int horas, int sobra){
				this.min=min; // Inicializa os minutos
				this.horas=horas; // Inicializa as horas
				this.sobra=sobra; // Inicializa a sobra
			}
			// Declaração do método hrsmin calcula as horas e minutos
			public void hrsmin(){
				int horas = min/60; // Calcula o número de horas dividindo os minutos por 60 e armazena o valor em "horas".
				int sobra = min%60; // Calcula a sobra de minutos utilizando o módulo e armazena em "sobra".
				
				System.out.println("\nSão "+horas+"h "+sobra+" min"); // Exibe o resultado do cálculo
			}
		
		}
		
		public static void main(String args[]) {
			
		// Cria um Scanner para	receber os minutos
		Scanner minutos = new Scanner(System.in);
		System.out.println("Informe os Minutos: ");
		int min= minutos.nextInt();
		int horas=0;
		int sobra=0;
        // Inicializa as variáveis com o valor zero.

		Conversao conversao = new Conversao(min, horas, sobra);  // Cria uma instância da classe, passando os valores três valores como parâmetros

		conversao.hrsmin(); // Exibe os minutos convertidos em horas e minutos
	}
}
