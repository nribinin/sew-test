package java_angabe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Testkatalog {

    Book b1;
    Book b2;
    Book b3;
    Book b4;
    Book b5;
    Catalog c1;

    @BeforeEach
    void setup(){
        b1 = new Book("111-111", 2005, "Nathan's Kampf", "Nathaniel Ribinin");
        b2 = new Book("111-111", 2006, "Dejan's Kampf", "Dejan Ratschitsch");
        b3 = new Book("333-333", 2007, "Leo's Kampf", "Leo Mama");
        b4 = new Book("444-444", 2008, "Drinor's Kampf", "Drinor Sutatsch");
        b5 = new Book("555-555", 2009, "Kacper's Kampf", "DER FÜHRER");
    }

    @DisplayName("Name zum einfügen")
    @Test
    void test1(){
        c1.add(b1);
        c1.add(b2);
        assertEquals(1, c1.count(),"Fehler beim Hinzufügen");
    }


    @DisplayName("Prüft ob Get IDs ")
    @Test
    void test2(){
        c1.add(b1);
        c1.add(b2);
        c1.add(b3);
        c1.add(b4);
        c1.add(b5);
        String ausgabe = "111-111 ,111-111 ,333-333 ,444-444 ,555-555";
        assertEquals(ausgabe, c1.getIDs(), "Fehler bei der Auflistung ist aufgetreten");
    }

    @DisplayName("Prüft ob eine Exception geworfen wird")
    @Test
    void test3(){
        assertThrows(IllegalArgumentException.class, () -> c1.getByID("111-111"), "Exception funktioniert");
    }
}
