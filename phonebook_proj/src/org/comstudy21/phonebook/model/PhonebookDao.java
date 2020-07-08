package org.comstudy21.phonebook.model;

import java.util.ArrayList;

public class PhonebookDao {
	
	public ArrayList<PhonebookDto> dtoList;
	private int seq = 1;
	
	public PhonebookDao(ArrayList<PhonebookDto> dtoList) {
		this.dtoList = dtoList;
		this.dtoList.add(new PhonebookDto(seq++, "경찰서", "112", "포돌@e.com"));
		this.dtoList.add(new PhonebookDto(seq++, "소방서", "119", "fire@fighter.net"));
		this.dtoList.add(new PhonebookDto(seq++, "콜센터", "123", "question@seoul.com"));
	}
	
	public void insert(PhonebookDto dto) {
		System.out.println(">>> DAO ");
		System.out.println(dto);
		dtoList.add(dto);
	}

	// 원본이 아닌 복사본을 보여준다 => 수정 불가능 하도록
	public ArrayList<PhonebookDto> selectAll() {
		ArrayList<PhonebookDto> list = new ArrayList<PhonebookDto>();
		for(int i = 0; i < dtoList.size(); i++) {
			PhonebookDto dto = dtoList.get(i);
			int idx = dto.getIdx();
			String name = dto.getName();
			String phone = dto.getPhone();
			String email = dto.getEmail();
			PhonebookDto newDto = new PhonebookDto(idx, name, phone, email);
			list.add(newDto);
		}
		return list;
	}

	public ArrayList<PhonebookDto> select(PhonebookDto originalDto) {
		ArrayList<PhonebookDto> list = new ArrayList<PhonebookDto>();
		for(int i = 0; i < dtoList.size(); i++) {
			String sName = originalDto.getName();
			if(sName.equals(dtoList.get(i).getName())) {	
				PhonebookDto dto = dtoList.get(i);
				int idx = dto.getIdx();
				String name = dto.getName();
				String phone = dto.getPhone();
				String email = dto.getEmail();
				PhonebookDto newDto = new PhonebookDto(idx, name, phone, email);
				list.add(newDto);
			}
		}
		return list;
	}

	public void update(PhonebookDto dto) {
		// idx가 같은 요소를 dto로 교체한다.
		for(int i = 0; i < dtoList.size(); i++) {
			int idx = dto.getIdx();
			if(dtoList.get(i).getIdx() == idx) {
				dtoList.set(i, dto);
				return;
			}
		}
		
	}

	public void delete(PhonebookDto dto) {
		for(int i = 0; i < dtoList.size(); i++) {
			int idx = dto.getIdx();
			if(dtoList.get(i).getIdx() == idx) {
				dtoList.remove(i);
				return;
			}
		}
		
	}

}


// 싱글톤(기능만 있기에 객체가 여러개 필요 없음) - 오직 객체가 하나뿐
// 기본 원칙 : 생성자를 private로

//private PhonebookDao() {
//	
//}
//
//// 인스턴스 생성
//private static PhonebookDao instance = null; 
//
//public static PhonebookDao getInstance() {
//	if(instance == null) {
//		instance = new PhonebookDao();
//	}
//	return instance;
//}
//
//// dtolist 를 세터로 만든다
//public void setDtoList(ArrayList<PhonebookDto> dtoList) {
//	this.dtoList = dtoList;
//}
