package lobofoltran.com.github.calculadora.programa;

import java.util.Locale;
import java.util.Scanner;
import lobofoltran.com.github.calculadora.classes.Soma;
import lobofoltran.com.github.calculadora.interfaces.ICalculadora;

import classes.*;


public class Application {	
	
	public static Integer[] makeIntArrays(int qty) {
	    Integer[] intArr = new Integer[qty];
	    Scanner scan = new Scanner(System.in);

	    for (int i = 0; i < qty; i++) {
	      System.out.println("Digite o " + (i + 1) + "º número: ");
	      intArr[i] = scan.nextInt();
	    }
	    return intArr;
	  }

	public static Float[] makeFloatArrays(int qty) {
	    Float[] floatArr = new Float[qty];
	    Scanner scan = new Scanner(System.in);
	    scan.useLocale(Locale.ENGLISH);

	    for (int i = 0; i < qty; i++) {
	      System.out.println("Digite o " + (i + 1) + "º número: ");
	      floatArr[i] = scan.nextFloat();
	    }
	    return floatArr;
	}

	public static Double[] makeDoubleArrays(int qty) {
	    Double[] doubleArr = new Double[qty];
	    Scanner scan = new Scanner(System.in);
	    scan.useLocale(Locale.ENGLISH);

	    for (int i = 0; i < qty; i++) {
	      System.out.println("Digite o " + (i + 1) + "º número: ");
	      doubleArr[i] = scan.nextDouble();
	    }
	    return doubleArr;
	  }
	  
	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String confirmation;
		    boolean again = true;
		    String operation = "";
		    String typeSelection = "";
		    int qtySelection = 0;
		    double n1, n2;

		    do {
		    	System.out.println("----- Calculadora Java -----");
			    System.out.println("Selecione uma operação e digite o número:");
			    System.out.println("1 - Soma.");
			    System.out.println("2 - Subtração.");
			    System.out.println("3 - Multiplicação.");
			    System.out.println("4 - Divisão.");
			    System.out.println("5 - Sair.");

		     	operation = scan.next();

		     	if (operation.equals("1") || operation.equals("2") || operation.equals("3") || operation.equals("4")) {
		     		again = false;
		     	} else if (operation.equals("5")) {
		     		return;
		     	}
		    } while (again);

		    do {
		    	System.out.println("Será uma " + operation + " de quantos números? (Mínimo de 2 números!)");
		    	qtySelection = scan.nextInt();
		    } while (qtySelection < 2);

		    do {
		    	System.out.println("Selecione uma opção:");
		    	System.out.println("1 - Os números serão do tipo inteiro (int)");
		    	System.out.println("2 - Os números serão do tipo ponto flutuante (float)");
		    	System.out.println("3 - Os números serão do tipo ponto flutuante (double)");
		    	System.out.println("Total: " + qtySelection + " números.");
		    	typeSelection = scan.next();
		    	again = !typeSelection.equals("1") && !typeSelection.equals("2") && !typeSelection.equals("3");
		    } while (again);

		    do {
		    	double resultado = 0;
		    	switch (operation) {
		        	case "1":
		        		ICalculadora soma = new Soma();
		        		if (qtySelection > 2) {
		        			switch (typeSelection) {
					            case "1":
					            	resultado = soma.calcula(makeIntArrays(qtySelection));
					            	System.out.println("O resultado da soma solicitada é " + ((int) resultado) + ".");
					            	break;
					            case "2":
						            resultado = soma.calcula(makeFloatArrays(qtySelection));
						            System.out.println("O resultado da soma solicitada é " + ((float) resultado) + ".");
						            break;
					            case "3":
					            	resultado = (Double) soma.calcula(makeDoubleArrays(qtySelection));
						            System.out.println("O resultado da soma solicitada é " + resultado + ".");
						            break;
			        		}
		        		} else {
		        			switch (typeSelection) {
					            case "1":
						      	   	System.out.println("Digite o 1º número: ");
						      	   	n1 = scan.nextInt();
						      	   	System.out.println("Digite o 2º número: ");
						      	   	n2 = scan.nextInt();
						      	   	resultado = soma.calcula(n1, n2);
						      	   	System.out.println("O resultado da soma solicitada é " + ((int) resultado) + ".");
						      	   	break;
					            case "2":
						      	   	System.out.println("Digite o 1º número: ");
						      	   	n1 = scan.nextInt();
						      	   	System.out.println("Digite o 2º número: ");
						      	   	n2 = scan.nextInt();
						      	   	resultado = soma.calcula(n1, n2);
						      	   	System.out.println("O resultado da soma solicitada é " + ((float) resultado) + ".");
						      	   	break;
					            case "3":
						      	   	System.out.println("Digite o 1º número: ");
						      	   	n1 = scan.nextInt();
						      	   	System.out.println("Digite o 2º número: ");
						      	   	n2 = scan.nextInt();
						      	   	resultado = soma.calcula(n1, n2);
						      	   	System.out.println("O resultado da soma solicitada é " + ((double) resultado) + ".");
						      	   	break;
		        			}
		        		}
		        		break;
			        case "2":
			        	Subtracao subtracao = new Subtracao();
			        	switch (typeSelection) {
				            case "1":
				            	resultado = subtracao.calcula(makeIntArrays(qtySelection));
				            	System.out.println("O resultado da subtracao solicitada é " + ((int) resultado) + ".");
				            	break;
				            case "2":
				            	resultado = subtracao.calcula(makeFloatArrays(qtySelection));
				            	System.out.println("O resultado da subtracao solicitada é " + ((float) resultado) + ".");
				            	break;
				            case "3":
				            	resultado = subtracao.calcula(makeDoubleArrays(qtySelection));
				            	System.out.println("O resultado da subtracao solicitada é " + resultado + ".");
				            	break;
				        }
			        	break;
			        case "3":
			        	Multiplicacao multiplicacao = new Multiplicacao();
			        	switch (typeSelection) {
				            case "1":
				            	resultado = (Integer) multiplicacao.calcula(makeIntArrays(qtySelection));
					            System.out.println("O resultado da multiplicacao solicitada é " + ((int) resultado) + ".");
					            break;
				            case "2":
					            resultado = (Float) multiplicacao.calcula(makeFloatArrays(qtySelection));
					            System.out.println("O resultado da multiplicacao solicitada é " + ((float) resultado) + ".");
					            break;
				            case "3":
					            resultado = (Double) multiplicacao.calcula(makeDoubleArrays(qtySelection));
					            System.out.println("O resultado da multiplicacao solicitada é " + resultado + ".");
					            break;
				        }
			        	break;
			        case "4":
			        	Divisao divisao = new Divisao();
			        	switch (typeSelection) {
				            case "1":
				            	resultado = divisao.calcula(makeIntArrays(qtySelection));
				              	System.out.println("O resultado da divisao solicitada é " + ((int) resultado) + ".");
				              	break;
				            case "2":
					            resultado = divisao.calcula(makeFloatArrays(qtySelection));
					            System.out.println("O resultado da divisao solicitada é " + ((float) resultado) + ".");
					            break;
				            case "3":
				            	resultado = divisao.calcula(makeDoubleArrays(qtySelection));
					            System.out.println("O resultado da divisao solicitada é " + resultado + ".");
					            break;
			        	}
		          break;
		        default:
		        	System.out.println("Operação inválida. Tente novamente.");
		        	again = true;
		    	}
		    } while (again);
	}
}