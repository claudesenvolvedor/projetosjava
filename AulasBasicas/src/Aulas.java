public class Aulas {
	public static void main(String[] args)

	{
		System.out.println("Ol� Mundo!!");

		String nome = "Vamos aprender Java";
		System.out.println(nome);

		System.out.println("Declarando vari�veis simples");
		String meuNome = "Clau Pinheiro";
		int idade = 43;
		char sexo = 'm';
		double temperatura = 35.5;
		boolean quente = true;

		System.out.println(meuNome);
		System.out.println("Tenho" + idade + "anos");

		System.out.println("sexo :" + sexo);

		System.out.println("Na cidade de Manaus est� atualmente com :" + temperatura + " graus");

		System.out.println("� verdadeiro dizer que aqui na regi�o Norte � muito quente !" + quente);
		System.out.println("");

		// Segundo Ecerc�cio

		System.out.println(
				"Opera��o de adi��o declarando um valor direto a vari�vel a e vari�vel b, e fazendo a soma apresentando o resultado");

		int a = 8;
		int b = 5;
		int resultado = a + b;

		System.out.println("o valor de a � =" + a);
		System.out.println("ovalor de b � =" + b);
		System.out.println("o resultado da adi��o entre a + b � = " + resultado);

		System.out.println();

		System.out.println("opera��o com subtra��o");

		int c = 7;
		int d = 5;
		int sub = c - d;

		System.out.println("o valor de c � 7");
		System.out.println("o valor de d � 5");
		System.out.println("o resultado da subtra��o � = " + sub);
System.out.println();

System.out.println("Agora vamos fazer umas multiplica��es simples");
//declarando as vari�veis para fazer multiplica��es

int num1 = 7;
int num2 = 8;
int resultMult = num1 * num2;

System.out.println("o valor do primeiro n�mero declarado � 7");  
System.out.println("o valor do segundo n�mero  declarado  � 8");
System.out.println("O resultado da multiplica��o  entre 7 vezes 8 � = " +  resultMult);
		

System.out.println();
System.out.println("Agora vamos aprender a fazer opera��o de divis�o simples");

//declarando os n�mero para divis�o

int num3 = 25;
int num4 = 5;
		
int resultDiv = num3 / num4;

System.out.println("O valor do primeiro n�mero declarado �  25");
System.out.println("o valor do segundo n�mero declarado � 5");
System.out.println("o resultado da divis�o entre 25 dividido por 5 � =" + resultDiv);
	}

}
