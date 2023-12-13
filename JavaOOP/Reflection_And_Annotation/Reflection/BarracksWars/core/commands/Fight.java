package JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.core.commands;


import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.core.Command;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.Repository;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.UnitFactory;

public class Fight extends Command {
    public Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return this.fightCommand();
    }

    private String fightCommand() {
        return "fight";
    }
}