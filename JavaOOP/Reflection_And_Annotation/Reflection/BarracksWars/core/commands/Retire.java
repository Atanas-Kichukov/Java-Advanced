package JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.core.commands;


import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.core.Command;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.Repository;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class Retire extends Command {
    public Retire(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        String unitType = super.getData()[1];
        super.getRepository().removeUnit(unitType);
        return unitType + " retired!";
    }

}