   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void topView(Node root) {
       if(root == null) 
           return;
        leftNode(root);
        if(root.right != null){
            rightNode(root.right);
        }
    }

    void leftNode(Node lRoot){
        if(lRoot.left != null){
            leftNode(lRoot.left);
        }
        System.out.print(lRoot.data + " ");
        return;
    }

    void rightNode(Node rRoot){
        System.out.print(rRoot.data + " ");
        if(rRoot.right != null){
            rightNode(rRoot.right);
        }
        return;
    }
