package calc_area;

import java.util.ArrayList;
import java.util.Scanner;

public class RadiusReader {
    Scanner scanner;
    public RadiusReader(Scanner s) {
        scanner=s;
    }
    public ArrayList<Double> getRadiusList() {
        ArrayList<Double> radiusList=new ArrayList<>();
        while(scanner.hasNextDouble()) {
            radiusList.add(scanner.nextDouble());
        }
        return radiusList;
    }
}
