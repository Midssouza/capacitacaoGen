package Tarefa2;

import java.util.Scanner;

public class exercicio1 {

public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in);
		int maior=0;
		
		
		System.out.println("Digite o valor 1:");
		int valor1 = ler.nextInt();
		System.out.println("Digite o valor 2:");
		int valor2 = ler.nextInt();
		System.out.println("Digite o valor 3:");
		int valor3 = ler.nextInt();
		
		if (valor1>=valor2 && valor1 >= valor3) {
			System.out.println(valor1);
		}
		else if(valor2>=valor1 && valor2>=valor3) {
			System.out.println(valor2);
		}
		else if (valor3 >= valor1 && valor3 >= valor2) {
			System.out.println(valor3);
		}
		

	}
}
