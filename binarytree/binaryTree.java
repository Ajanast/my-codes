public class binaryTree {
    Node root;
    public binaryTree(){
        root=null;
    }
    public void insert(int data) {
        root=insersect(root,data);
    }
    public Node insersect(Node root,int data){
        if(root==null){
            Node newNode=new Node(data);
            root=newNode;
            return  root;
        } else if (data< root.data) {
            root.left=insersect(root.left,data);
        }
        else {
            root.right=insersect(root.right,data);
        }
        return root;
    }
    public void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public boolean search(Node root,int data){
        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        else if(data< root.data){
           return search(root.left,data);
        }
        else {
           return search(root.right,data);
        }
    }
    public Node deletion(Node root,int data){
        if(root==null){
            return root;
        }
        else if(data<root.data){
           root.left= deletion(root.left,data);
        } else if (data>root.data) {
           root.right= deletion(root.right,data);
        }else{
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            root.data=min(root.right);
            root.right=deletion(root.right,root.data);

        }
      return  root;
    }
    public int min(Node root){
        int minValue= root.data;
        while (root.left!=null){
            minValue=root.left.data;
            root=root.left;
        }
        return minValue;

    }
}