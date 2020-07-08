package org.comstudy21.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonEx04_filein {

	public static void main(String[] args) throws IOException {
		// students.json 파일의 내용을 읽어와서 화면에 출력하는 프로그램
		// FileReader를 이용한다.
		File file = new File("students.json");
		if(file.exists()) {
			FileReader fr = new FileReader(file);
			JSONTokener tokener = new JSONTokener(fr);			
			JSONObject obj = new JSONObject(tokener);
			
			System.out.println("cnt => " + obj.getDouble("cnt"));
			JSONArray stuArr = obj.getJSONArray("studentArray");
			Vector<Vector> vector = new Vector<Vector>();
			for(int i = 0; i < stuArr.length(); i++) {
				JSONObject jsonObj = (JSONObject)stuArr.get(i);
				
				Vector v = new Vector();
				v.add(jsonObj.get("name"));
				v.add(jsonObj.get("phone"));
				v.add(jsonObj.get("address"));
				vector.add(v);
			}
			System.out.println(vector);
		}
		
		

	}

}
