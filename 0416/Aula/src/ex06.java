import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salario, dif;
		double novsal=0;
		int ano;
		String cargo;
		
		System.out.println("Qual o seu salario: R$");
		salario= in.nextDouble();
		
		System.out.println("Qual o seu cargo: ");
		cargo= in.next();
		
		System.out.println("Quantos anos voce esta na empresa");
		ano = in.nextInt();
		
		if(cargo.equalsIgnoreCase("Gerente")) {
			if(ano>=5) {novsal = salario * 1.10;}
			else if(ano >= 3) {novsal = salario * 1.09;}
			else if(ano<3) {novsal = salario * 1.08;}		
		}
		else if(cargo.equalsIgnoreCase("Engenheiro")) {
			if(ano>=5) {novsal = salario * 1.11;}
			else if(ano >= 3) {novsal = salario * 1.10;}
			else if(ano<3) {novsal = salario * 1.09;}		
		}
		else if(cargo.equalsIgnoreCase("Tecnico")) {
			if(ano>=5) {novsal = salario * 1.12;}
			else if(ano >= 3) {novsal = salario * 1.11;}
			else if(ano<3) {novsal = salario * 1.10;}		
		}
		else {
			novsal = salario * 1.05;
		}
		
		dif = novsal - salario;
		System.out.println("Salario antigo "+salario);
		System.out.println("Aumento "+dif);
		System.out.println("Novo salario "+novsal);
		in.close();
	}

}
