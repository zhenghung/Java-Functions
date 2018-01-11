/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    Node prev;
    boolean checkBST(Node root) {
        if (root != null)
        {
            if (!checkBST(root.left))
                return false;
 
            // allows only distinct values node
            if (prev != null && root.data <= prev.data )
                return false;
            prev = root;
            return checkBST(root.right);
        }
        return true;
    }