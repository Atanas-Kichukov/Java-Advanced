package JavaOOP.Encapsulation.FootbalTeam;

import JavaOOP.Encapsulation.FootballTeam.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Team> teams = new ArrayList<>();

        while (!input.equals("END")) {
            String[] tokens = input.split(";");
            String command = tokens[0];
            String teamName = tokens[1];
            switch (command) {
                case "Team":
                    Team team = new Team(tokens[1]);
                    teams.add(team);
                    break;
                case "Add":

                    for (Team t : teams) {
                        if (t.getName().equals(teamName)) {
                            try {
                                Player player = new Player(tokens[2], Integer.parseInt(tokens[3]),
                                        Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]),
                                        Integer.parseInt(tokens[6]), Integer.parseInt(tokens[7]));
                                t.addPlayer(player);
                            } catch (IllegalArgumentException ex) {
                                System.out.println(ex.getMessage());
                            }

                            //Add;Arsenal;Kieran_Gibbs;75;85;84;92;67
                        }
                    }
                    break;
                case "Remove":
                    try {
                        for (Team t : teams) {
                            if (t.getName().equals(teamName)) {
                                t.removePlayer(tokens[2]);
                            }
                        }
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "Rating":
                    for (Team t : teams) {
                        System.out.printf("%s - %.0f",t.getName(), t.getRating());
                    }
                    break;

            }
            input = scanner.nextLine();
        }
    }
}
