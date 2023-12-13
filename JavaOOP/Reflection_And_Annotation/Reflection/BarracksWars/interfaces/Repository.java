package JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces;


import jdk.jshell.spi.ExecutionControl;

public interface Repository {

    void addUnit(Unit unit);

    String getStatistics();

    void removeUnit(String unitType) throws ExecutionControl.NotImplementedException;
}