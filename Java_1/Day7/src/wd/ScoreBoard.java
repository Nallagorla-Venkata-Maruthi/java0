package wd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ScoreBoard {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        HashMap<String, Integer> sc = new HashMap<>();

        System.out.print("Enter number of players: ");
        int n=scanner.nextInt();
        scanner.nextLine();
        for (int i=1; i<=n; i++) {
            System.out.print("Enter player"+i+"name:");
            String name = scanner.nextLine();

            System.out.print("Enter score for"+name+":");
            int score = scanner.nextInt();
            scanner.nextLine();

            sc.put(name,score);
        }
        System.out.println("-------Players Scoreboard---");
        for(Map.Entry<String, Integer> entry:sc.entrySet()) {
            String player = entry.getKey();
            int score = entry.getValue();
            System.out.println(player+"="+score);
        }
        System.out.print("Enter name to display the score:");
        String search = scanner.nextLine();
        if (sc.containsKey(search)) {
            System.out.println(search +"'s Score:"+sc.get(search));
        } else {
            System.out.println("Player not found.");
        }
        scanner.close();
    }
}
