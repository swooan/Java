package org.comstudy21.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonEx03_fileio {

	public static void main(String[] args) throws IOException {
		// �ڹ� ���̺귯�� ����� :
		// https:// mvnrepository.com/
		
		JSONObject student = new JSONObject();
		JSONArray studentArray = new JSONArray();
		
		student.put("name", "ȫ�浿");
		student.put("phone", "010-1111-1111");
		student.put("address", "����� ���α�");
		
		studentArray.put(student);
		
//		System.out.println(studentArray);
//		System.out.println("���� : " + studentArray.getJSONObject(0).getString("name"));
		
		student = new JSONObject();
		
		student.put("name", "��浿");
		student.put("phone", "010-2222-2222");
		student.put("address", "��õ�� ��㵿");
		
		studentArray.put(student);
		
		JSONObject jsonobj = new JSONObject();
		jsonobj.put("studentArray", studentArray);
		
		jsonobj.put("cnt", 2);
		
		System.out.println(jsonobj.toString(2));
		
//		System.out.println(studentArray.toString(2));
//		System.out.println("���� : " + studentArray.getJSONObject(0).getString("name"));
		
		// FileWriter �� �̿��� file ����
		File file = new File("students.json");
		if(!file.exists()) {
			if(file.createNewFile()) {
				System.out.println("�� ���� ����!");
			}
		}
		FileWriter fw = new FileWriter(file);
		
		fw.write(jsonobj.toString(2));
		System.out.println("���� ���� �Ϸ�!");
		if(fw != null) {
			fw.close();
		}

	}

}
