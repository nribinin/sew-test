package andere_files;

import java.util.*;

public class CapitalQuiz {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Österreich", "Wien");
        capitals.put("Deutschland", "Berlin");
        capitals.put("Schweden", "Stockholm");
        capitals.put("Israel", "Jerusalem");
        capitals.put("Russland", "Moskau");
        capitals.put("Frankreich", "Paris");

        ArrayList<String> countries = new ArrayList<>();
        countries.addAll(capitals.keySet());
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int punkte = 0;
        int zaehlen = 0;

        while(true){
            int index = random.nextInt(countries.size());
            String country = countries.get(index);
            System.out.println("Was ist die Hauptstadt von " + country + "?");
            if(scan.next().equals(capitals.get(country))){
                System.out.println("Wow, du bist ja richtig schlau! Die Antwort ist richtig!");
                punkte += 1;
                zaehlen += 1;
            }
            else {
                System.out.println("Die Antwort ist leider falsch");
                System.out.println("Die Hauptstadt von " + country + " ist " + capitals.get(country));
                zaehlen += 1;
            }
            System.out.println("Willst du noch weitermachen? j/n");
            if(scan.next().equals("j")){
                continue;
            }
            else if(scan.next().equals("n")){
                System.out.println("Von " + zaehlen + " Versuchen, hattest du " + punkte + " Fragen richtig!");
                break;
            }
        }
    }
}
