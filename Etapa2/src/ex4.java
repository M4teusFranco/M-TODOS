import java.util.Scanner;

public class ex4 {
	
    // Declaração da classe AB
	public static class AB {
		int n1; // Declaração dos atributos
		int n2;
	
    // Construtor da classe AB que inicializa os valores recebidos
	public AB (int n1, int n2) {
		this.n1=n1; // Inicializa o 1º número
		this.n2=n2; // Inicializa o 2º número
		}
	
	// Método para juntar os dois valores recebidos
	public void juncao(){
		System.out.println("\nA junção é: " +n1+""+n2);
	}
}
	
	public static void main(String args[]) {
       
		// Cria um Scanner para ler o 1º número informado
		Scanner num1 = new Scanner(System.in);
		System.out.println("Informe o 1º número: ");
		int n1 = num1.nextInt(); // Lê o 1º número
		
		// Cria um Scanner para ler o 2º número informado
		Scanner num2 = new Scanner(System.in);
		System.out.println("Informe o 2º número: ");
		int n2 = num2.nextInt(); // Lê o 2º número
		
        // Cria uma instância da classe AB passando os números informados
		AB ab = new AB(n1, n2);
		
		// Chama o método juncao para a junção dos dois números informados
		ab.juncao();
	}
	
}
