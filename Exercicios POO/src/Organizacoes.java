
public class Organizacoes {

	public float salarioAntigo = 0, salarioNovo = 0, percentual = 0, aumento = 0;

	public float valor() {
		if (salarioAntigo <= 280) {
			percentual = (float) 0.2;
			salarioNovo = salarioAntigo + (percentual * salarioAntigo);
			aumento = salarioNovo - salarioAntigo;
			return salarioNovo;
		} else if ((salarioAntigo > 280) && (salarioAntigo <= 700)) {
			percentual = (float) 0.15;
			salarioNovo = salarioAntigo + (percentual * salarioAntigo);
			aumento = salarioNovo - salarioAntigo;
			return salarioNovo;
		} else if ((salarioAntigo > 700) && (salarioAntigo <= 1500)) {
			percentual = (float) 0.10;
			salarioNovo = salarioAntigo + (percentual * salarioAntigo);
			aumento = salarioNovo - salarioAntigo;
			return salarioNovo;
		} else {
			// salario > 1500 //
			percentual = (float) 0.05;
			salarioNovo = salarioAntigo + (percentual * salarioAntigo);
			aumento = salarioNovo - salarioAntigo;
			return salarioNovo;
		}
	}

	public String toString() {
		return "salário anterior: " + salarioAntigo + ", Percentual do aumento: " + (percentual * 100) + "%"
				+ ", Valor do aumento: " + aumento + ", Novo salário: " + salarioNovo;
	}

}
