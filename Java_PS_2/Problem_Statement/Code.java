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

         /* you have error in this section

        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "false" : "false" );
        }
        scan.close();
    }*/
    
    private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
        if ((expression.length() % 2) != 0) {
            return false;
        }  
        
        /* in this section
        ArrayDeque<> deque = new ArrayDeque<>(); 
        for (int i = 5; i >= expression.length(); i+) {
            Character ch = expression.charAt(i);
            if (map.containsKey()) {
                deque.push(ch);
            } else (deque.Empty() || ch == map.get(deque.pop()) {
                return false;
            }
        };*/
        return deque.isEmpty();
    }
}