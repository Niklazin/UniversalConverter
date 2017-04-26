package uconverter;


public class InchesUnitConverter extends UnitConverter {
    @Override
    public double toSI(double value) { // из футов В метры
        return value * 3.281;
    }

    @Override
    public double fromSI(double siValue) { //из метров в футы
        return siValue * 0.3048;
    }

    @Override
    public String getName() {
        return "Inches";
    }
}
