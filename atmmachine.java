import java.util.Scanner;

class atmmachine{
	
	public static void main(String[] args){

		Integer nota100 = 100;
		Integer nota50 = 50;
		Integer nota10 = 10;
		Integer nota5 = 5;
		Integer nota1 = 1;

		Scanner usuario = new Scanner(System.in);
		System.out.println("Digite o valor que você deseja sacar. Valor mínimo: R$10,00. Valor máximo: R$10000,00");
		Integer valor = usuario.nextInt();	

		if(valor >= 10 && valor <= 10000) {
			if(nota100 > 0) {
				nota100 = valor / 100; 
				valor = valor % 100;   
				System.out.println(nota100 + " notas de 100");
			} 
			if(nota50 > 0) {
				nota50 = valor / 50;
				valor = valor % 50;
				System.out.println(nota50 + " notas de 50");
			}
			if(nota10 > 0) {
				nota10 = valor / 10;
				valor = valor % 10;
				System.out.println(nota10 + " notas de 10");
			}if(nota5 > 0) {
				nota5 = valor / 5;
				valor = valor % 5;
				System.out.println(nota5 + " notas de 5");
			}if(nota1 > 0) {
				nota1 = valor / 1;
				valor = valor % 1;
				System.out.println(nota1 + " notas de 1");
			}
		}else {
			System.out.println("Não é possível realizar o saque");
		}	
	}
}