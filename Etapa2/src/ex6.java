public class ex6 {

	// Declara a Classe Fatorial
	 public static class Fatorial{
		 int num;
		 int resultado=1;
		 
	     // Construtor da classe, que recebe os parâmetros número e o resultado final.
		 public Fatorial(int num, int resultado) {
			this.num=num; // Inicializa o número que será fatorado
			this.resultado=resultado; // Inicializa o resultado inicial
		 }
		 
		 // Método que calcula o Fatorial
		 public void contafat() {
			 // Inicia um loop "for" que começa em 2 e vai até o número armazenado em "num"
			 for (int i = 2; i <= num; i++) {
		            resultado *= i; // Multiplica o valor atual de "resultado" por "i" em cada iteração, acumulando o valor do fatorial
			 }
	            System.out.println("O Fatorial é: " + resultado); // Exibe o resultado final

		 }
	 }

	    public static void main(String[] args) {
	    	
	    	
	    	// Cria uma instância da classe Fatorial passando o número 5 e o resultado inicial 1 
	    	Fatorial fatorial = new Fatorial(5, 1);
	    	
	    	// Chama o método "contafat para calcular e imprimir o fatorial de 5
	    	fatorial.contafat();
	    
	    
	    }
	}