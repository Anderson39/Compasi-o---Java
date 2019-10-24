package Aplicação;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Departament;
import Entities.HourContract;
import Entities.Worker;
import Entities.enums.WorkerLevel;

public class Programa {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy");
		
		System.out.print("Enter department's name: ");
		String DepartamentName = sc.nextLine();
		System.out.print("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		//Associação de objetos
		// em um novo objeto Worker foi instanciado // os dados desse objeto é o nome que eu digitei//uma intancia de worker level no valor que digitei
		// e o valor do salario base que digitei// associado ao objeto que instaciei terá um outo objeto do tipo departamento e o nome do departamento 
		// tera o nome que eu digitei
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament ( DepartamentName) );
			
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		// para ler os dados do trabalhador eu vou fazer um for
		for(int i=0; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data");
			System.out.print("Date (DD/MM/YYYY) ");
			//agora tera que ler uma variavel do tipo Date// para criar uma data neste formato é preciso fazer"SimpleDateFormat = ***e intancia com a 
			// mascara (dd/mm/yyyy)
		   Date contractdate = sdf.parse(sc.next());
		   System.out.println("Value per hour: ");
		   double valuePerHour = sc.nextDouble();
		   System.out.println("Duration (hours): ");
		   int hour = sc.nextInt();
		   // agora irei intanciar o meu contrato
		   //2 agora para associar meu contrato com meu trabalhador terei que fazer o método a seguir
		   HourContract contract = new HourContract(contractdate, valuePerHour, hour);
		   worker.addContract(contract);
		}// agora que intanciei os contratos vou pedir que os usuarios entre com mes e ano//
		// irei fazer o recorte das Strings//na hora do recorte da string devo contar mais de uma posição
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndyear = sc.next();
		//agora tenho que converterss minha string para inteiro (intege)
		int month = Integer.parseInt(monthAndyear.substring(0,2));
		int year = Integer.parseInt(monthAndyear.substring(3));
		
		System.out.println("Nome: " + worker.getName());
		
		System.out.println("Departament: " + worker.getDepartament().getName());
		
		System.out.println("Income for: " + monthAndyear+ ":" + String.format("%2f", worker.income(year, month)));
		
		sc.close();
	}	
}
