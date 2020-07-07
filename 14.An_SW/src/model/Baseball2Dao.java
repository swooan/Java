package model;

import java.util.ArrayList;

public class Baseball2Dao {

	public ArrayList<Baseball2Dto> dtoList11;
	public ArrayList<Baseball2Dto> dtoList12;
	public ArrayList<Baseball2Dto> dtoList13;
	public ArrayList<Baseball2Dto> dtoList21;
	public ArrayList<Baseball2Dto> dtoList22;
	public ArrayList<Baseball2Dto> dtoList23;
	public ArrayList<Baseball2Dto> dtoList31;
	public ArrayList<Baseball2Dto> dtoList32;
	public ArrayList<Baseball2Dto> dtoList33;
	
	public Baseball2Dao() {
		dtoList11 = new ArrayList<Baseball2Dto>();
		dtoList12 = new ArrayList<Baseball2Dto>();
		dtoList13 = new ArrayList<Baseball2Dto>();
		dtoList21 = new ArrayList<Baseball2Dto>();
		dtoList22 = new ArrayList<Baseball2Dto>();
		dtoList23 = new ArrayList<Baseball2Dto>();
		dtoList31 = new ArrayList<Baseball2Dto>();
		dtoList32 = new ArrayList<Baseball2Dto>();
		dtoList33 = new ArrayList<Baseball2Dto>();
	}
	
