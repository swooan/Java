package model;

import java.util.ArrayList;

public class BaseballDao {
	
	public ArrayList<BaseballDto> dtoList11;
	public ArrayList<BaseballDto> dtoList12;
	public ArrayList<BaseballDto> dtoList13;
	public ArrayList<BaseballDto> dtoList21;
	public ArrayList<BaseballDto> dtoList22;
	public ArrayList<BaseballDto> dtoList23;
	public ArrayList<BaseballDto> dtoList31;
	public ArrayList<BaseballDto> dtoList32;
	public ArrayList<BaseballDto> dtoList33;
	
	public BaseballDao() {
		dtoList11 = new ArrayList<BaseballDto>();
		dtoList12 = new ArrayList<BaseballDto>();
		dtoList13 = new ArrayList<BaseballDto>();
		dtoList21 = new ArrayList<BaseballDto>();
		dtoList22 = new ArrayList<BaseballDto>();
		dtoList23 = new ArrayList<BaseballDto>();
		dtoList31 = new ArrayList<BaseballDto>();
		dtoList32 = new ArrayList<BaseballDto>();
		dtoList33 = new ArrayList<BaseballDto>();
	}
	
	public BaseballDao(ArrayList<BaseballDto> dtolist11, ArrayList<BaseballDto> dtolist12,
			ArrayList<BaseballDto> dtolist13,ArrayList<BaseballDto> dtolist21,ArrayList<BaseballDto> dtolist22,
			ArrayList<BaseballDto> dtolist23,ArrayList<BaseballDto> dtolist31,ArrayList<BaseballDto> dtolist32,
			ArrayList<BaseballDto> dtolist33) {
		this.dtoList11 = dtolist11;
		this.dtoList12 = dtolist12;
		this.dtoList13 = dtolist13;
		this.dtoList21 = dtolist21;
		this.dtoList22 = dtolist22;
		this.dtoList23 = dtolist23;
		this.dtoList31 = dtolist31;
		this.dtoList32 = dtolist32;
		this.dtoList33 = dtolist33;
	}
	

	public void insert11(BaseballDto dto11) {
		String name = dto11.name;
		int arr = dto11.arr;
		int col = dto11.col;
		dtoList11.add(dto11);
	}
	public void insert12(BaseballDto dto12) {
		String name = dto12.name;
		int arr = dto12.arr;
		int col = dto12.col;
		dtoList12.add(dto12);
	}
	public void insert13(BaseballDto dto13) {
		String name = dto13.name;
		int arr = dto13.arr;
		int col = dto13.col;
		dtoList13.add(dto13);
	}
	public void insert21(BaseballDto dto21) {
		String name = dto21.name;
		int arr = dto21.arr;
		int col = dto21.col;
		dtoList21.add(dto21);
	}
	public void insert22(BaseballDto dto22) {
		String name = dto22.name;
		int arr = dto22.arr;
		int col = dto22.col;
		dtoList22.add(dto22);
	}
	public void insert23(BaseballDto dto23) {
		String name = dto23.name;
		int arr = dto23.arr;
		int col = dto23.col;
		dtoList23.add(dto23);
	}
	public void insert31(BaseballDto dto31) {
		String name = dto31.name;
		int arr = dto31.arr;
		int col = dto31.col;
		dtoList31.add(dto31);
	}
	public void insert32(BaseballDto dto32) {
		String name = dto32.name;
		int arr = dto32.arr;
		int col = dto32.col;
		dtoList32.add(dto32);
	}
	public void insert33(BaseballDto dto33) {
		String name = dto33.name;
		int arr = dto33.arr;
		int col = dto33.col;
		dtoList33.add(dto33);
	}

