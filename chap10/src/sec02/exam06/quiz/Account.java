package sec02.exam06.quiz;

public class Account {
	//필드
	String user;  //예금주
	long balance;  //잔액
	
	
	//생성자
	void Acount() {
		
	}
	
	public Account (String user, long balance) {
		this.user = user;
		this.balance = balance;
	}
	
	//Getter()
	public long getBalance() {
		return balance;
	}

	

	//메소드
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원이 입금되었습니다. [잔액: "+ balance + "원]");
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("잔액이 " + (amount - balance) + "원 부족합니다.");
		}
		balance -= amount;
		System.out.println(amount + "원이 출금되었습니다. [잔액: "+ balance + "원]");
	}
	
	

}
