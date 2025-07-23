import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class StringFrequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for(char i: str.toCharArray()){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // for(char i: map.keySet()){
        //     System.out.println(i + " " + map.get(i));
        // }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}