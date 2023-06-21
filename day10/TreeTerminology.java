package com.day10;

public class TreeTerminology {
	    /*
	    #  child-> direct successor
	    #  parent-> direct predecessor 
	    #  root-> node with no parent
	    #  sibling-> children oif same parent
	    #  leaf-> node with no children -> external node
	    #  non leaf-> internal node
	    #  if n nodes then n-1 edges
        #  path : Sequence of consecutive edges between 2 nodes
        #  Ancestor : any predecessor node on path from root to that node
        #  Descendants : any successor node from that node to leaf node
        #  Sub tree : Containing a node of a tree and all its decendants
        #  depth : no of edges in the path from root to node
        
        1. A rooted binary tree is a binary tree that satisifies the following 2 properties-
         ** It has a root node
         ** Each node has at most 2 children
        2. A strictly binary tree is a binary tree in which every node has either 0 or 2 nodes
        3. A complete or perfect binary tree :
        **Complete  binary tree every node must have two child’s and all leaf nodes at the same level
        4. Almost complete binary tree :
        ** all levels must be filled except the last level
        ** The last level must be filled strictly from left to right
        
        
         # Pre Order :  Root L R
         # In Order  :  L Root R
         # Post Order : L R Root
         
         EX: 
                                 A
                               /   \
                              B     C
                              /\    /\
                             D  E   F G
                             
                          In order :  D B E A F C G
                          pre order : A B D E C F G
                          post order : D E B F G C A
        */
}
