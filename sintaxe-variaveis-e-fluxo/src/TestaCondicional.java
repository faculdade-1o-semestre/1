
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");// sysout
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {// chaves nao sao necessarias em caso de uma unica funcao if
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voce nao tem 18 mas pode entrar, pois esta acompanhado");

			} else {
				System.out.println("infelizmente voce nao pode entrar");
			}
		}
	}
}
