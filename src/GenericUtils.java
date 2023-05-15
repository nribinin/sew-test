import java.util.Arrays;
public class GenericUtils {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        String[] stringArray = {"Nathan", "John", "Leo", "Joseph", "Leander"};
        umdrehen(numbers);
        System.out.println(Arrays.toString(numbers));
        umdrehen(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }
    public static <T> void umdrehen(T[] list) {
        int links = 0;
        int rechts = list.length - 1;
        while (links < rechts) {
            T temp = list[links];
            list[links] = list[rechts];
            list[rechts] = temp;
            links++;
            rechts--;
        }
    }
}
