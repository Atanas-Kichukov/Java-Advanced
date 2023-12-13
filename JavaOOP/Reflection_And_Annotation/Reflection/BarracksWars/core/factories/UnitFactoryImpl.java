package JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.core.factories;





import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.Unit;
import JavaOOP.Reflection_And_Annotation.Reflection.BarracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        String path = UNITS_PACKAGE_NAME + unitType;
        Unit unit;
        try {
            Class<?> clazz = Class.forName(path);
            Constructor<?> ctor = clazz.getDeclaredConstructor();
            unit = (Unit) ctor.newInstance();
        } catch (ClassNotFoundException
                 | NoSuchMethodException | InstantiationException
                 | IllegalAccessException | InvocationTargetException e) {
            throw new IllegalStateException(e);
        }

        return unit;
    }
}