	public ArrayList<BaseballDto> selectAll11() {
		ArrayList<BaseballDto> list11 = new ArrayList<BaseballDto>();
		for(int i = 0; i < dtoList11.size(); i++) {
			BaseballDto dto11 = dtoList11.get(i);
			String name = dto11.getName();
			int arr = dto11.getArr();
			int col = dto11.getCol();
			BaseballDto newDto11 = new BaseballDto(name, arr, col);
			list11.add(newDto11);
		}
		return list11;
	}
	public ArrayList<BaseballDto> selectAll12() {
		ArrayList<BaseballDto> list12 = new ArrayList<BaseballDto>();
		for(int i = 0; i < dtoList12.size(); i++) {
			BaseballDto dto12 = dtoList12.get(i);
			String name = dto12.getName();
			int arr = dto12.getArr();
			int col = dto12.getCol();
			BaseballDto newDto12 = new BaseballDto(name, arr, col);
			list12.add(newDto12);
		}
		return list12;
	}
	public ArrayList<BaseballDto> selectAll13() {
		ArrayList<BaseballDto> list13 = new ArrayList<BaseballDto>();
		for(int i = 0; i < dtoList13.size(); i++) {
			BaseballDto dto13 = dtoList13.get(i);
			String name = dto13.getName();
			int arr = dto13.getArr();
			int col = dto13.getCol();
			BaseballDto newDto13 = new BaseballDto(name, arr, col);
			list13.add(newDto13);
		}
		return list13;
	}
	public ArrayList<BaseballDto> selectAll21() {
		ArrayList<BaseballDto> list21 = new ArrayList<BaseballDto>();
		for(int i = 0; i < dtoList21.size(); i++) {
			BaseballDto dto21 = dtoList21.get(i);
			String name = dto21.getName();
			int arr = dto21.getArr();
			int col = dto21.getCol();
			BaseballDto newDto21 = new BaseballDto(name, arr, col);
			list21.add(newDto21);
		}
		return list21;
	}
	public ArrayList<BaseballDto> selectAll22() {
		ArrayList<BaseballDto> list22 = new ArrayList<BaseballDto>();
		for(int i = 0; i < dtoList22.size(); i++) {
			BaseballDto dto22 = dtoList22.get(i);
			String name = dto22.getName();
			int arr = dto22.getArr();
			int col = dto22.getCol();
			BaseballDto newDto22 = new BaseballDto(name, arr, col);
			list22.add(newDto22);
		}
		return list22;
	}
	public ArrayList<BaseballDto> selectAll23() {
		ArrayList<BaseballDto> list23 = new ArrayList<BaseballDto>();
		for(int i = 0; i < dtoList23.size(); i++) {
			BaseballDto dto23 = dtoList23.get(i);
			String name = dto23.getName();
			int arr = dto23.getArr();
			int col = dto23.getCol();
			BaseballDto newDto23 = new BaseballDto(name, arr, col);
			list23.add(newDto23);
		}
		return list23;
	}
	public ArrayList<BaseballDto> selectAll31() {
		ArrayList<BaseballDto> list31 = new ArrayList<BaseballDto>();
		for(int i = 0; i < dtoList31.size(); i++) {
			BaseballDto dto31 = dtoList31.get(i);
			String name = dto31.getName();
			int arr = dto31.getArr();
			int col = dto31.getCol();
			BaseballDto newDto31 = new BaseballDto(name, arr, col);
			list31.add(newDto31);
		}
		return list31;
	}
	public ArrayList<BaseballDto> selectAll32() {
		ArrayList<BaseballDto> list32 = new ArrayList<BaseballDto>();
		for(int i = 0; i < dtoList32.size(); i++) {
			BaseballDto dto32 = dtoList32.get(i);
			String name = dto32.getName();
			int arr = dto32.getArr();
			int col = dto32.getCol();
			BaseballDto newDto32 = new BaseballDto(name, arr, col);
			list32.add(newDto32);
		}
		return list32;
	}
	public ArrayList<BaseballDto> selectAll33() {
		ArrayList<BaseballDto> list33 = new ArrayList<BaseballDto>();
		for(int i = 0; i < dtoList33.size(); i++) {
			BaseballDto dto33 = dtoList33.get(i);
			String name = dto33.getName();
			int arr = dto33.getArr();
			int col = dto33.getCol();
			BaseballDto newDto33 = new BaseballDto(name, arr, col);
			list33.add(newDto33);
		}
		return list33;
	}

