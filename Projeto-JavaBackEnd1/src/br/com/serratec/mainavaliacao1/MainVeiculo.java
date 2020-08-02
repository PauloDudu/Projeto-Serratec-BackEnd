package br.com.serratec.mainavaliacao1;

import java.util.Scanner;

import br.com.serratec.avaliacao1.Ipva;

public class MainVeiculo {
	public static void main(String[] args) {
		String modelo1;
		String placa1;
		String combus;
		double valorVeiculo;
		double txLicc;
		int res;
		int boo = 0;

		Scanner scn = new Scanner(System.in);

		while (boo == 0) {
			System.out.println("informe o modelo do veiculo");
			modelo1 = scn.next();

			System.out.println("Informe a placa: ");
			placa1 = scn.next();

			System.out.println("Informe o combustivel: ");
			combus = scn.next();

			System.out.println("informe o valor do veiculo");
			valorVeiculo = scn.nextDouble();

			System.out.println("informe a taxa de licenciamento do veiculo");
			txLicc = scn.nextDouble();

			Ipva car = new Ipva(modelo1, placa1, combus.toLowerCase(), valorVeiculo, txLicc);

			car.calcularIpva();

			System.out.println("Deseja continuar? [1]Sim || [2]Nao  ");
			res = scn.nextInt();

			if (res == 1) {
				System.out.println("--------------------------------------------------------------");
				boo = 0;
			} else if (res == 2) {
				System.out.println("Até mais!!! ;)");
				boo = 1;
			} else {
				System.out.println("Valor invalido!!");
				boo = 1;
			}

		}
	}
}
