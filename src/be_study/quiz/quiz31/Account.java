package be_study.quiz.quiz31;

public class Account {
	String num; // 계좌번호
	int balance; // 잔액

	public Account(String str, int i) {
		num = str;
		balance = i;
	}

	public String toString() {
		return String.format("Account { num: %s, balance: %d }", num, balance);
	}

	public boolean transfer(Account target, int amount) {
		 /* 1. 잔액이 부족한 경우 false를 반환하세요. */
		if ( balance < amount ) {  // 9000 < 10000   5000 < 1000
			return false;
		}

		/* 2. 현재 잔액에서 송금액을 이체대상 계좌로 전달하세요. */
		balance -= amount;
		target.balance += amount;
		return true;
	}
}