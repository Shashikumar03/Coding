
package chaptree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    static Scanner sc=null;

    public static void main(String[] args) {
        
     sc= new Scanner(System.in);
     Tree t= new Tree();
     Node root= createTree();
     t.printTree(root);
        System.out.println();
     t.levelOrder(root);
        System.out.println("max element in the tree is");
        int s= t.maxElement(root);
        System.out.println(s);
         int half=t.gethalfCount( root);
         System.out.println("half node is"+ half);
    }
    
    static Node createTree(){
        Node root=null;
        System.out.println("enter the data");
        int data= sc.nextInt();
        if(data==-1)return null;
        root= new Node(data);
        System.out.println("enter left for"+ data);
        root.left=createTree();
        System.out.println("enter right for "+data);
        root.right=createTree();
        return root;
        
    }
      public void printTree(Node root){
          if(root==null)return ;
         
          printTree(root.left);
           System.out.print(root.data+" ");
          printTree(root.right);
         
          
        
    }
      public void levelOrder(Node root){
          Queue<Node> q= new LinkedList<>();
          q.add(root);
          while(q.size()>0){
              int count =q.size();
              for (int i = 0; i <count; i++) {
                    root =q.remove();
                    System.out.print(root.data+" ");
                    if(root.left!=null)
                    {
                        q.add(root.left);
                    }
                    if(root.right!=null)
                    {
                        q.add(root.right);
                    }
                  
              }
          }
          System.out.println();
          
      }
      public int maxElement(Node root){
             int max=Integer.MIN_VALUE;
          if(root!=null)
          {
           
              int leftvalue= maxElement(root.left);
              int rightvalue=maxElement(root.right);
              if(leftvalue>rightvalue)
              {
                  max= leftvalue;
              }
              else
              {
                  max= rightvalue;
              }
              if(root.data>max)
              {
                  max=root.data;
              }
             
          }
          
           return max;
      }
     static int gethalfCount(Node root) 
{ 
	if (root == null) 
	return 0; 

	int res = 0; 
	if ((root.left == null && root.right != null) || 
		(root.left != null && root.right == null)) 
	res++; 

	res += (gethalfCount(root.left) 
			+ gethalfCount(root.right)); 
	return res; 
} 

      
     
      
}
class Node{
    int data;
    Node right,left;
    public Node(int data){
        this.data=data;
    }
}
