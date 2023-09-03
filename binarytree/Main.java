public class Main {
    public static void main(String[] args){
        binaryTree binarytree=new binaryTree();
        binarytree.insert(10);
        binarytree.insert(5);
        binarytree.insert(15);
        binarytree.insert(3);
        binarytree.insert(8);
        binarytree.insert(12);
       binarytree.preOrder(binarytree.root);
        System.out.println();
        binarytree.inOrder(binarytree.root);
        System.out.println();
        System.out.print(binarytree.search(binarytree.root,1));
    }
}