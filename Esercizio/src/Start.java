
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<String> cityNames = Arrays.asList("Ravenna", "Firenze", "Roma");   //lista immutabile
        System.out.println("Elenco originale: " + cityNames);

        //cityNames.add("Torino");   manda un eccezione dato che non possiamo aggiungere e/o togliere elementi
        //eccezione: UnsupportedOperationException

        cityNames.set(1, "Tegucigalpa");
        System.out.println("Elenco modificato: " + cityNames);

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");
        System.out.println("Elenco dei 7 Re di Roma: " + kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[kingsOfRomeArray.length-1] = "Lucius Tarquinius Supercar";
        //oppure: kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println("Elenco dei 7 Re modificato: " + Arrays.toString(kingsOfRomeArray));



    }
}
