package quiz_pra_mid_exam;

import java.util.ArrayList;
import java.util.Formatter;

public class Pokemon {
	
	Formatter f = new Formatter();
	
	ArrayList<String> PokemonName = new ArrayList<>();
	ArrayList<String> PokemonRegion = new ArrayList<>();
	ArrayList<String> PokemonType = new ArrayList<>();
	
	public Pokemon(ArrayList<String> pokemonName, ArrayList<String> pokemonRegion, ArrayList<String> pokemonType) {
		super();
		PokemonName = pokemonName;
		PokemonRegion = pokemonRegion;
		PokemonType = pokemonType;
	}

	public ArrayList<String> getPokemonName() {
		return PokemonName;
	}

	public void setPokemonName(ArrayList<String> pokemonName) {
		PokemonName = pokemonName;
	}

	public ArrayList<String> getPokemonRegion() {
		return PokemonRegion;
	}

	public void setPokemonRegion(ArrayList<String> pokemonRegion) {
		PokemonRegion = pokemonRegion;
	}

	public ArrayList<String> getPokemonType() {
		return PokemonType;
	}

	public void setPokemonType(ArrayList<String> pokemonType) {
		PokemonType = pokemonType;
	}
	
	public void print() {
		System.out.println("+============================+");
		System.out.println(" Nama pokemon - Region - Type ");
		System.out.println("+============================+");
		for (int i = 0; i < PokemonName.size(); i++) {
			System.out.println(" " + PokemonName.get(i) + " - " + PokemonRegion.get(i) + " - " + PokemonType.get(i));
		}
		System.out.println();
	}
	
}