	public Baseball2Dao(ArrayList<Baseball2Dto> dtolist11, ArrayList<Baseball2Dto> dtolist12,
			ArrayList<Baseball2Dto> dtolist13,ArrayList<Baseball2Dto> dtolist21,ArrayList<Baseball2Dto> dtolist22,
			ArrayList<Baseball2Dto> dtolist23,ArrayList<Baseball2Dto> dtolist31,ArrayList<Baseball2Dto> dtolist32,
			ArrayList<Baseball2Dto> dtolist33) {
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
	

	public void insert11(Baseball2Dto dto11) {
		String name = dto11.name;
		int arr = dto11.arr;
		int col = dto11.col;
		dtoList11.add(dto11);
	}
	public void insert12(Baseball2Dto dto12) {
		String name = dto12.name;
		int arr = dto12.arr;
		int col = dto12.col;
		dtoList12.add(dto12);
	}
	public void insert13(Baseball2Dto dto13) {
		String name = dto13.name;
		int arr = dto13.arr;
		int col = dto13.col;
		dtoList13.add(dto13);
	}
	public void insert21(Baseball2Dto dto21) {
		String name = dto21.name;
		int arr = dto21.arr;
		int col = dto21.col;
		dtoList21.add(dto21);
	}
	public void insert22(Baseball2Dto dto22) {
		String name = dto22.name;
		int arr = dto22.arr;
		int col = dto22.col;
		dtoList22.add(dto22);
	}
	public void insert23(Baseball2Dto dto23) {
		String name = dto23.name;
		int arr = dto23.arr;
		int col = dto23.col;
		dtoList23.add(dto23);
	}
	public void insert31(Baseball2Dto dto31) {
		String name = dto31.name;
		int arr = dto31.arr;
		int col = dto31.col;
		dtoList31.add(dto31);
	}
	public void insert32(Baseball2Dto dto32) {
		String name = dto32.name;
		int arr = dto32.arr;
		int col = dto32.col;
		dtoList32.add(dto32);
	}
	public void insert33(Baseball2Dto dto33) {
		String name = dto33.name;
		int arr = dto33.arr;
		int col = dto33.col;
		dtoList33.add(dto33);
	}

	public ArrayList<Baseball2Dto> selectAll11() {
		ArrayList<Baseball2Dto> list11 = new ArrayList<Baseball2Dto>();
		for(int i = 0; i < dtoList11.size(); i++) {
			Baseball2Dto dto11 = dtoList11.get(i);
			String name = dto11.getName();
			int arr = dto11.getArr();
			int col = dto11.getCol();
			Baseball2Dto newDto11 = new Baseball2Dto(name, arr, col);
			list11.add(newDto11);
		}
		return list11;
	}
	public ArrayList<Baseball2Dto> selectAll12() {
		ArrayList<Baseball2Dto> list12 = new ArrayList<Baseball2Dto>();
		for(int i = 0; i < dtoList12.size(); i++) {
			Baseball2Dto dto12 = dtoList12.get(i);
			String name = dto12.getName();
			int arr = dto12.getArr();
			int col = dto12.getCol();
			Baseball2Dto newDto12 = new Baseball2Dto(name, arr, col);
			list12.add(newDto12);
		}
		return list12;
	}
	public ArrayList<Baseball2Dto> selectAll13() {
		ArrayList<Baseball2Dto> list13 = new ArrayList<Baseball2Dto>();
		for(int i = 0; i < dtoList13.size(); i++) {
			Baseball2Dto dto13 = dtoList13.get(i);
			String name = dto13.getName();
			int arr = dto13.getArr();
			int col = dto13.getCol();
			Baseball2Dto newDto13 = new Baseball2Dto(name, arr, col);
			list13.add(newDto13);
		}
		return list13;
	}
	public ArrayList<Baseball2Dto> selectAll21() {
		ArrayList<Baseball2Dto> list21 = new ArrayList<Baseball2Dto>();
		for(int i = 0; i < dtoList21.size(); i++) {
			Baseball2Dto dto21 = dtoList21.get(i);
			String name = dto21.getName();
			int arr = dto21.getArr();
			int col = dto21.getCol();
			Baseball2Dto newDto21 = new Baseball2Dto(name, arr, col);
			list21.add(newDto21);
		}
		return list21;
	}
	public ArrayList<Baseball2Dto> selectAll22() {
		ArrayList<Baseball2Dto> list22 = new ArrayList<Baseball2Dto>();
		for(int i = 0; i < dtoList22.size(); i++) {
			Baseball2Dto dto22 = dtoList22.get(i);
			String name = dto22.getName();
			int arr = dto22.getArr();
			int col = dto22.getCol();
			Baseball2Dto newDto22 = new Baseball2Dto(name, arr, col);
			list22.add(newDto22);
		}
		return list22;
	}
	public ArrayList<Baseball2Dto> selectAll23() {
		ArrayList<Baseball2Dto> list23 = new ArrayList<Baseball2Dto>();
		for(int i = 0; i < dtoList23.size(); i++) {
			Baseball2Dto dto23 = dtoList23.get(i);
			String name = dto23.getName();
			int arr = dto23.getArr();
			int col = dto23.getCol();
			Baseball2Dto newDto23 = new Baseball2Dto(name, arr, col);
			list23.add(newDto23);
		}
		return list23;
	}
	public ArrayList<Baseball2Dto> selectAll31() {
		ArrayList<Baseball2Dto> list31 = new ArrayList<Baseball2Dto>();
		for(int i = 0; i < dtoList31.size(); i++) {
			Baseball2Dto dto31 = dtoList31.get(i);
			String name = dto31.getName();
			int arr = dto31.getArr();
			int col = dto31.getCol();
			Baseball2Dto newDto31 = new Baseball2Dto(name, arr, col);
			list31.add(newDto31);
		}
		return list31;
	}
	public ArrayList<Baseball2Dto> selectAll32() {
		ArrayList<Baseball2Dto> list32 = new ArrayList<Baseball2Dto>();
		for(int i = 0; i < dtoList32.size(); i++) {
			Baseball2Dto dto32 = dtoList32.get(i);
			String name = dto32.getName();
			int arr = dto32.getArr();
			int col = dto32.getCol();
			Baseball2Dto newDto32 = new Baseball2Dto(name, arr, col);
			list32.add(newDto32);
		}
		return list32;
	}
	public ArrayList<Baseball2Dto> selectAll33() {
		ArrayList<Baseball2Dto> list33 = new ArrayList<Baseball2Dto>();
		for(int i = 0; i < dtoList33.size(); i++) {
			Baseball2Dto dto33 = dtoList33.get(i);
			String name = dto33.getName();
			int arr = dto33.getArr();
			int col = dto33.getCol();
			Baseball2Dto newDto33 = new Baseball2Dto(name, arr, col);
			list33.add(newDto33);
		}
		return list33;
	}

	public void delete11(Baseball2Dto ddto11) {
		for(int k = 0; k < dtoList11.size(); k++) {
			String name = ddto11.getName();
			if(dtoList11.get(k).getName().equals(name)) {
				dtoList11.remove(k);
				return;
			}
		}
		
	}
	public void delete12(Baseball2Dto ddto12) {
		for(int k = 0; k < dtoList12.size(); k++) {
			String name = ddto12.getName();
			if(dtoList12.get(k).getName().equals(name)) {
				dtoList12.remove(k);
				return;
			}
		}
		
	}
	public void delete13(Baseball2Dto ddto13) {
		for(int k = 0; k < dtoList13.size(); k++) {
			String name = ddto13.getName();
			if(dtoList13.get(k).getName().equals(name)) {
				dtoList13.remove(k);
				return;
			}
		}
		
	}
	public void delete21(Baseball2Dto ddto21) {
		for(int k = 0; k < dtoList21.size(); k++) {
			String name = ddto21.getName();
			if(dtoList21.get(k).getName().equals(name)) {
				dtoList21.remove(k);
				return;
			}
		}
		
	}
	public void delete22(Baseball2Dto ddto22) {
		for(int k = 0; k < dtoList22.size(); k++) {
			String name = ddto22.getName();
			if(dtoList22.get(k).getName().equals(name)) {
				dtoList22.remove(k);
				return;
			}
		}
		
	}
	public void delete23(Baseball2Dto ddto23) {
		for(int k = 0; k < dtoList23.size(); k++) {
			String name = ddto23.getName();
			if(dtoList23.get(k).getName().equals(name)) {
				dtoList23.remove(k);
				return;
			}
		}
		
	}
	public void delete31(Baseball2Dto ddto31) {
		for(int k = 0; k < dtoList31.size(); k++) {
			String name = ddto31.getName();
			if(dtoList31.get(k).getName().equals(name)) {
				dtoList31.remove(k);
				return;
			}
		}
		
	}
	public void delete32(Baseball2Dto ddto32) {
		for(int k = 0; k < dtoList32.size(); k++) {
			String name = ddto32.getName();
			if(dtoList32.get(k).getName().equals(name)) {
				dtoList32.remove(k);
				return;
			}
		}
		
	}
	public void delete33(Baseball2Dto dto33) {
		for(int k = 0; k < dtoList33.size(); k++) {
			String name = dto33.getName();
			if(dtoList33.get(k).getName().equals(name)) {
				dtoList33.remove(k);
				return;
			}
		}
		
	}

	public void change11(Baseball2Dto dto11) {
		for(int k = 0; k < dtoList11.size(); k++) {
			int arr = dto11.getArr();
			int col = dto11.getCol();
			if(dtoList11.get(k).getArr() == arr && dtoList11.get(k).getCol() == col) {
				dtoList11.set(k,dto11);
				return;
			}
		}
		
	}
	public void change12(Baseball2Dto dto12) {
		for(int k = 0; k < dtoList12.size(); k++) {
			int arr = dto12.getArr();
			int col = dto12.getCol();
			if(dtoList12.get(k).getArr() == arr && dtoList12.get(k).getCol() == col) {
				dtoList12.set(k,dto12);
				return;
			}
		}
		
	}
	public void change13(Baseball2Dto dto13) {
		for(int k = 0; k < dtoList13.size(); k++) {
			int arr = dto13.getArr();
			int col = dto13.getCol();
			if(dtoList13.get(k).getArr() == arr && dtoList13.get(k).getCol() == col) {
				dtoList13.set(k,dto13);
				return;
			}
		}
		
	}
	public void change21(Baseball2Dto dto21) {
		for(int k = 0; k < dtoList21.size(); k++) {
			int arr = dto21.getArr();
			int col = dto21.getCol();
			if(dtoList21.get(k).getArr() == arr && dtoList21.get(k).getCol() == col) {
				dtoList21.set(k,dto21);
				return;
			}
		}
		
	}
	public void change22(Baseball2Dto dto22) {
		for(int k = 0; k < dtoList22.size(); k++) {
			int arr = dto22.getArr();
			int col = dto22.getCol();
			if(dtoList22.get(k).getArr() == arr && dtoList22.get(k).getCol() == col) {
				dtoList22.set(k,dto22);
				return;
			}
		}
		
	}
	public void change23(Baseball2Dto dto23) {
		for(int k = 0; k < dtoList23.size(); k++) {
			int arr = dto23.getArr();
			int col = dto23.getCol();
			if(dtoList23.get(k).getArr() == arr && dtoList23.get(k).getCol() == col) {
				dtoList23.set(k,dto23);
				return;
			}
		}
		
	}
	public void change31(Baseball2Dto dto31) {
		for(int k = 0; k < dtoList31.size(); k++) {
			int arr = dto31.getArr();
			int col = dto31.getCol();
			if(dtoList31.get(k).getArr() == arr && dtoList31.get(k).getCol() == col) {
				dtoList31.set(k,dto31);
				return;
			}
		}
		
	}
	public void change32(Baseball2Dto dto32) {
		for(int k = 0; k < dtoList32.size(); k++) {
			int arr = dto32.getArr();
			int col = dto32.getCol();
			if(dtoList32.get(k).getArr() == arr && dtoList32.get(k).getCol() == col) {
				dtoList32.set(k,dto32);
				return;
			}
		}
		
	}
	public void change33(Baseball2Dto dto33) {
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
