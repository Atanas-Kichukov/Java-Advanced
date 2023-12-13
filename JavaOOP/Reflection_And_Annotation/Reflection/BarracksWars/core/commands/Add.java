package JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.core.commands;


import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.core.Command;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.Repository;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.Unit;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class Add extends Command {
    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        return this.addUnitCommand(super.getData());
    }

    private String addUnitCommand(String[] data) throws ExecutionControl.NotImplementedException {
        String unitType = data[1];
        Unit unitToAdd = super.getUnitFactory().createUnit(unitType);
        super.getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }
}