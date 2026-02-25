public void main(String[] args) {
    // Test code can be added here
}

public boolean isIdentical(TreeNode root, TreeNode subRoot) {

    // If both are null, trees match
    if (root == null && subRoot == null) {
        return true;
    }

    // If one is null and the other is not
    if (root == null || subRoot == null) {
        return false;
    }

    // If values match, check left and right subtree
    if (root.val == subRoot.val) {
        boolean leftCheck = isIdentical(root.left, subRoot.left);
        boolean rightCheck = isIdentical(root.right, subRoot.right);
        return leftCheck && rightCheck;
    }

    // Values do not match
    return false;
}


public boolean isSubtree(TreeNode root, TreeNode subRoot) {

    // Empty subtree is always valid
    if (subRoot == null) {
        return true;
    }

    // If main tree becomes empty
    if (root == null) {
        return false;
    }

    // Check current node
    if (isIdentical(root, subRoot)) {
        return true;
    }

    // Recursively check left and right
    return isSubtree(root.left, subRoot) ||
           isSubtree(root.right, subRoot);
}