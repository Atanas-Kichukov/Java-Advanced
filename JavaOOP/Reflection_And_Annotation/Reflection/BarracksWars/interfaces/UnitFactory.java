package JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces;


import jdk.jshell.spi.ExecutionControl;

public interface UnitFactory {

    Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException;
}