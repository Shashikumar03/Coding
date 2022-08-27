

package chaptree;


import java.util.*; 
class Tree1 { 


static class Node 
{ 
	int data; 
	Node left, right; 
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
} 

  static int res=0;
static int gethalfCount(Node root) 
{ 
    int l=0;
	if (root == null) 
	return 0; 
       

	
	if ((root.left == null && root.right != null) || 
		(root.left != null && root.right == null)) 
        {
            l++;
            
        }
        
       int lr= gethalfCount(root.left);
       int r=gethalfCount(root.right);
       int c=lr+r+l;
       return c;
         
        
	
}
static int sum(Node root){
    if(root==null)return 0;
    int l=sum(root.left);
    int r= sum(root.right);
    int sum= l+r+root.data;
    return sum;
}
static int countNonleaf(Node root){
    int count=0;
    if(root==null) return 0;
    if(root.left==null && root.right!=null || root.right==null && root.left!=null || root.left!=null && root.right!=null) count++;
    int l=countNonleaf(root.left);
    int r= countNonleaf(root.right);
    return l+r+count;
}

static Node newNode(int data) 
{ 
	Node node = new Node(data); 
	 
	node.left = null; 
	node.right = null; 
	return (node); 
} 

// Driver program 
public static void main(String[] args) 
{ 
     /*  2 
	/ \ 
	7 5 
	\ \ 
	6 9 
	/ \ / 
	1 11 4 
	*/

	Node root = newNode(2); 
	root.left = newNode(7); 
	root.right = newNode(5); 
	root.left.right = newNode(6); 
	root.left.right.left = newNode(1); 
	root.left.right.right = newNode(11); 
	root.right.right = newNode(9); 
	root.right.right.left = newNode(4); 

	System.out.println(gethalfCount(root)); 
        System.out.println(sum(root));
        System.out.println(countNonleaf(root));

} 
} 

