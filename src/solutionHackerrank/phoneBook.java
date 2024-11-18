package solutionHackerrank;
//Complete this code or write your own from scratch
import java.util.*;
public class phoneBook {
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
                Map<String,Integer> phoneBooks = new HashMap<>(n);
            for(int i = 0; i < n; i++) {
                String name = in.next().toLowerCase();
                int phone = in.nextInt();
                phoneBooks.put(name, phone);
            }
            while(in.hasNext()){
                String s = in.next().toLowerCase();
                if (phoneBooks.isEmpty()) {
                    break;
                }
                if (phoneBooks.containsKey(s)){
                    System.out.println(s + ":" + phoneBooks.get(s));
                }
                else {
                    System.out.println("Not found");
                }
            }
            in.close();
        }
    }
