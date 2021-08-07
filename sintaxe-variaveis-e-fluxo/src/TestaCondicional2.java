
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");// sysout
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;// somente true or false

		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {// chaves nao sao necessarias em caso de uma unica funcao if
			System.out.println("seja bem vindo");
		} // || = "OU". && = "E"
		else {

			System.out.println("infelizmente voce nao pode entrar");
		}
	}

}
