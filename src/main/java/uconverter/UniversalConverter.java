package uconverter;

import asg.cliche.Command;

import java.util.Arrays;
import java.util.List;


public class UniversalConverter {
    private List<UnitConverter> converters = Arrays.asList(
            new CelsiusUnitConverter(),
            new FahrenheitUnitConverter(),
            new KelvinUnitConverter(),
            new MetrsUnitConverter(),
            new InchesUnitConverter()
    );
    private UnitConverter sourseConverter;
    private UnitConverter targetConverter;

    @Command
    public void list() { //показать команды
        for (int i = 0; i < converters.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, converters.get(i));
        }

    }

    @Command
    public void sourse(int idx) {
        sourseConverter = converters.get(idx - 1);

    }

    @Command
    public void target(int idx) {
        targetConverter = converters.get(idx - 1);


        }

    @Command
    public double convert(double value) {



        double siValue = sourseConverter.toSI(value);
        double targetValue = targetConverter.fromSI(siValue);

        return targetValue;
    }

}
