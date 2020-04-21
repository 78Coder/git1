public class MyBiTreeD1 {
    public static void main(String[] args) {
        MyBiTree bt = new MyBiTree();
//        bt.root.lchild = new MyBiNode(2);
//        bt.root.rchild = new MyBiNode(3);
//        bt.root.lchild.lchild = new MyBiNode(4);
//        bt.root.lchild.rchild = new MyBiNode(5);
//        bt.root.rchild.lchild = new MyBiNode(6);
//        bt.root.rchild.rchild = new MyBiNode(7);
        Integer[] a = {1,2,3,null,null,null,null};
        bt.root = bt.creatBiTree(a);
        bt.postOrder(bt.root);
    }
}
