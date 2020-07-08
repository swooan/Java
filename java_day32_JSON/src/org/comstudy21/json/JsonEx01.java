package org.comstudy21.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonEx01 {

	public static void main(String[] args) {
		// 자바 라이브러리 저장소 :
		// https:// mvnrepository.com/
		
		JSONObject student = new JSONObject();
		JSONArray studentArray = new JSONArray();
		
		student.put("name", "홍길동");
		student.put("phone", "010-1111-1111");
		student.put("address", "서울시 종로구");
		
		studentArray.put(student);
		
//		System.out.println(studentArray);
//		System.out.println("성명 : " + studentArray.getJSONObject(0).getString("name"));
		
		student = new JSONObject();
		
		student.put("name", "김길동");
		student.put("phone", "010-2222-2222");
		student.put("address", "이천시 고담동");
		
		studentArray.put(student);
		
		JSONObject jsonobj = new JSONObject();
		jsonobj.put("studentArray", studentArray);
		
		System.out.println(jsonobj.toString(2));
		
//		System.out.println(studentArray.toString(2));
//		System.out.println("성명 : " + studentArray.getJSONObject(0).getString("name"));
	}

}
