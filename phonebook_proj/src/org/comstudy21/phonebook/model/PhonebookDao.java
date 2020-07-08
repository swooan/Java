package org.comstudy21.phonebook.model;

import java.util.ArrayList;

public class PhonebookDao {
	
	public ArrayList<PhonebookDto> dtoList;
	private int seq = 1;
	
	public PhonebookDao(ArrayList<PhonebookDto> dtoList) {
		this.dtoList = dtoList;
		this.dtoList.add(new PhonebookDto(seq++, "������", "112", "����@e.com"));
		this.dtoList.add(new PhonebookDto(seq++, "�ҹ漭", "119", "fire@fighter.net"));
		this.dtoList.add(new PhonebookDto(seq++, "�ݼ���", "123", "question@seoul.com"));
	}
	
	public void insert(PhonebookDto dto) {
		System.out.println(">>> DAO ");
		System.out.println(dto);
		dtoList.add(dto);
	}

	// ������ �ƴ� ���纻�� �����ش� => ���� �Ұ��� �ϵ���
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
		// idx�� ���� ��Ҹ� dto�� ��ü�Ѵ�.
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


// �̱���(��ɸ� �ֱ⿡ ��ü�� ������ �ʿ� ����) - ���� ��ü�� �ϳ���
// �⺻ ��Ģ : �����ڸ� private��

//private PhonebookDao() {
//	
//}
//
//// �ν��Ͻ� ����
//private static PhonebookDao instance = null; 
//
//public static PhonebookDao getInstance() {
//	if(instance == null) {
//		instance = new PhonebookDao();
//	}
//	return instance;
//}
//
//// dtolist �� ���ͷ� �����
//public void setDtoList(ArrayList<PhonebookDto> dtoList) {
//	this.dtoList = dtoList;
//}
