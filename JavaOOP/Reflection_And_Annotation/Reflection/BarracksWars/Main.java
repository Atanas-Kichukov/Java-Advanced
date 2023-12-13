package JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars;


import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.core.Engine;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.core.factories.UnitFactoryImpl;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.data.UnitRepository;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.Repository;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}