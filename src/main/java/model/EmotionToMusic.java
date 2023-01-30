package model;
/**
 * @author akvang - Alexander Vang
 * CIS175 - Spring 2023
 * Jan 30, 2023
 */
import java.util.Random;

public class EmotionToMusic {
	private String emotion;
	private String song;
	
	public EmotionToMusic() {
		super();
	}
	public EmotionToMusic(String emotion) {
		super();
		setEmotion(emotion);	
		findSong(emotion);
	}
	public String getEmotion() {
		return emotion;
	}
	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	//This method allows to select a song based on emotion and random number
	public void findSong(String emotion) {
		Random rand = new Random();
		int choice = rand.nextInt(5);
		String song = "err";
		switch(emotion) {
			case "Happy" :
				if(choice == 1) {
					song = "Sour Grapes by LE SSERAFIM";
				}
				else if(choice == 2) {
					song = "PUSH & PULL by TWICE";
				}
				else if(choice == 3) {
					song = "LOVE DIVE by IVE";
				}
				else {
					song = "Girls Just Want To Have Fun by Bladee & Ecco2K";
				}
				break;
			case "Sad":
				if(choice == 1) {
					song = "walk away as the door slams by Lil Peep";
				}
				else if(choice == 2) {
					song = "The Happiest Girl by BLACKPINK";
				}
				else if(choice == 3) {
					song = "Skin by Bladee";
				}
				else {
					song = "Yellowman by Yung Lean";
				}
				break;
			case "Excited":
				if(choice == 1) {
					song = "Butterfly by Ken Carson";
				}
				else if(choice == 2) {
					song = "LIKEY by TWICE";
				}
				else if(choice == 3) {
					song = "AFTER LIKE by IVE";
				}
				else {
					song = "True Religion Fein by Chief Keef";
				}
				break;
			case "Mad":
				if(choice == 1) {
					song = "I Don't Like by Chief Keef";
				}
				else if(choice == 2) {
					song = "Gatekeeper by Bladee";
				}
				else if(choice == 3) {
					song = "No More Heroes by HI-C";
				}
				else {
					song = "Smoke Strong by Youngboy NBA";
				}
				break;
			}
		setSong(song);
	}
}
