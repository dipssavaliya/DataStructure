package BinaryTree;

import java.util.Scanner;

class Node {
  int vaue;
  Node left, right;

  Node(int value) {
    vaue = value;
    left = right = null;
  }
}

public class BinaryTreeCreate {

  public static void main(String[] args) {
  //  createManual();
    Node root = new Node(1);
    Scanner sc = new Scanner(System.in);
    createusingRecursion(sc, root);
    display(root," ");
  }

  private static void createusingRecursion(Scanner sc, Node node)
{
  if(node==null)
    {
      return;
    }
    //insert left node
  System.out.println("Do you want to  insert left node of " + node.vaue + "? ");
  boolean left = sc.nextBoolean();
  if(left){
    System.out.println("Please insert the value: ");
    int value = sc.nextInt();
    Node n = new Node(value);
  node.left = n;
    createusingRecursion(sc, n);
  }

    System.out.println("Do you want to  insert right node of " + node.vaue + "? ");
    boolean right = sc.nextBoolean();
    if(right)
    {
    System.out.println("Please insert the value: ");
    int value = sc.nextInt();
    Node n = new Node(value);
    node.right = n; 
    createusingRecursion(sc, n);
    }
  }

  private static void display(Node node, String indent)
  {
    if(node ==null)
    {
      return;
    }
    System.out.println(indent+node.vaue);
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
  }


  private static void createManual() {
    Node rootNode = new Node(2);

    rootNode.left = new Node(3);
    rootNode.right = new Node(4);

    rootNode.left.left = new Node(5);
    rootNode.left.right = new Node(7);

    rootNode.left.left.left = new Node(10);
    rootNode.left.left.right = new Node(12);

    rootNode.left.right.left = new Node(13);
    rootNode.left.right.right = new Node(14);

    rootNode.right.left = new Node(8);
    rootNode.right.right = new Node(9);

    rootNode.right.left.left = new Node(15);
    rootNode.right.left.right = new Node(16);

  }

}
