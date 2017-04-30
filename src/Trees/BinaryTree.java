package Trees;

import java.util.*;
import java.*;

/**
 * Created by siddhahastmohapatra on 08/11/16.
 */
public class BinaryTree {

    private List<Node> nodesAtkDistance;
    public BinaryTree(){
        nodesAtkDistance = new ArrayList<Node>();
    }

    public void insert(){
        
    }

    //TODO:Complete the implementations of POST, PRE, IN
    public void traversal(String type){
        List<Node> l = new LinkedList();
        Iterator<Node> i = l.iterator();
    }

    /*
    Height of a tree. Assuming that the height of the root is 0.
     */
    public int getHeight(Node root){
        if(root==null){
            return -1;
        }else{
            int leftHeight = getHeight(root.leftChild)+1;
            int rightHeight = getHeight(root.rightChild)+1;
            if(leftHeight>rightHeight){
                return leftHeight;
            }else{
                return rightHeight;
            }
        }
    }

    public void topView(Node root){

    }

    public void levelOrderTraversal(Node root){
        if(root==null){
            System.out.print("Empty Tree");
        } else{
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node node = q.poll();
                System.out.println(node.data);
                if(node.leftChild!=null){
                    q.add(node.leftChild);
                } if(node.rightChild!=null){
                    q.add(node.rightChild);
                }
            }
        }
    }

    boolean checkBST(Node root) {
        boolean checkBst = false;
        List<Node> list = new ArrayList<Node>();
        inOrder(root, list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).data<list.get(i+1).data){
                checkBst = true;
            } else{
                checkBst = false;
                break;
            }
        }
        return checkBst;
    }

    void inOrder(Node root, List<Node> list){

        while(root!=null){
            inOrder(root.leftChild, list);
            list.add(root);
            inOrder(root.rightChild, list);
        }
    }

    /*
    API to get the min node in a BST
     */
    public Node minimumNodeInBinarySearchTree(Node root){
        if(root==null){
            return null;
        } else{
            if(root.leftChild==null){
                return root;
            } else{
                return minimumNodeInBinarySearchTree(root.leftChild);
            }
        }
    }

    public List<Node> inOrderList(Node root){
        if(root!=null){
            List<Node> list = new ArrayList<Node>();
            inOrderTraversal(root, list);
            return list;
        } else{
            return null;
        }

    }

    /*
    All the nodes in the incresing order when doing inorder traversal 
     */
    public void inOrderTraversal(Node root, List<Node> list){
        if(root!=null){
            inOrderTraversal(root.leftChild, list);
            list.add(root);
            inOrderTraversal(root.rightChild, list);
        }
    }

    /*
    API for the kth smallest element in a BST
     */
    public Node kthSmallestNode(Node root, int k){
        if(root==null){
            return null;
        } else{
            List<Node> result = inOrderList(root);
            return result.get(k-1);
        }
    }

    public Node getRemoveMinimum(Node root, List<Node> list){

        if(root==null){
            return null;
        } else{
            Node curr = root;
            Node parent = root;
            while(curr.leftChild!=null){
                parent = curr;
                curr = curr.leftChild;
            }
            if(parent==root){
                root = parent.rightChild;
                return root;
            } else{
                parent.leftChild = curr.rightChild;
                return curr;
            }
        }

    }

    public List<Node> minimumOrderList(Node root){
        List<Node> nodes = new ArrayList<Node>();
        while(root!=null){
            root = getRemoveMinimum(root, nodes);
        }
        return nodes;
    }

    public List<Node> merge_bst_nodes(Node root1, Node root2){
        List<Node> nodes1 = minimumOrderList(root1);
        List<Node> nodes2 = minimumOrderList(root2);
        //merge this two list to one.
        List<Node> result = new ArrayList<Node>();
        result.addAll(nodes1);
        result.addAll(nodes2);
        return result;
    }

    /*
    API to get the list of nodes at k distance from the root.
     */
    public List<Node> getNodesAtkDistance(Node root, int k){
        nodesAtKDistance(root, k);
        return nodesAtkDistance;
    }


    private void nodesAtKDistance(Node node, int k){
        if(node==null){
            return;
        } else{
            if(k==0){
                nodesAtkDistance.add(node);
                return;
            } else{
                nodesAtKDistance(node.leftChild,k-1);
                nodesAtKDistance(node.rightChild, k-1);
            }
        }

    }

    /*
    API to get the list of nodes to travel from root to a given node
     */
    public boolean printAncestors(Node root, Node node){
        if(root==null){
            return false;
        }
        if(root.data == node.data){
            return true;
        }

        if(printAncestors(root.leftChild, node)|| printAncestors(root.rightChild, node)){
            System.out.println(root.data);
            return true;
        }
        return false;
    }

    /*
    API for finding the maximum diameter of a tree
    Get the array and identify the index where the max element lies
    That index is the depth where the number of elements are the largest
     */
    public int[] maximumDimameterOfTree(Node root){
        if(root == null){
            return null;
        } else{
            int[] depths = new int[getHeight(root)+1];
            preOrderDepthTraversal(root, 0, depths);
            return depths;
        }
    }

    private void preOrderDepthTraversal(Node node, int depth, int[] depths){

        if(node == null){
            return;
        } else{
            depths[depth]++;
            preOrderDepthTraversal(node.leftChild, depth+1, depths);
            preOrderDepthTraversal(node.rightChild, depth+1, depths);
        }

    }

    public Map<Integer, List<Node>> getRightShifts(Node node){
        Map<Integer, List<Node>> map = new HashMap<Integer, List<Node>>();
        createRightShiftNode(node, 0, map);
        return map;
    }

    private void createRightShiftNode(Node node, int depth, Map<Integer, List<Node>> map){
        if(node==null){
            return;
        }else{
            if(map.get(depth)==null){
                map.put(depth, new LinkedList<Node>());
            }
            map.get(depth).add(node);
            createRightShiftNode(node.leftChild, depth+1, map);
            createRightShiftNode(node.rightChild, depth+1, map);
        }
    }



}
