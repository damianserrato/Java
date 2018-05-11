public abstract class PokemonAbstract implements PokemonInterface {
    public Pokemon createPokemon(String name, String type, int Health) {
        return new Pokemon(name, type, health);
    }
    public void attackPokemon(Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth() - 10);
    }
}