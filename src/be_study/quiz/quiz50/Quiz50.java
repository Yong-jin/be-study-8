package be_study.quiz.quiz50;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jsonString = ""
				+ "{"
				+ "\"도서관\": {"
				+ "\"위치\": \"서울특별시 강남구\","
				+ "\"운영시간\": {"
				+ "\"평일\": [\"09:00\", \"21:00\"],"
				+ "\"주말\": [\"10:00\", \"18:00\"]"
				+ "},"
				+ "\"책목록\": ["
				+ "{"
				+ "\"제목\": \"자바 프로그래밍\","
				+ "\"저자\": \"홍길동\","
				+ "\"출판연도\": 2023,"
				+ "\"가격\": 25000,"
				+ "\"대출가능\": true,"
				+ "\"카테고리\": [\"프로그래밍\", \"자기계발\"]"
				+ "},"
				+ "{"
				+ "\"제목\": \"데이터 분석 입문\","
				+ "\"저자\": \"김철수\","
				+ "\"출판연도\": 2022,"
				+ "\"가격\": 28000,"
				+ "\"대출가능\": false,"
				+ "\"카테고리\": [\"데이터\", \"분석\"]"
				+ "}"
				+ "],"
				+ "\"특별서비스\": {"
				+ "\"키오스크\": true,"
				+ "\"스터디룸\": {"
				+ "\"개수\": 5,"
				+ "\"예약 가능\": true,"
				+ "\"비용\": {"
				+ "\"1시간당\": 5000,"
				+ "\"하루\": 30000"
				+ "}"
				+ "}"
				+ "}"
				+ "}"
				+ "}";
		
		JSONParser parser = new JSONParser();
		try {
			JSONObject jsonObj = (JSONObject)parser.parse(jsonString);
			
			JSONObject library = (JSONObject)jsonObj.get("도서관");
			
			System.out.println(library.get("위치"));
			
			
			JSONObject openHour = (JSONObject)library.get("운영시간");
			
			JSONArray weekday = (JSONArray)openHour.get("평일");
			JSONArray weekend = (JSONArray)openHour.get("주말");
			
			System.out.println("평일 : " + weekday.get(0) + "~" + weekday.get(1));
			System.out.println("주말 : " + weekend.get(0) + "~" + weekend.get(1));
			
			JSONArray bookList = (JSONArray)library.get("책목록");
			
			for(int i=0; i<bookList.size(); i++) {
				JSONObject book = (JSONObject)bookList.get(i);
				
				System.out.println("-----book----" + i);
				System.out.println(book.get("제목"));
				System.out.println(book.get("저자"));
				System.out.println(book.get("출판연도"));
				System.out.println(book.get("가격"));
				System.out.println(book.get("대출가능"));
				
				System.out.println("카테고리");
				JSONArray category = (JSONArray)book.get("카테고리");
				for(int j=0; j<category.size(); j++) {
					System.out.println(category.get(j));
				}
				
				
			}
			
			
			JSONObject special = (JSONObject)library.get("특별서비스");
			System.out.println(special.get("키오스크"));
			JSONObject studyRoom = (JSONObject)special.get("스터디룸");
			System.out.println(studyRoom.get("개수"));
			System.out.println(studyRoom.get("예약 가능"));
			JSONObject price = (JSONObject)studyRoom.get("비용");
			System.out.println(price.get("1시간당"));
			System.out.println(price.get("하루"));
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		


	}

}


















