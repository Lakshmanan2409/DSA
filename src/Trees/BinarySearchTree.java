package Trees;

import java.util.TreeMap;
import java.util.TreeSet;

public class BinarySearchTree {
    private Node root;

    public boolean Search(int val) {
        while (root != null) {
            if (root.key == val) {
                return true;
            } else if (root.key < val) {
                root = root.right;
            } else
                root = root.left;
        }
        return false;
    }

    public boolean RecurSearch(Node root, int val) {
        if (root == null) {
            return false;
        } else if (root.key == val) {
            return true;
        } else if (root.key < val) {
            return RecurSearch(root.right, val);
        } else {
            return RecurSearch(root.left, val);
        }
    }

    public Node Insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        } else if (root.key < val) {
            root.right = Insert(root.right, val);
        } else {
            root.left = Insert(root.left, val);
        }
        return root;
    }

    public Node delete(Node root, int val) {
        if (root == null) {
            return null;
        } else if (root.key < val) {
            root.right = delete(root.right, val);
        } else if (root.key > val) {
            root.left = delete(root.left, val);
        } else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            } else {
                Node x = getclose(root);
                root.key = x.key;
                root.right = delete(root.right, x.key);
            }
        }
        return root;
    }

    public Node getclose(Node root) {
        Node curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public Node floor(Node root, int val) {
        Node res = null;
        while (root != null) {
            if (root.key == val) {
                return root;
            } else if (root.key > val) {
                root = root.left;
            } else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }

    public Node ceil(Node root, int val) {
        Node res = null;
        while (root != null) {
            if (root.key == val) {
                return root;
            } else if (root.key < val) {
                root = root.right;
            } else {
                res = root;
                root = root.left;
            }
        }
        return res;
    }

    public static void leftCeiling(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int diff = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i])
                    diff = Math.min(diff, arr[j] - arr[i]);
            }
            if (diff == Integer.MAX_VALUE)
                System.out.println("-1");
            else
                System.out.println(arr[i] + diff);
        }
    }

    int count = 0;
    public void KthSmallest(Node root, int k) {
        if (root != null) {
            KthSmallest(root.left, k);
            count++;
            if (count == k) {
                System.out.println(k + "th smallest :" + root.key);
                return;
            }
            KthSmallest(root.right, k);
        }
    }

    public boolean CheckBSD(Node root, int L, int R) {
        if (root == null) {
            return true; }
        return (root.key < R && root.key > L && (CheckBSD(root.left, L, root.key)) && (CheckBSD(root.right, root.key, R)));
    }

    int i=0;
    public int[] InorderArr(Node root, int[] arr){
        if(root == null){ return arr; }
        InorderArr(root.left, arr);
        arr[i++] = root.key;
        InorderArr(root.right, arr);
        return arr;
    }

    public int[] FixBST(Node root, int size){
        int[] arr = new int[size];
        int i=0,j=1,count=0,x=-1,y=-1;
        arr = InorderArr(root, arr);
        while(j != arr.length){
            if(arr[i] < arr[j] == false ){
                count++;
                if(count==1){ x=i; }
                y=j;
                j++; }
            else{
                if(count != 0){ break; }
                i++;
                j++;
            }
        }
        Swap(arr,x,y);
        return arr;
    }

    private int[] Swap(int[] arr, int x, int y) {
        int z = arr[x];
        arr[x] = arr[y];
        arr[y] = z;
        return arr;
    }

    public static class Node {
            private Node left;
            private Node right;
            private int key;

            public Node(int key) {
                this.key = key;
            }

            public Node(int key, Node left, Node right) {
                this.key = key;
                this.left = left;
                this.right = right;
            }
        }
 }
