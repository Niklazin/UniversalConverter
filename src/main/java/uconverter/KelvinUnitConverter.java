package uconverter;


public class KelvinUnitConverter extends UnitConverter {
    @Override
    public double toSI(double value) { //перевод в Кельвины
        return value;
    }

    @Override
    public double fromSI(double siValue) { //из Кельвинов
        return siValue;
    }

    @Override
    public String getName() {
        return "Kelvin";
    }
}
