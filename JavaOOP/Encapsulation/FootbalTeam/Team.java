package JavaOOP.Encapsulation.FootbalTeam;

import JavaOOP.Encapsulation.FootballTeam.Player;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.round;

public class Team {
    private String name;
    private List<Player> players;


    public Team(String name){
        this.name = name;
        players = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty");
        }
        this.name = name;
    }
    public void addPlayer(Player player){
        players.add(player);
    }
    public void removePlayer(String playerName){
      boolean removed =this.players.removeIf(p -> p.getName().equals(playerName));
      if(!removed){
          throw new IllegalArgumentException("Player " + playerName + " is not in " + this.name +" team.");
      }
    }
    public double getRating(){
    return round(this.players.stream().mapToDouble(Player::overallSkillLevel).sum());
    }

}

