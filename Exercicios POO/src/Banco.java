import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		CaixaEletronico caixa = new CaixaEletronico();
		
		System.out.println("informe valor para sacar:");
		caixa.valor = sc.nextInt();
		
		if(caixa.valor >= 10 && caixa.valor <= 600) {
			caixa.caixaEle();
			System.out.println(caixa);
		}else {	
			System.out.println("Valor informado invalido");
			}
		
		sc.close();
	}

}

