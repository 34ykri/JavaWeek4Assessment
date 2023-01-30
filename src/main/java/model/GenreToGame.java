package model;

import java.util.Random;

/**
 * @author akvang - Alexander Vang
 * CIS175 - Spring 2023
 * Jan 30, 2023
 */
public class GenreToGame {
	private String genre;
	private String game;
	public GenreToGame() {
		super();
	}
	public GenreToGame(String genre) {
		super();
		setGenre(genre);
		findGame(genre);
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public void findGame(String genre) {
		Random rand = new Random();
		int choice = rand.nextInt(5);
		String game = "err";
		switch(genre) {
			case "Action" :
				if(choice == 1) {
					game = "Guilty Gear Strive";
				}
				else if(choice == 2) {
					game = "Devil May Cry 3";
				}
				else if(choice == 3) {
					game = "Yakuza Kiwami";
				}
				else {
					game = "Final Fantasy 7";
				}
				break;
			case "Horror":
				if(choice == 1) {
					game = "Resident Evil 2";
				}
				else if(choice == 2) {
					game = "Silent Hill 2";
				}
				else if(choice == 3) {
					game = "Dead Space";
				}
				else {
					game = "Resident Evil Village";
				}
				break;
			case "Pain":
				if(choice == 1) {
					game = "Elden Ring";
				}
				else if(choice == 2) {
					game = "Dark Souls 3";
				}
				else if(choice == 3) {
					game = "Sekiro Shadows Die Twice";
				}
				else {
					game = "Bloodborne";
				}
				break;
			case "Online":
				if(choice == 1) {
					game = "Fortnite";
				}
				else if(choice == 2) {
					game = "Call of Duty Modern Warfare 2";
				}
				else if(choice == 3) {
					game = "Red Dead Redemption 2 Online";
				}
				else {
					game = "Final Fantasy 14 Online";
				}
				break;
			}
		setGame(game);
	}
}
