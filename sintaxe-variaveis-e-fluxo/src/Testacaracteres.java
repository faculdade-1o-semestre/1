
public class Testacaracteres {

	public static void main(String[] args) {
		char letra = 'a';// somente aspas unicas e objeto unico
		System.out.println(letra);

		char valor = 66;
		System.out.println(valor);

		valor = (char) (valor + 1);// 1 = int, valor = char. (char) = cast
		System.out.println(valor);

		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);

		palavra = palavra + 2020;
		System.out.println(palavra);

	}
}
