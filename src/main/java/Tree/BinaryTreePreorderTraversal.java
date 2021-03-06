package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的 前序 遍历。
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode pRoot = stack.pop();
            res.add(pRoot.val);
            if (pRoot.right != null) stack.push(pRoot.right);
            if (pRoot.left != null) stack.push(pRoot.left);
        }
        return res;
    }
}
