//3
package ch4code;

public class Song {
	private String artist;
	private String title;
	private int length;
	
	public Song() {
		artist = "Rick Astley";
		title = "Never Gonna Give you Up";
		length = 212;
	}
	public Song(String artist, String title, int length) {
		this.artist = artist;
		this.title = title;
		this.length = length;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	

}
