package classics;


import java.util.*;
import java.io.*;




import java.util.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Queue<Item> q = new PriorityQueue<Item>();

        for(int i=0; i< input.length();i++){
            char c = input.charAt(i);
            if(map.get(c)==null){
                map.put(c, 1);
            } else{
                map.put(c, map.get(c)+1);
            }
            Item item = new Item(c);
            if(q.remove(item)){
                q.offer(item);
            } else{
                q.add(item);
            }
        }

        System.out.println(q.peek().ch + " " + q.peek().frequency);

    }

    private static class Item implements Comparable<Item> {

        private char ch;
        private int frequency;

        public int compareTo(Item that){
            if(this.frequency>that.frequency){
                return 1;
            } else if(this.frequency<that.frequency){
                return -1;
            } else{
                return 0;
            }
        }

        public boolean equals(Item i){
            return (this.ch==i.ch);
        }

        public Item(char ch){
            this.ch = ch;
            this.frequency = 1;
        }

        public void setFrequency(int n){
            this.frequency = n;
        }


    }

}

