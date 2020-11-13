
public class CaixaEletronico {

	public int valor, sobra, aux, nota1 = 1, nota5 = 5, nota10 = 10, nota50 = 50, nota100 = 100,
			notas_100, notas_50, notas_10, notas_5, notas_1;
	
	public int caixaEle() {
			if(valor >= nota100) {
				notas_100 = valor / 100;
				valor = valor % 100;				
			}
			if (valor >= nota50) {
				notas_50 = valor / 50;
				valor = valor % 50;			
			}
			if (valor >= nota10) {
				notas_10 = valor / 10;
				valor = valor % 10;		
			}
			if (valor >= nota5) {
				notas_5 = valor / 5;
				valor = valor % 5;		
			}
			if (valor >= nota1) {
				notas_1 = valor / 1;
				valor = valor % 1;	
			}
			return notas_100 + notas_50 + notas_10 + notas_5 + notas_1 ;
		}
		
	
	
	public String toString() {
		return "notas de 100: " + notas_100 + ", notas de 50: "+ notas_50 + ", notas de 10: " + notas_10 + ", notas de 5: " + notas_5 + ", notas de 1: " + notas_1;
	}
	
}
