package Aplicação;

import Entities.Account;
import Entities.BusinessAccount;
import Entities.SavingsAccount;

public class Programa{
	
	public static void main(String[] args)   {
		
		Account acc = new Account(1001, "Anderson", 0,0);
		BusinessAccount bcc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		 
		// upcasting // é eu pegar um objeto do tipo businessAccount e atribuir em uma varialvel do tipo account
	
		Account acc1 = bcc;
		Account acc2 = new BusinessAccount(1003, "Franciele", 0,0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0 , 0.01);
		
		// downcastins // é converter um objeto da super classe para subclasse // processo inverso..
		
		BusinessAccount acc4 =(BusinessAccount) acc2;
		acc4.loan(100.0);
	}
}


	
