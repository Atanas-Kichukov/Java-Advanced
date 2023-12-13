package Advanced.DefiningClasses.PokemonTraainer;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<Pokemon>> pokemons = new HashMap<>();
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while(!input.equals("Tournament")){
            Pokemon pokemon;
            Trainer trainer;
            String[]tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            pokemon = new Pokemon(pokemonName,pokemonElement,pokemonHealth);
            pokemons.putIfAbsent(trainerName,new ArrayList<>());
            pokemons.get(trainerName).add(pokemon);
            trainer = new Trainer(trainerName,pokemons);
            trainers.put(trainerName,trainer);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while(!input.equals("End")){
            for(Map.Entry<String,List<Pokemon>>entry : pokemons.entrySet()){
                List<Pokemon> currentListOfPokemons = entry.getValue();
                boolean isElementContained = false;
                for (Pokemon pokemon : currentListOfPokemons){
                    if(pokemon.getElement().equals(input)){
                        isElementContained = true;
                        break;
                    }
                }
                if (isElementContained) {
                    trainers.get(entry.getKey()).setBadges(trainers.get(entry.getKey()).getBadges() + 1);
                }
                else{
                    List<Pokemon> toBeRemoved = new ArrayList<>();
                    for(Pokemon current : currentListOfPokemons){
                        current.setHealth(current.getHealth()-10);
                        if(current.getHealth()<=0){
                            toBeRemoved.add(current);
                        }
                    }
                    if(toBeRemoved.size()>0){
                        for (Pokemon dead : toBeRemoved){
                            currentListOfPokemons.remove(dead);
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        trainers.entrySet().stream()

                .sorted((e1, e2) -> Integer.compare(e2.getValue().getBadges(),e1.getValue().getBadges()))
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue().getBadges() + " "
                + pokemons.get(e.getKey()).size()));

    }

}
