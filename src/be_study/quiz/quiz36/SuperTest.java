package be_study.quiz.quiz36;

public class SuperTest {
	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc orc = new Orc("오크", 80);
		//System.out.println("Orc { name : ");
		System.out.println(orc.toString());
		
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior ow = new OrcWarrior("오크전사", 120, 3);
		System.out.println(ow.toString());
		
		System.out.println(orc); //객체 출력 -> 기본적으로 toString() 호출
		System.out.println(ow);
	}
}

class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	//객체가 가지고 있는 정보를 정리해서 String 으로 리턴
	public String toString() {
		//System.out.println("직접 값을 출력");
		String str = "Orc { name : " + name + " , hp : " + hp + " }";
		return str;
	}
}

class OrcWarrior extends Orc {
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

	// 메소드 오버라이딩!
	public String toString() {
		//String str = "OrcWarrior { name : " + name + " , hp : " + hp + " }";
		//printf 
		//String str = String.format("OrcWarrior { name : %s , hp : %d , amor : %d }", name, hp, amor);
		//return str;
		return String.format("OrcWarrior { name : %s , hp : %d , amor : %d }", name, hp, amor);
	}
}
















