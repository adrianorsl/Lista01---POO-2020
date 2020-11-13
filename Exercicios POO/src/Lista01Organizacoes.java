import java.util.Scanner;

public class Lista01Organizacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Organizacoes salario = new Organizacoes();

		System.out.println("digite o salário");
		salario.salarioAntigo = sc.nextFloat();
		salario.valor();
		System.out.println(salario);

		sc.close();

	}
}
