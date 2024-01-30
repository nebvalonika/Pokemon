package quiz_pra_mid_exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	public void clear() {
		for (int i = 0; i < 64; i++) {
			System.out.println();
		}
	}
	
	ArrayList<String> PokemonName = new ArrayList<>();
	ArrayList<String> PokemonRegion = new ArrayList<>();
	ArrayList<String> PokemonType = new ArrayList<>();
	
	ArrayList<String> Name = new ArrayList<>();
	ArrayList<String> Region = new ArrayList<>();
	ArrayList<String> Type = new ArrayList<>();
	
	Pokemon dex = new Pokemon(PokemonName, PokemonRegion, PokemonType);
	
	Pokeball ball = new Pokeball();
	
	public void enterData(){
		PokemonName.add("Pikachu");
		PokemonName.add("Ivysaur");
		PokemonName.add("Squirtle");
		PokemonName.add("Jigglypuff");
		PokemonName.add("Marill");
		
		PokemonRegion.add("Kanto");
		PokemonRegion.add("Kanto");
		PokemonRegion.add("Kanto");
		PokemonRegion.add("Kanto");
		PokemonRegion.add("Johto");
		
		PokemonType.add("Electric");
		PokemonType.add("Grass / Poison");
		PokemonType.add("Water");
		PokemonType.add("Fairy");
		PokemonType.add("Normal / Fairy");
	}
	
	
	public void menu() {
		System.out.println("+========================+");
		System.out.println("| Welcome to Pokemon Go! |");
		System.out.println("+========================+");
		System.out.println("| 1. Show Pokedex        |");
		System.out.println("| 2. Show Pokeball       |");
		System.out.println("| 3. Exit                |");
		System.out.println("+========================+");
		System.out.print(">> ");
		
	}
	
	public Main() {
		enterData();
		Integer input;
		do {
			menu();
			input = scan.nextInt();
			scan.nextLine();
				if(input == 1) {
					char input2;
					do {
						clear();
						dex.print();
						
						System.out.println("Do you wish to add pokemon to your pokedex? [y/n]");
						System.out.print(">> ");
						input2 = scan.next().charAt(0);
						scan.nextLine();
						
						Name = dex.getPokemonName();
						Region = dex.getPokemonRegion();
						Type = dex.getPokemonType();
						
						if(input2 == 'y') {
							String tempA;
							String tempB;
							String tempC;
							
							System.out.println("Enter pokemon name : ");
							System.out.print(">> ");
							tempA = scan.nextLine();
							System.out.println("Enter pokemon region : ");
							System.out.print(">> ");
							tempB = scan.nextLine();
							System.out.println("Enter pokemon type : ");
							System.out.print(">> ");
							tempC = scan.nextLine();
							
							Name.add(tempA);
							Region.add(tempB);
							Type.add(tempC);
							
							dex.setPokemonName(Name);
							dex.setPokemonRegion(Region);
							dex.setPokemonType(Type);
						}
						else if(input2 == 'n') {
							dex.setPokemonName(Name);
							dex.setPokemonRegion(Region);
							dex.setPokemonType(Type);
							continue;
						}
					}while(input2 != 'n');
					
				}
				if(input == 2) {
					clear();
					ball.ball();
					System.out.println();
					System.out.println("Please ENTER to go back to main menu...");
					scan.nextLine();
				}
				clear();
		}while(input != 3);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
