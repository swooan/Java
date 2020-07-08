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
		System.out.println(getSinger() + "의 " + getSong() + " 실행");
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
			System.out.println(arr[i][0] + "의 " + arr[i][1] + " 실행");
		}
	}

	
}

public class Day15Ex05 {
	
	public static void main(String[] args) {
		Music m1 = new Music("조용필","바람의 노래");
		m1.play(); // 조용필의 바람의 노래 실행
		
		Music m2 = new Music();
		m2.setSinger("이선희");
		m2.setSong("아 옛날이여");
		m2.play(); //이선희의 아 옛날이여 실행
		
		MusicPlayer mp = new MusicPlayer();
		mp.append(m1);
		mp.append(m2);
		mp.append(new Music("이문세", "광화문연가"));
		mp.append(new Music("송골매", "하늘나라우리님"));
		
		mp.autoPlay(); // append 된 노래가 순서대로 출력된다.

	}

}
