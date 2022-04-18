package revature.fsd.project1.app;

import java.util.Scanner;

import revature.fsd.project1.handler.MainMenuHandler;

public class App {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		MainMenuHandler.display();
		scanner.close();
	}
}
