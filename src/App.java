import pokemon.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
    Pokemon pokemon = new Pokemon();
    pokemon.setNomePokemon("Pikachu");
    pokemon.setForcaPokemon(55);
    pokemon.setAgilidadePokemon(90);
    pokemon.setInteligenciaPokemon(40);
    pokemon.setVidaPokemon(35);
    System.out.println("-------------------------------------- ");
    System.out.println("-------------------------------------- ");

    System.out.println("|Nome: " + pokemon.getNomePokemon());
    System.out.println("|Força: " + pokemon.getForcaPokemon());
    System.out.println("|Agilidade: " + pokemon.getAgilidadePokemon());
    System.out.println("|Inteligência: " + pokemon.getInteligenciaPokemon());
    System.out.println("|Vida: " + pokemon.getVidaPokemon());
    System.out.println("-------------------------------------- ");
    System.out.println("-------------------------------------- ");

    }
}
