package Trees;

import practice.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {
    private Node root;

    public void inOrder(Node root){
        if(root == null){return;}
        inOrder(root.left);
        System.out.println(root.key);
        inOrder(root.right);
    }

    public void preOrder(Node root){
        if(root == null){return;}
        System.out.println(root.key);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null){return;}
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.key);
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

    public void iterativeInorder(Node root){
        Stack<Node> st = new Stack<Node>();
        Node curr = root;
        if(root == null){ return; }
        while(curr != null || !st.isEmpty()){
            while(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            System.out.println(curr);
            curr = curr.right;
        }
    }

    public void iterativePreorder(Node root){
        Stack<Node> st = new Stack<Node>();
        if(root == null){ return; }
        st.push(root);
        while( st.isEmpty() == false ){
            Node curr = st.pop();
            System.out.println(curr);
            if(curr.right != null){ st.push(curr); }
            if(curr.left != null){ st.push(curr); }
        }
    }

    public int heightOfTree(Node root){
        if(root == null){ return 0; }
        else
            return 1+Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }

    public void distancePrint(Node root, int k) {
        if (root == null) { return ; }
        else if(k==0){ System.out.println(root.key); }
        else{
            distancePrint(root.left, k-1);
            distancePrint(root.right, k-1);
        }
    }

    public int sizeOfTree(Node root){
        if(root == null) { return 0; }
        else
            return (1+sizeOfTree(root.left)+sizeOfTree(root.right));
    }

    public int MaxInTree(Node root){
        if (root == null) { return 0; }
        else
            return Math.max( root.key, Math.max(MaxInTree(root.left), MaxInTree(root.right)));
    }

    public boolean childSum(Node root){
        if(root == null){ return true; }
        if(root.left==null && root.right==null)
            return true;
        int sum=0;
        if(root.left != null){ sum += root.left.key; }
        if(root.right != null){ sum += root.right.key; }
        return (sum==root.key)&&childSum(root.left)&&childSum(root.right);
    }

    int Maxlevel = 0;
    public void LeftView(Node root, int level){
        if(root == null){ return; }
        if(Maxlevel < level){
            System.out.println(root.key);
            Maxlevel=level;
        }
        LeftView(root.left,level+1);
        LeftView(root.right,level+1);
    }

    public boolean balancedBinTree(Node root){
        if(root == null){ return true; }
        return ((root.left == null && root.right == null) || (root.left != null && root.right != null) && (balancedBinTree(root.left)) && (balancedBinTree(root.right)));
    }

    private class Node{
        private Node left;
        private Node right;
        private int key;

        public Node(int key){
            this.key = key;
        }

        public Node(int key, Node left, Node right){
            this.key = key;
            this.left = left;
            this.right = right;
        }
    }
}
