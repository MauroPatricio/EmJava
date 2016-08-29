package mz.com.turmaGrande.modelos;


public class Conversao {

	String acumulador = "";
	String recebe = "";
	String numero;


	public void introduzDigitos(String numero) {
		int contaDigitos = numero.length();

		if (contaDigitos == 1) {
			System.out.println(numerosDeUmDigito(numero));
		}
		if (contaDigitos == 2) {
			String numero1= numero.substring(0,1);
			String numero2= numero.substring(1,2);
			System.out.println(numerosDeDoisDigitos(numero1)+numerosDeUmDigito(numero2));
		}
		if (contaDigitos == 3) {
			String numero1= numero.substring(0,1);
			String numero2= numero.substring(1,2);
			String numero3= numero.substring(2,3);
			System.out.println(numerosDeTresDigitos(numero1)+numerosDeDoisDigitos(numero2)+numerosDeUmDigito(numero3));
		}
		if (contaDigitos == 4) {
			String numero1= numero.substring(0,1);
			String numero2= numero.substring(1,2);
			String numero3= numero.substring(2,3);
			String numero4= numero.substring(3,4);
			System.out.println(numerosDeQuatroDigitos(numero1)+numerosDeTresDigitos(numero2)+numerosDeDoisDigitos(numero3)+numerosDeUmDigito(numero4));
		}
	}

	public String numerosDeUmDigito(String numero) {
		int unidade = Integer.parseInt(numero.substring(0,1));
		if (unidade <= 3) {
			for (int i = 1; i <= unidade; i++) {
				acumulador += "I";
			}

		}
		if (unidade == 4) {
			acumulador += "IV";

		}
		if (unidade >= 5 && unidade <= 8) {
			if (unidade == 5) {
				acumulador = "V";

			} else {
				acumulador = "V";
				for (int i = 5; i < unidade; i++) {
					acumulador += "I";
				}

			}
		}
		if (unidade == 9) {
			acumulador += "IX";

		}
		return acumulador;
	}

	public String numerosDeDoisDigitos(String numero) {
		int dezenas = Integer.parseInt(numero.substring(0,1));
		String acumulador = "X";
		String recebe = "";
		String cinquenta = "L";
		if (dezenas >= 1 && dezenas < 4) {
			for (int i = 1; i <= dezenas; i++) {
				recebe = acumulador + recebe;
			}
		}
		if (dezenas == 4) {
			recebe = "XL";

		}
		if (dezenas >= 5 && dezenas < 9) {
			for (int i = 6; i <= dezenas; i++) {
				recebe = "X" + recebe;
			}
			recebe = cinquenta + recebe;

		}
		if (dezenas == 9) {
			recebe = recebe + "XC";
		}

		return recebe;
	}

	public String numerosDeTresDigitos(String numero) {
		String quinhentos = "D";
		String recebe = "";
		int centenas = Integer.parseInt(numero.substring(0,1));
		if (centenas >= 1 && centenas < 4) {
			for (int i = 1; i <= centenas; i++) {
				recebe += "C";
			}
		}
		if (centenas == 4) {
			recebe += "CD";
		}
		if (centenas >= 5 && centenas < 9) {
			for (int i = 6; i <= centenas; i++) {
				recebe = "C" + recebe;
			}
			recebe = quinhentos + recebe;

		}
		if (centenas == 9) {
			recebe = "CM";
		}

		return recebe;

	}

	public String numerosDeQuatroDigitos(String numero) {
		String recebe = "";
		int milhares = Integer.parseInt(numero.substring(0, 1));
		if (milhares >= 1 && milhares < 4) {
			for (int i = 1; i <= milhares; i++) {
				recebe += "M";
			}
		}
		return recebe;
	}

}