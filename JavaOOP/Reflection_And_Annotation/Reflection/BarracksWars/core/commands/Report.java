package JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.core.commands;


import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.core.Command;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.Repository;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.UnitFactory;

public class Report extends Command {
    public Report(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return this.reportCommand();
    }

    private String reportCommand() {
        return super.getRepository().getStatistics();
    }
}