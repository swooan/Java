package org.comstudy21.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonEx01 {

	public static void main(String[] args) {
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
		
		System.out.println(jsonobj.toString(2));
		
//		System.out.println(studentArray.toString(2));
//		System.out.println("���� : " + studentArray.getJSONObject(0).getString("name"));
	}

}
