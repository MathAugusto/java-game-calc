package model;

import java.util.Random;

public class Calcular {

	private int dificuldade;
	private int valor1;
	private int valor2;
	private int operacao;
	private int resultado;

	public Calcular(int dificuldade) {

		Random rand = new Random();

		this.operacao = rand.nextInt(3); // 0=soma,1=subtrai,2=multiplica
		this.dificuldade = dificuldade;

		if (dificuldade == 1) {
			// facil
			this.valor1 = rand.nextInt(10); // 0 ate 9
			this.valor2 = rand.nextInt(10); // 0 ate 9
		} else if (dificuldade == 2) {
			// medio
			this.valor1 = rand.nextInt(100); // 0 ate 99
			this.valor2 = rand.nextInt(100); // 0 ate 99
		} else if (dificuldade == 3) {
			// dificil
			this.valor1 = rand.nextInt(1000); // 0 ate 999
			this.valor2 = rand.nextInt(1000); // 0 ate 999
		} else if (dificuldade == 4) {
			// insano
			this.valor1 = rand.nextInt(10000); // 0 ate 99999
			this.valor2 = rand.nextInt(10000); // 0 ate 99999
		} else {
			// ultra
			this.valor1 = rand.nextInt(100000); // 0 ate 999999
			this.valor2 = rand.nextInt(100000); // 0 ate 999999
		}

	}

	public int getDificuldade() {
		return dificuldade;
	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getOperacao() {
		return operacao;
	}

	public int getResultado() {
		return resultado;
	}

	public String toString() {
		String op;
		if (this.getOperacao() == 0) {
			op = "SOMAR";
		} else if (this.getOperacao() == 1) {
			op = "SUBTRAIR";
		} else if (this.getOperacao() == 2) {
			op = "MULTIPLICAR";
		} else {
			op = "Operação desconhecida";
		}
		return "Valor 1: " + this.getValor1() + "\nValor 2: " + this.getValor2() + "\nDificuldade: "
				+ this.getDificuldade() + "\nOperação: " + op;
	}

// OPERACOES	
// SOMA
	public boolean somar(int resposta) {
		this.resultado = this.getValor1() + this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta CORRETA");
			certo = true;
		} else {
			System.out.println("Resposta ERRADA");

		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + "=" + this.getResultado());
		return certo;
	}

// SUBTRAÇÃO	
	public boolean subtrair(int resposta) {
		this.resultado = this.getValor1() - this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta CORRETA");
			certo = true;
		} else {
			System.out.println("Resposta ERRADA");

		}
		System.out.println(this.getValor1() + " - " + this.getValor2() + "=" + this.getResultado());
		return certo;
	}

// MULTIPLICACAO
	public boolean multiplicar(int resposta) {
		this.resultado = this.getValor1() * this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta CORRETA");
			certo = true;
		} else {
			System.out.println("Resposta ERRADA");

		}
		System.out.println(this.getValor1() + " * " + this.getValor2() + "=" + this.getResultado());
		return certo;
	}

}
