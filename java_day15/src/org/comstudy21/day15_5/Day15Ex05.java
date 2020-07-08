package org.comstudy21.day15_5;

import java.util.ArrayList;

class Music {
	
	String singer;
	String song;
	
	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Music() {
		this("","");
	}
	
	public Music(String a, String b) {
		setSinger(a);
		setSong(b);
	}
	
	void play() {
		System.out.println(getSinger() + "�� " + getSong() + " ����");
	}
}	

class MusicPlayer {
//	ArrayList<Music> arr; 
//	MusicPlayer() {
//		arr = new ArrayList<Music>();
//	}
//	void append(Music music) {
//		arr.add(music);
//	}
//	void autoPlay() {
//		for(Music music:arr) music.play();
//	}
	
	int MAX = 100;
	int top = 0;
	Music music;
	
	String[][] arr;
	
	public MusicPlayer() {
		arr = new String[MAX][2];
	}
	void append(Music music) {
	
		this.arr[top][0] = music.getSinger();
		this.arr[top][1] = music.getSong();
		
		top ++;
	}
	
	void autoPlay() {
		for(int i = 0; i < top; i++) {
			System.out.println(arr[i][0] + "�� " + arr[i][1] + " ����");
		}
	}

	
}

public class Day15Ex05 {
	
	public static void main(String[] args) {
		Music m1 = new Music("������","�ٶ��� �뷡");
		m1.play(); // �������� �ٶ��� �뷡 ����
		
		Music m2 = new Music();
		m2.setSinger("�̼���");
		m2.setSong("�� �����̿�");
		m2.play(); //�̼����� �� �����̿� ����
		
		MusicPlayer mp = new MusicPlayer();
		mp.append(m1);
		mp.append(m2);
		mp.append(new Music("�̹���", "��ȭ������"));
		mp.append(new Music("�۰��", "�ϴó���츮��"));
		
		mp.autoPlay(); // append �� �뷡�� ������� ��µȴ�.

	}

}
