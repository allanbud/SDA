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

class E_125_preorder  {


    public static class TreeNode
    {
        int NodeValue;
        TreeNode left;
        TreeNode right;

        TreeNode(int NodeValue)

        {
            this.NodeValue=NodeValue;
        }
    }

//In PreOrder traversal visit each node before its children.

//This method eats trees of TreeNode type where root variable represents the Tree
//and because trees grow on roots, the root value here takes createBinaryTree().NodeValue
//when root is finished root.left becomes new "virtual root" for method PreOrder
    public void PreOrder(TreeNode root) {
        if(root !=  null) {

            System.out.println(root.NodeValue);

//this method works like a nesting doll (Matryeshka), so each time the method is started inside itself,
// the "external methods" are saved. If the inner method dies (null), then the outer comes to life.
//fucking wierd
            PreOrder(root.left);


            PreOrder(root.right);
        }
    }



    public static TreeNode createBinaryTree()
    {
//First create object rootNode of the class TreeNode with NodeValue
        TreeNode rootNode = new TreeNode(10);
//Then new object with its own name for each node of the class TreeNode with NodeValue
        TreeNode node20 = new TreeNode(20);
        TreeNode node30 = new TreeNode(30);
        TreeNode node40 = new TreeNode(40);
        TreeNode node50 = new TreeNode(50);
//Now building the tree on top of rootNode by stiching nodes on either side
//higher number goes to right
        rootNode.left = node20;
        rootNode.right = node30;

        node20.left = node40;
        node20.right = node50;
//rootNode with all the tree on top assigned to createBinaryTree()
        return rootNode;
    }




    public static void main(String[] args)
    {
//Create a variable (?) Tree of TreeNode type and assign a value of createBinaryTree() ( return rootNode; )
//This makes NewBinaryTree.PreOrder(createBinaryTree()) just a bit more elegant :))
        TreeNode Tree = createBinaryTree();

//Because PreOrder() is a non-static method an object is needed to execute it
//otherwise ( public static void PreOrder() )
//if static, it could be just PreOrder(rootNode) instead of NewBinaryTree.PreOrder(rootNode);
        E_125_preorder  NewBinaryTree = new E_125_preorder();
        NewBinaryTree.PreOrder(Tree);
    }

}