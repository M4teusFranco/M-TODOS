import java.util.Scanner;
public class ex3 {

    // Declaração da classe Maior
    public static class Maior {
        int nummaior = 0; // Declaração dos atributos
        int n1; 
        int n2; 
        int n3; 

        // Construtor da classe Maior que inicializa os valores recebidos
        public Maior(int nummaior, int n1, int n2, int n3) {
            this.nummaior = nummaior; // Inicializa a variável que receberá o maior número 
            this.n1 = n1; // Inicializa o 1º número
            this.n2 = n2; // Inicializa o 2º número
            this.n3 = n3; // Inicializa o 3º número
        }

        // Método para identificar o maior número entre os três
        public void maiornum() {
            // Verifica se o 1º número é maior do que os outros 
            if (n1 > n2 && n1 > n3) {
                System.out.println("\nO maior é: " + n1); // Exibe o 1º número como o maior
            } else {
                // Verifica se o 2º número é maior do que os outros 
                if (n2 > n1 && n2 > n3) {
                    n2 += nummaior; 
                    System.out.println("\nO maior é: " + n2); // Exibe o 2º número como o maior
                } 
                
                // Verifica se o 3º número é maior do que os outros 
                else {
                    n3 += nummaior; 
                    System.out.println("\nO maior é: " + n3); // Exibe o 3º número como o maior
                }
            }
        }
    }

    public static void main(String[] args) {
        
        // Cria um Scanner para ler o 1º número informado
        Scanner num1 = new Scanner(System.in);
        System.out.println("Escreva o 1º número: ");
        int n1 = num1.nextInt(); // Lê o 1º número

        // Cria um Scanner para ler o 2º número informado
        Scanner num2 = new Scanner(System.in);
        System.out.println("Escreva o 2º número: ");
        int n2 = num2.nextInt(); // Lê o 2º número

        // Cria um Scanner para ler o 3º número informado
        Scanner num3 = new Scanner(System.in);
        System.out.println("Escreva o 3º número: ");
        int n3 = num3.nextInt(); // Lê o 3º número

        int nummaior = 0; 
        
        // Cria uma instância da classe Maior passando os números informados
        Maior maior = new Maior(nummaior, n1, n2, n3);

        // Chama o método maiornum para identificar e exibir o maior número
        maior.maiornum();
    }
}

