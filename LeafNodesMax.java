import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class NodeL {
    int data;
    NodeL left;
    NodeL right;
    NodeL (int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class LeafNodesMax {
    static NodeL buildTree(String str){
        if(str.length()==0 || str.charAt(0)== 'N'){
            return null;
        }
        String ip[] = str.split(" ");
        NodeL root = new NodeL(Integer.parseInt(ip[0]));
        Queue<NodeL> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size()>0 && i< ip.length){
            NodeL currNode = queue.peek();
            queue.remove();

            String currVal = ip[i];

            if(!currVal.equals("N")){
                currNode.left = new NodeL(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >=ip.length)
                break;
            currVal = ip[i];
            if(!currVal.equals("N")){
                currNode.right = new NodeL(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }
    static void printInorder(NodeL root){
        if(root == null)
            return;
        printInorder(root.left);
        System.out.println(root.data+" ");
        printInorder(root.right);
    }

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t > 0){
            String s = br.readLine();
            NodeL root = buildTree(s);

            Tree g = new Tree();
            System.out.println(g.maxPathSumUtil(root));
            t--;
        }
    }
}
class Tree
{
    int res = Integer.MIN_VALUE;

    int maxPathSumUtil(NodeL root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return root.data;

        int ls = maxPathSumUtil(root.left);
        int rs = maxPathSumUtil(root.right);

        if (root.left != null && root.right != null) {
            res = Math.max(res, (ls + rs + root.data));
            return Math.max(ls, rs) + root.data;
        }
        if (root.left == null)
            return rs + root.data;
        else
            return ls + root.data;
    }

    int maxPathSum(NodeL root) {
        int h=maxPathSumUtil(root);
        if(root.left==null || root.right==null)
        {
            res=Math.max(res,h);
        }
        return res;
    }
}