	public void delete11(BaseballDto ddto11) {
		for(int k = 0; k < dtoList11.size(); k++) {
			String name = ddto11.getName();
			if(dtoList11.get(k).getName().equals(name)) {
				dtoList11.remove(k);
				return;
			}
		}
		
	}
	public void delete12(BaseballDto ddto12) {
		for(int k = 0; k < dtoList12.size(); k++) {
			String name = ddto12.getName();
			if(dtoList12.get(k).getName().equals(name)) {
				dtoList12.remove(k);
				return;
			}
		}
		
	}
	public void delete13(BaseballDto ddto13) {
		for(int k = 0; k < dtoList13.size(); k++) {
			String name = ddto13.getName();
			if(dtoList13.get(k).getName().equals(name)) {
				dtoList13.remove(k);
				return;
			}
		}
		
	}
	public void delete21(BaseballDto ddto21) {
		for(int k = 0; k < dtoList21.size(); k++) {
			String name = ddto21.getName();
			if(dtoList21.get(k).getName().equals(name)) {
				dtoList21.remove(k);
				return;
			}
		}
		
	}
	public void delete22(BaseballDto ddto22) {
		for(int k = 0; k < dtoList22.size(); k++) {
			String name = ddto22.getName();
			if(dtoList22.get(k).getName().equals(name)) {
				dtoList22.remove(k);
				return;
			}
		}
		
	}
	public void delete23(BaseballDto ddto23) {
		for(int k = 0; k < dtoList23.size(); k++) {
			String name = ddto23.getName();
			if(dtoList23.get(k).getName().equals(name)) {
				dtoList23.remove(k);
				return;
			}
		}
		
	}
	public void delete31(BaseballDto ddto31) {
		for(int k = 0; k < dtoList31.size(); k++) {
			String name = ddto31.getName();
			if(dtoList31.get(k).getName().equals(name)) {
				dtoList31.remove(k);
				return;
			}
		}
		
	}
	public void delete32(BaseballDto ddto32) {
		for(int k = 0; k < dtoList32.size(); k++) {
			String name = ddto32.getName();
			if(dtoList32.get(k).getName().equals(name)) {
				dtoList32.remove(k);
				return;
			}
		}
		
	}
	public void delete33(BaseballDto dto33) {
		for(int k = 0; k < dtoList33.size(); k++) {
			String name = dto33.getName();
			if(dtoList33.get(k).getName().equals(name)) {
				dtoList33.remove(k);
				return;
			}
		}
		
	}

	public void change11(BaseballDto dto11) {
		for(int k = 0; k < dtoList11.size(); k++) {
			int arr = dto11.getArr();
			int col = dto11.getCol();
			if(dtoList11.get(k).getArr() == arr && dtoList11.get(k).getCol() == col) {
				dtoList11.set(k,dto11);
				return;
			}
		}
		
	}
	public void change12(BaseballDto dto12) {
		for(int k = 0; k < dtoList12.size(); k++) {
			int arr = dto12.getArr();
			int col = dto12.getCol();
			if(dtoList12.get(k).getArr() == arr && dtoList12.get(k).getCol() == col) {
				dtoList12.set(k,dto12);
				return;
			}
		}
		
	}
	public void change13(BaseballDto dto13) {
		for(int k = 0; k < dtoList13.size(); k++) {
			int arr = dto13.getArr();
			int col = dto13.getCol();
			if(dtoList13.get(k).getArr() == arr && dtoList13.get(k).getCol() == col) {
				dtoList13.set(k,dto13);
				return;
			}
		}
		
	}
	public void change21(BaseballDto dto21) {
		for(int k = 0; k < dtoList21.size(); k++) {
			int arr = dto21.getArr();
			int col = dto21.getCol();
			if(dtoList21.get(k).getArr() == arr && dtoList21.get(k).getCol() == col) {
				dtoList21.set(k,dto21);
				return;
			}
		}
		
	}
	public void change22(BaseballDto dto22) {
		for(int k = 0; k < dtoList22.size(); k++) {
			int arr = dto22.getArr();
			int col = dto22.getCol();
			if(dtoList22.get(k).getArr() == arr && dtoList22.get(k).getCol() == col) {
				dtoList22.set(k,dto22);
				return;
			}
		}
		
	}
	public void change23(BaseballDto dto23) {
		for(int k = 0; k < dtoList23.size(); k++) {
			int arr = dto23.getArr();
			int col = dto23.getCol();
			if(dtoList23.get(k).getArr() == arr && dtoList23.get(k).getCol() == col) {
				dtoList23.set(k,dto23);
				return;
			}
		}
		
	}
	public void change31(BaseballDto dto31) {
		for(int k = 0; k < dtoList31.size(); k++) {
			int arr = dto31.getArr();
			int col = dto31.getCol();
			if(dtoList31.get(k).getArr() == arr && dtoList31.get(k).getCol() == col) {
				dtoList31.set(k,dto31);
				return;
			}
		}
		
	}
	public void change32(BaseballDto dto32) {
		for(int k = 0; k < dtoList32.size(); k++) {
			int arr = dto32.getArr();
			int col = dto32.getCol();
			if(dtoList32.get(k).getArr() == arr && dtoList32.get(k).getCol() == col) {
				dtoList32.set(k,dto32);
				return;
			}
		}
		
	}
	public void change33(BaseballDto dto33) {
		for(int k = 0; k < dtoList33.size(); k++) {
			int arr = dto33.getArr();
			int col = dto33.getCol();
			if(dtoList33.get(k).getArr() == arr && dtoList33.get(k).getCol() == col) {
				dtoList33.set(k,dto33);
				return;
			}
		}
		
	}

}
