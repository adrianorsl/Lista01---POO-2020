
public class PesoIdeal {

	public double peso = 0, pesoIdeal = 0, homem = 72.7, mulher = 62.1;
	public float altura = 0;

	public double pesoIdealH() {
		return pesoIdeal = ((homem * altura) - 58);
	}

	public double pesoIdealM() {
		return pesoIdeal = ((mulher * altura) - 44.7);
	}

	public String toString() {
		if (pesoIdeal > peso) {
			return "Altura: " + altura + ", Peso: " + peso + ", Peso Ideal: " + pesoIdeal
					+ ", Você está abaixo do peso ideal.";
		} else if (pesoIdeal < peso) {
			return "Altura: " + altura + ", Peso: " + peso + ", Peso Ideal: " + pesoIdeal
					+ ", Você está acima do peso ideal.";
		} else {
			return "Altura: " + altura + ", Peso: " + peso + ", Peso Ideal: " + pesoIdeal
					+ ", Você está no peso ideal.";
		}
	}

}
