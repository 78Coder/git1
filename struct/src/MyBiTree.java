import java.util.Queue;

public class MyBiTree {
    MyBiNode root;
    public int index;

    public MyBiNode creatBiTree(Integer[] a) {
        MyBiNode root = null;
        if (a[index] != null){
            root = new MyBiNode(a[index++]);
            root.lchild = creatBiTree(a);
            index++;
            root.rchild = creatBiTree(a);

        }
        return root;

    }

    public void preOrder(MyBiNode t){
        if (t == null){
            return;
        }
        System.out.println(t.data);
        preOrder(t.lchild);
        preOrder(t.rchild);
    }

    public void inOrder(MyBiNode t){
        if (t == null){
            return;
        }
        inOrder(t.lchild);
        System.out.println(t.data);
        inOrder(t.rchild);
    }

    public void postOrder(MyBiNode t){
        if (t == null){
            return;
        }
        postOrder(t.lchild);
        postOrder(t.rchild);
        System.out.println(t.data);
    }


}
