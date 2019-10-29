package Entities;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance;
	// construtor padrão
  public Account(){
	  
  }
//construtor com argumento 
public Account(Integer number, String holder, Double balance) {
	
	this.number = number;
	this.holder = holder;
	this.balance = balance;
}

public Integer getNumber() {
	return number;
}

public void setNumber(Integer number) {
	this.number = number;
}

public String getHolder() {
	return holder;
}

public void setHolder(String holder) {
	this.holder = holder;
}

public Double getBalance() {
	return balance;
}
// retirar o setBalance pq não posso mudar o saldo da conta livrimente
/*public void setBalance(Double balance) {
	this.balance = balance;*/

  public void withdraw(double amount) {
	  balance -= amount;
  }
  public void deposit(double amount ) {
	  balance += amount;
  }
}


