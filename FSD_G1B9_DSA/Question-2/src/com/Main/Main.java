/*You are working in an MNC, which manages the Transactions, where only BST is used as a Data Structure.
 The company stores all the data of transactions in BST such that the tree is always a complete BST. 
A new business requirement has arrived where the BST should not contain any left node.
You are required to modify the existing BST and display the node values present in ascending order.
 */
package com.Main;
import com.Model.RightSkew;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightSkew rightSkewAsc = new RightSkew();

		rightSkewAsc.showRightTree();

	}

}
