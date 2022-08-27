/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chaptree;

/**
 *
 * @author shash
 */
public class IdenticalStructure {
    
    
    
    
    // Java program to check if two trees have 

	
// A binary tree node has data, 
// pointer to left child and 
// a pointer to right child 
static class Node 
{ 
	int data; 
	Node left; 
	Node right; 
}; 

// Helper function that allocates a new node 
// with the given data and null left 
// and right pointers. 
static Node newNode(int data) 
{ 
	Node node = new Node(); 
	node.data = data; 
	node.left = null; 
	node.right = null; 

	return(node); 
} 

// Function to check if two trees 
// have same structure 
static boolean isSameStructure(Node a, Node b) 
{ 
	// 1. both empty 
	if (a == null && b == null) 
		return true; 

	// 2. both non-empty . compare them 
	if (a != null && b != null) 
	{ 
		
		 
		 boolean bb=	isSameStructure(a.left, b.left) ;
		boolean cc=	isSameStructure(a.right, b.right); 
                boolean dd= bb&&cc;
                return dd;
		
	} 
	
	// 3. one empty, one not . false 
	return false; 
} 

// Driver code 
public static void main(String args[])
{ 
	Node root1 = newNode(10); 
	Node root2 = newNode(100); 
	root1.left = newNode(7); 
	root1.right = newNode(15); 
	root1.left.left = newNode(4); 
	root1.left.right = newNode(9); 
	root1.right.right = newNode(20); 

	root2.left = newNode(70); 
	root2.right = newNode(150); 
	root2.left.left = newNode(40); 
	root2.left.right = newNode(90); 
	root2.right.right = newNode(200);
        root2.right.right.left= newNode(300);

	if (isSameStructure(root1, root2)) 
		System.out.printf("Both trees have same structure"); 
	else
		System.out.printf("Trees do not have same structure"); 
}
} 

// This code is contributed by Arnab Kundu

    

