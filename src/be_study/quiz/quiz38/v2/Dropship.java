package be_study.quiz.quiz38.v2;

public class Dropship extends Unit { // 수송선
	// int x, y; // 현재 위치
	void move(int x, int y) {
		/* 지정된 위치로 이동 */
		System.out.println("드랍쉽 날아서 이동한다");
	}

	// void stop() { /* 현재 위치에 정지*/ }
	void load() {
		/* 선택된 대상을 태운다. */
	}

	void unload() {
		/* 선택된 대상을 내린다. */
	}
}