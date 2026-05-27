package be_study.quiz.quiz30.q3;

public class Account {
	
	//3.
//	다음을 만족하는 클래스 Account를 작성하시오.
//	· 다음의 2 개의 필드를 선언
//	private String owner;
//	private long balance;
//	· 위 모든 필드에 대한 getter와 setter의 구현
//	· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
	
//	다음 기능을 추가하여 작성하시오.
//	· 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드
//	public long deposit(long amount)
	
//	· 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
//	public long withdraw(long amount)
	
//	· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한
//	저축과 인출을 수행한 후 잔금을 출력
	
//	메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
//	· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
//	· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력

	private String owner;
	private long balance;
	
	public Account() {
		owner = null;
		balance = 0;
	}
	
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	
	public Account(long balance) {
		owner = null;
		this.balance = balance;
	}

	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public Account(long balance, String owner) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	public long deposit(long amount) {
		//balance 계좌 잔액 
		this.balance += amount;  //계좌 잔액을 입금한 금액(amount) 만큼 증가
		
		return balance; //입금 후 최종 잔액 반환
		
		//기존잔액 : 3만원   입금 : 1만원
		// 1) 입금한 금액	: 1만원			계좌.getBalance()
		// 2) 입금후 잔액 	: 4만원	<--		계좌.deposit(10000);
		
	}
	
	public long withdraw(long amount) {  //출금 
		
		// balance 잔액  amount 출금하려는 금액
		
		// 1) 출금후 잔액?
		// 2) 출금한 금액?
		
		
		//잔액 이상 출금 시도시 
		if(amount > balance) {
			System.out.println("잔액이 부족합니다.");
			return balance;   //잔액
			
			//return -99;  //잔액부족 정보전달하는 기준 코드 역할
			
			//기본타입 : 금액    돈 or 결과코드
			
			// 결과 정보를 전달하는 객체
			// 출금입금, 성공실패, 잔액얼마, 얼마출금, 얼마입금
		}
		
		
		balance = balance - amount;
		return balance;
	}
}










