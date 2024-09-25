import java.util.Scanner;
public class ex2 {
	
    // Declaração da classe Conta
	public static class Conta{
		float num=0;		// Declaração dos Atributos
		float numfinal;
		float n1;
		float n2;
		float n3;
	
    // Construtor da classe Conta que inicializa os valores recebidos	
	public Conta(float num, float numfinal, float n1, float n2, float n3){
		this.num=num; // Inicializa a variável que receberá a Soma
		this.numfinal=numfinal; // Inicializa o resultado final
		this.n1=n1; // Inicializa o 1º número
		this.n2=n2; // Inicializa o 2º número
		this.n3=n3;	// Inicializa o 3º número	
		}
	
	// Método para calcular a Média 
	public void Media() {
		num = n1+n2+n3; // Armazena a soma dos 3 números
		numfinal = num/3; // Faz a média dividindo a soma por 3
		System.out.println("\nA média é: "+numfinal); // Exibe a méida
		
		}

	}
	
	public static void main(String args[]) {
	
	// Scanner para ler o 1º número
	Scanner num1 = new Scanner(System.in);	
	System.out.println("Informe o 1º número:");	
	float n1 = num1.nextInt(); // Lê o 1º número
	
	// Scanner para ler o 2º número
	Scanner num2 = new Scanner(System.in);
	System.out.println("Informe o 2º número");
	float n2 = num2.nextInt(); // Lê o 2º número
	
	// Scanner para ler o 3º número
	Scanner num3 = new Scanner(System.in);
	System.out.println("Informe o 3º número");
	float n3 = num3.nextInt(); // Lê o 3º número
	
	
	// Atribui o valor 0 às váriaveis
	float num = 0;
	float numfinal=0;
	
    // Cria uma instância da classe Conta com os dados informados
	Conta conta = new Conta(num, numfinal, n1, n2, n3);
	
	// Chama o método para calcular e exibir a Média
	conta.Media();
	}
}
