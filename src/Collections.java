import java.util.ArrayList;
import java.util.Scanner;

public class Collections {
    public static void main(String[] args){
        ArrayList<String> einkaufsliste = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Sachen für die Einkaufsliste einfügen? j/n");
            String s = scanner.next();
            if (s.equals("j")){
                System.out.println("Ok, was brauchen wir denn noch?");
                String eingabe = scanner.next();
                einkaufsliste.add(eingabe);
            }
            else if (s.equals("n")){
                System.out.println("Deine Einkaufsliste:");
                for (String eingabe : einkaufsliste){
                    System.out.println(eingabe);
                }
                break;
            }
        }
    }
}
