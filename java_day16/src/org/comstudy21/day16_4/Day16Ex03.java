package org.comstudy21.day16_4;

import java.util.ArrayList;

class Song {
	String title;
	String artist;
	String album;
	ArrayList<String> composer = new ArrayList<String>();
	String year;
	String track;

	Song() {

	}

	Song(String title, String artist) {
		this(title, artist,"", null, "", "");
	}

	Song(String title, String artist, String album, String[] composerArr, String year, String track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		if (composerArr == null) {
			composer = null;
		} else {
			for (String composer : composerArr)
			{
				this.composer.add(composer);
			}
		}
		this.year = year;
		this.track = track;
	}

	public void show() {
		System.out.println("title=" + title);
		System.out.println("artist=" + artist);
		System.out.println("album=" + album);
		System.out.print("composer= ");
		if (composer != null) {
			for(int i=0; i<composer.size(); i++) {
				System.out.print(composer.get(i));
				if(i != composer.size()-1) {
					System.out.print(", ");
				}
			}
		}
		System.out.println();
		System.out.println("year=" + year);
		System.out.println("track=" + track);
	}

}

public class Day16Ex03 {
	public static void main(String[] args) {
		Song uta = new Song("Dancing Queen" , "ABBA", "ABBAGOLD", new String[] {"ÀÛ°î°¡1", "ÀÛ°î°¡2", "ÀÛ°î°¡3"}, "2008.01.01", "1¹ø");
		
		uta.show();

	}
}
