import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumbersPalindrome {

    private static Boolean IS_NUMBER_SAME = false;

    public static void checkIfNumbersArrayIsAPalindrome(Integer[] numbers) {
        List<Integer> numbersFromList = Arrays.asList(numbers);
        List<Integer> reversedNumbersFromList = new ArrayList<>(numbersFromList);
        Collections.reverse(reversedNumbersFromList);
        for (int i = 0; i < numbersFromList.size(); i++) {
            if (numbersFromList.get(i).equals(reversedNumbersFromList.get(i))) {
                IS_NUMBER_SAME = true;
                continue;
            } else
                IS_NUMBER_SAME = false;
            System.out.println("Podane cyfry " + numbersFromList + " nie tworzą palindromu");
            return;
        }
        if (IS_NUMBER_SAME) {
            System.out.println("Podane cyfry " + numbersFromList + " tworzą palindrom.");
        }

    }
}
