//3
package ch4code;

public class SongDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song wakeUpSong = new Song();
		System.out.println(wakeUpSong.getArtist() + " - " + wakeUpSong.getTitle() + " - " + wakeUpSong.getLength() + " seconds");
		Song goToSleepSong = new Song("Smash Mouth", "All Star", 236);
		System.out.println(goToSleepSong.getArtist() + " - " + goToSleepSong.getTitle() + " - " + goToSleepSong.getLength() + " seconds");

	}

}
