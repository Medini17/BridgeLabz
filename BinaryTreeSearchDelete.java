/**
 * 
 */
package com.bridgelabz.DataStructure;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose:
 */
public class BinaryTreeSearchDelete {
	  
	    class Node
	    {
	        int key;
	        Node left, right;
	 
	        public Node(int item)
	        {
	            key = item;
	            left = right = null;
	        }
	    }
	 
	    // Root of BST
	    Node root;
	 
	    // Constructor
	    BinaryTreeSearchDelete()
	    {
	        root = null;
	    }
	 
	    // This method mainly calls deleteRec()
	    void deleteKey(int key)
	    {
	        root = deleteRec(root, key);
	    }
	 
	    /* A recursive function to insert a new key in BST */
	    Node deleteRec(Node root, int key)
	    {
	        /* Base Case: If the tree is empty */
	        if (root == null)  return root;
	 
	        /* Otherwise, recur down the tree */
	        if (key < root.key)
	            root.left = deleteRec(root.left, key);
	        else if (key > root.key)
	            root.right = deleteRec(root.right, key);
	 
	        // if key is same as root's key, then This is the node
	        // to be deleted
	        else
	        {
	            // node with only one child or no child
	            if (root.left == null)
	                return root.right;
	            else if (root.right == null)
	                return root.left;
	 
	            
	            root.key = minValue(root.right);
	 
	           
	            root.right = deleteRec(root.right, root.key);
	        }
	 
	        return root;
	    }
	 
	    int minValue(Node root)
	    {
	        int minv = root.key;
	        while (root.left != null)
	        {
	            minv = root.left.key;
	            root = root.left;
	        }
	        return minv;
	    }
	 
	    // This method mainly calls insertRec()
	    void insert(int key)
	    {
	        root = insertRec(root, key);
	    }
	 
	    /* A recursive function to insert a new key in BST */
	    Node insertRec(Node root, int key)
	    {
	 
	        /* If the tree is empty, return a new node */
	        if (root == null)
	        {
	            root = new Node(key);
	            return root;
	        }
	 
	        /* Otherwise, recur down the tree */
	        if (key < root.key)
	            root.left = insertRec(root.left, key);
	        else if (key > root.key)
	            root.right = insertRec(root.right, key);
	 
	        /* return the (unchanged) node pointer */
	        return root;
	    }
	 
	    // This method mainly calls InorderRec()
	    void inorder()
	    {
	        inorderRec(root);
	    }
	 
	    // A utility function to do inorder traversal of BST
	    void inorderRec(Node root)
	    {
	        if (root != null)
	        {
	            inorderRec(root.left);
	            System.out.print(root.key + " ");
	            inorderRec(root.right);
	        }
	    }
	 
	    // Driver Program to test above functions
	    public static void main(String[] args)
	    {   Utility u=new Utility();
	    	BinaryTreeSearchDelete tree = new BinaryTreeSearchDelete();
	  
	        tree.insert(u.inputInteger());
	        tree.insert(u.inputInteger());
	        tree.insert(u.inputInteger());
	        tree.insert(u.inputInteger());
	        tree.insert(u.inputInteger());
	        tree.insert(u.inputInteger());
	        tree.insert(u.inputInteger());
	 
	        System.out.println("Inorder traversal of the given tree");
	        tree.inorder();
	 
	        System.out.println("\n enter the element to delete");
	        tree.deleteKey(u.inputInteger());
	        System.out.println("Inorder traversal of the modified tree");
	        tree.inorder();
	 
	        System.out.println("\n enter the element to delete ");
	        tree.deleteKey(u.inputInteger());
	        System.out.println("Inorder traversal of the modified tree");
	        tree.inorder();
	 
	        System.out.println("\n enter the element to delete ");
	        tree.deleteKey(u.inputInteger());
	        System.out.println("Inorder traversal of the modified tree");
	        tree.inorder();
	    }
	}

