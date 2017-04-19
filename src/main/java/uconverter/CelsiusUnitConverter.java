package uconverter;


public class CelsiusUnitConverter extends UnitConverter {
    @Override
    public double toSI(double value) { //из цельсий в кельвины
        return value + 273.15;
    }

    @Override
    public double fromSI(double siValue) { //из кельвинов в цельсии
        double r = siValue - 273.15;
        return r;
    }

    @Override
    public String getName() {
        return "Celsius";
    }
}
