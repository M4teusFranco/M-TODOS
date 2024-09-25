import java.util.Scanner;
public class ex1 {
	
	// Declaração da classe verificadora
	public static class Verific {
		
		int num; // Variável que armazenará o número verifiicado
		
		// Construtor que inicializa o valor do número
		public Verific(int num) {
			this.num=num;
		}
		
		// Método para verificar se o número é Positivo ou Negativo
		public void nega_posi() {
			if(num>=0) {
				System.out.println("Positivo."); // Se for maior ou igual a 0, é Positivo
			}
			else {
				System.out.println("Negativo."); // Se for menor do que 0, é Negativo
			}	
		}
		
	}
	
	public static void main(String args[]) {
		
		// Scanner para armazenar o número que será verificado
		Scanner informe = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = informe.nextInt();
		
        // Cria uma instância da classe Verific passando o número informado
		Verific verific = new Verific(num);		
		
        // Chama o método para verificar se o número é positivo ou negativo
		verific.nega_posi();
		
	}
}

