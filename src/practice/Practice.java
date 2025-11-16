package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Practice {
    public static void main(String[] args) {
        String[] s = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(s));
//        System.out.println(isAnagram("lax","lak"));
        String x = "I am Lakshmanan from Ettayapuram";
        System.out.println(x.replaceAll(" ",","));
    }

    public static List<List<String>> groupAnagrams(String[] s){
        List<List<String>> res = new ArrayList<>();
        List<Integer> remove = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if(!remove.contains(i)) {
                res.add(new ArrayList<>());
                res.get(i).add(s[i]);
                remove.add(i);
                for (int j = i + 1; j < s.length; j++) {
                    if ((isAnagram(s[i], s[j])) && (!remove.contains(j))) {
                        res.add(new ArrayList<>());
                        res.get(i).add(s[j]);
                        remove.add(j);
                    }
                }
            }
        }
        for (int i = res.size()-1; i >=0 ; i--) {
            if(res.get(i).size()==0)
                res.remove(i);
        }
        return res;
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){ return false; }
        int x = 0, y = 0;
        long a=1,b=1;
        for(int i=0; i<s.length(); i++)
            x = x + s.charAt(i);
        for(int i=0; i<s.length(); i++)
            a = a * (int)(s.charAt(i));
        for(int i=0; i<t.length(); i++)
            y = y + t.charAt(i);
        for(int i=0; i<t.length(); i++)
            b = b * (int)(t.charAt(i));
        return x==y&&a==b;
    }

    public void LevelOrder(Node root){
        if(root == null){ return; }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node x = q.poll();
            System.out.println(x.key);
            if(x.left != null)
                q.add(x.left);
            if(x.right != null)
                q.add(x.right);
        }
    }

    private class Node{
        private Node left;
        private Node right;
        private int key;

        public Node(Node left, Node right, int key) {
            this.left = left;
            this.right = right;
            this.key = key;
        }
    }
}
