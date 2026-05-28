package be_study.quiz.quiz34;

import java.util.ArrayList;

public class Kitchen {

//주방공간
//- 공간이 몇평인지
//- 벽지색상이 어떤지
//- 층고가 얼마나 되는지
	
	int floorSpace; //몇평 30평 50평
	String wallColor; //벽지색상
	int floorHeight; // 층고높이   단위?  2.5m  250cm  2500mm   1200mm
	
	//주방에 냉장고
	Refrigerator refrigerator;
	
	GasRange gasRange; //가스렌지
	
	Sink sink; //주방에 싱크대
	
	//TrashCan trashCan; //주방에 쓰레기통 한개
	//TrashCan[] trashCan;
	ArrayList<TrashCan> trashCanList;  //주방에 쓰레기통이 여러개
	
	ArrayList<Cup> cupList;  //주방에 컵 여러개
}
