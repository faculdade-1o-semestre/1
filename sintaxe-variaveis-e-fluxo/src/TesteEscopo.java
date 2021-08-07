
public class TesteEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");// sysout

		int idade = 20;
		int quantidadePessoas = 3;

		boolean acompanhado;

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 || acompanhado) {// chaves nao sao necessarias em caso de uma unica funcao if
			System.out.println("seja bem vindo");
		} // || = "OU". && = "E"
		else {

			System.out.println("infelizmente voce nao pode entrar");
		}
	}
}
