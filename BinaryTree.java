package Exercises;
/*
Write a Java program to get the preorder traversal of its nodes' values of a given a binary tree. Go to the editor
Example:
    10
   / \
  20   30
 / \
40   50
Expected output: 10 20 40 50 30
 */
import java.util.Scanner;
import java.util.Random;


class preordertraversal  {



    private static class TreeNode
    {
        int NodeValue;
        TreeNode left;
        TreeNode right;

        TreeNode(int NodeValue)

        {
            this.NodeValue=NodeValue;
        }
    }



    private void PreOrder(TreeNode root) {
        if(root !=  null) {

            System.out.println(root.NodeValue);

            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

    private static void AddNode(TreeNode node, TreeNode tree){

        if ((node.NodeValue >= tree.NodeValue) && tree.right == null){
            tree.right = node;
        }
        else if ((node.NodeValue < tree.NodeValue) && tree.left == null) {
            tree.left = node;
        }
        else if ((node.NodeValue >= tree.NodeValue) && tree.right != null){
            AddNode(node, tree.right);
        }
        else if ((node.NodeValue < tree.NodeValue) && tree.left != null) {
            AddNode(node, tree.left);}
    }

    private static TreeNode createBinaryTree(int NumberOfNodes)
    {

        Random rnd = new Random();

        TreeNode[] node = new TreeNode[NumberOfNodes+1];

        node[0] = new TreeNode(rnd.nextInt(100));

        for (int i=1; i<NumberOfNodes+1; i++) {
           node[i] = new TreeNode(rnd.nextInt(100));

           AddNode(node[i], node[0]);

        }
        return node[0];
    }




    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.print("Please enter how many nodes to create: ");
        int NumberOfNodes = scan.nextInt();


        TreeNode Tree = createBinaryTree(NumberOfNodes);

        preordertraversal NewBinaryTree = new preordertraversal();

        NewBinaryTree.PreOrder(Tree);
    }

}