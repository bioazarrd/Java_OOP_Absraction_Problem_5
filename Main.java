package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        int n = Integer.parseInt(reader.readLine());

        TrafficLight[] makeInputEQUALToENUMClass = new TrafficLight[input.length];
        for (int i = 0; i < input.length; i++) {
            makeInputEQUALToENUMClass[i] = TrafficLight.valueOf(input[i]);
        }


        // vtoriq massive e po DEFAULT
        //toi ti e TEMP massive, za da si dyrpash ot nego stojnsotite
        TrafficLight[] byDefault = {TrafficLight.RED, TrafficLight.GREEN, TrafficLight.YELLOW};


        //obhojdame pyrviq massive koito sme syzdali - bliznaka na input-a
        while (n-- > 0) {
            for (int i = 0; i < makeInputEQUALToENUMClass.length; i++) {
                if (makeInputEQUALToENUMClass[i].ordinal() == 2) {
                    // ako na posledna poziciq w bliznaka massive e YELLOW(ordinal: 2), pravim go na RED
                    // na tazi posledna poziciq slagame RED;
                    makeInputEQUALToENUMClass[i] = byDefault[0];
                } else {
                    // poziciite v DEFAULT i v mekInputEqualTo... sa ednakvi - JOKER!!!
                    // posochvame poziciqta v default chrez poziciqta na MAKEinput... + 1...
                    // tadaaaa!
                    makeInputEQUALToENUMClass[i] = byDefault[makeInputEQUALToENUMClass[i].ordinal() + 1];
                }

                System.out.print(makeInputEQUALToENUMClass[i] + " ");
            }
            System.out.println();
        }




    }
}