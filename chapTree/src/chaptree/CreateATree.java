/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chaptree;

import java.awt.BorderLayout;

/**
 *
 * @author shash
 */
public class CreateATree {
  static  Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int key){
            this.data=key;
            this.left=null;
            this.right=null;
        }
        
    }
       public static Node createNewNode(int data){
           Node n= new Node(data);
           return n;
       }
      public static void main(String[] args) {
          root= createNewNode(5);
          root.left=createNewNode(3);
          root.left.left=createNewNode(2);
          root.left.right=createNewNode(4);
          root.right=createNewNode(8);
          root.right.left= createNewNode(4);
          root.right.right= createNewNode(10);
          root.right.right.right=createNewNode(30);
          printTree(root);
         // nodeToRoot(root,30);
       Node n=   tree(root);
          System.out.println();
          printTree(n);
    }
     static Node tree(Node root){
          
          if(root==null)
          {
              Node n= new Node(1000);
              return n;
          }
          root.left=tree(root.left);
          root.right=tree(root.right);
          return root;
      }
      static void printTree(Node root){
          if(root==null) return;
          System.out.print(root.data+" ");
          printTree(root.left);
          printTree(root.right);
      }
      static boolean nodeToRoot(Node root, int k){
          if(root==null) return false;
          if(root.data==k) return true;
          boolean l=nodeToRoot(root.left, k);
          boolean  r= nodeToRoot(root.right, k);
        if(l || r)
        { 
            System.out.println(); 
           System.out.print(root.data+" ");
        }
        return (l||r);
      }
    
    
}
