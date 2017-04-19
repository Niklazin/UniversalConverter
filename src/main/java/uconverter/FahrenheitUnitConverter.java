package uconverter;


public class FahrenheitUnitConverter extends  UnitConverter {
    @Override
    public double toSI(double value) {
        return 1.8 / (value + 273.0) - 32.0; //из Фаренгейтов в Кельвины
    }

    @Override
    public double fromSI(double siValue) {
        return 1.8 * (siValue - 273.0) + 32.0; //из Кельвинов в Фаренгейты
    }

    @Override
    public String getName() {
        return "Fahrenheit";
    }
}
