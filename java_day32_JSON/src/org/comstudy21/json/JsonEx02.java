package org.comstudy21.json;

import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonEx02 {
	public static void main(String[] args) {
		// json 파일의 데이터를 읽어들인다.
		InputStream is = JsonEx02.class.getResourceAsStream("info.json");
		JSONTokener tokener = new JSONTokener(is);
		
		// JSONObject -> JSONArray 객체로 반환한다.
		JSONObject object = new JSONObject(tokener);
		JSONArray studentArray = object .getJSONArray("studentArray");
		
		System.out.println(studentArray);
		
		for(int i=0; i<studentArray.length(); i++) {
			JSONObject student = studentArray.getJSONObject(i);
			System.out.print(student.getString("name") + " | ");
			System.out.print(student.getString("address") + " | ");
			System.out.println(student.getString("phone"));
		}
	}
}
