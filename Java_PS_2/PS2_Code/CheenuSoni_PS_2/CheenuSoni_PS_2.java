package Code;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayDeque;

class Solution {
    public static void main(String[] args) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');


        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false" );  //Correction: "true" instead of first "false"
        }
        scan.close();
    }

    private static boolean isBalanced (String expression, HashMap < Character, Character > map){
        if ((expression.length() % 2) != 0) {
            return false;
        }
        ArrayDeque<Character> deque = new ArrayDeque<>(); // Correction: Character or String in Diamond brackets
     // for (int i = 5; i >= expression.length(); i+) {  // Wrong code
        for (int i = 0; i < expression.length(); i++) { // Correct code
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) { // ch as argument of containsKey() method
                deque.push(ch);
            } else if(deque.isEmpty() || ch != map.get(deque.pop())) { //Corrections :isEmpty() instead of Empty() , one more parenthesis , "else if" instead of "if","!=" instead of "=="
                return false;
            }
        }
        return deque.isEmpty();
    }
}
