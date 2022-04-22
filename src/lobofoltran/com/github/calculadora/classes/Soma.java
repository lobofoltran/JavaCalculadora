package lobofoltran.com.github.calculadora.classes;

import lobofoltran.com.github.calculadora.interfaces.ICalculadora;

public class Soma implements ICalculadora {

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		return n1 + n2;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		return n1 + n2;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		return n1 + n2;
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		int resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado += numeros[i];
		}
		return resultado;
	}

	@Override
	public Float calcula(Float[] numeros) {
		float resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado += numeros[i];
		}
		return resultado;
	}

	@Override
	public Double calcula(Double[] numeros) {
		double resultado = 0;
		for (int i = 0; i < numeros.length; i++) {
			resultado += numeros[i];
		}
		return resultado;
	}
}
