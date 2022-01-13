public class Aulas {
	public static void main(String[] args)

	{
		System.out.println("Olá Mundo!!");

		String nome = "Vamos aprender Java";
		System.out.println(nome);

		System.out.println("Declarando variáveis simples");
		String meuNome = "Clau Pinheiro";
		int idade = 43;
		char sexo = 'm';
		double temperatura = 35.5;
		boolean quente = true;

		System.out.println(meuNome);
		System.out.println("Tenho" + idade + "anos");

		System.out.println("sexo :" + sexo);

		System.out.println("Na cidade de Manaus está atualmente com :" + temperatura + " graus");

		System.out.println("É verdadeiro dizer que aqui na região Norte é muito quente !" + quente);
		System.out.println("");

		// Segundo Ecercício

		System.out.println(
				"Operação de adição declarando um valor direto a variável a e variável b, e fazendo a soma apresentando o resultado");

		int a = 8;
		int b = 5;
		int resultado = a + b;

		System.out.println("o valor de a é =" + a);
		System.out.println("ovalor de b é =" + b);
		System.out.println("o resultado da adição entre a + b é = " + resultado);

		System.out.println();

		System.out.println("operação com subtração");

		int c = 7;
		int d = 5;
		int sub = c - d;

		System.out.println("o valor de c é 7");
		System.out.println("o valor de d é 5");
		System.out.println("o resultado da subtração é = " + sub);
System.out.println();

System.out.println("Agora vamos fazer umas multiplicações simples");
//declarando as variáveis para fazer multiplicações

int num1 = 7;
int num2 = 8;
int resultMult = num1 * num2;

System.out.println("o valor do primeiro número declarado é 7");  
System.out.println("o valor do segundo número  declarado  é 8");
System.out.println("O resultado da multiplicação  entre 7 vezes 8 é = " +  resultMult);
		

System.out.println();
System.out.println("Agora vamos aprender a fazer operação de divisão simples");

//declarando os número para divisão

int num3 = 25;
int num4 = 5;
		
int resultDiv = num3 / num4;

System.out.println("O valor do primeiro número declarado é  25");
System.out.println("o valor do segundo número declarado é 5");
System.out.println("o resultado da divisão entre 25 dividido por 5 é =" + resultDiv);
	}

}
