class Sol
 {
    private Node first, last, prev;
    public void inorder(Node root) {
        if(root==null)return ;
        inorder(root.left);
//        if(prev!=null && root.data < prev.data){
//            if(first==null)
//                first = prev;
//            last=root;
//        }
        prev=root;
        inorder(root.right);
    }
//    public void swap(Node a, Node b){
//        int t = a.data;
//        a.data=b.data;
//        b.data = t;
//    }
    public Node correctBST(Node root)
{
    first = null; last = null; prev = null;
    inorder(root);

//    if(first!=null && last!=null){
//        swap(first, last);
//    }
    return root;

 }
}
