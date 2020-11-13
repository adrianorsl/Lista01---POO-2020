import java.util.Scanner;

public class Lista01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sexo = 0;
		PesoIdeal pesoIdeal = new PesoIdeal();

		System.out.println("Qual sua altura? Exemplo 1,85");
		pesoIdeal.altura = sc.nextFloat();
		System.out.println("Qual seu peso?");
		pesoIdeal.peso = sc.nextFloat();
		System.out.println("Masculino aperte 1 ou Feminino aperte 2");
		sexo = sc.nextInt();

		if (sexo == 1) {
			pesoIdeal.pesoIdealH();
			System.out.println(pesoIdeal);
		} else if (sexo == 2) {
			pesoIdeal.pesoIdealM();
			System.out.println(pesoIdeal);
		} else {
			System.out.println("Número inválido");
		}
		sc.close();
	}

}
