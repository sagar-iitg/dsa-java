package com.sagar.tree;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public TreeNode buildTree(int start, int end, int arr[]) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr[mid]);
       // System.out.print(root.val);
       // System.out.println();
        //System.out.println(root);
        if (start == end) {

            return root;
        }
        root.left = buildTree(start, mid - 1, arr);
        root.right = buildTree(mid + 1, end, arr);

        return root;
    }

    // Test case to validate the buildTree method
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Balanced tree
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7,8};
        TreeNode tree = solution.buildTree(0, arr1.length - 1, arr1);
        printTreeInOrder(tree);  // Expected output: 1 2 3 4 5 6 7
        System.out.println();

        // Test case 2: Single element
        int[] arr2 = {10};
        TreeNode root2 = solution.buildTree(0, arr2.length - 1, arr2);
        printTreeInOrder(root2);  // Expected output: 10
        System.out.println();

        // Test case 3: Empty array
        int[] arr3 = {};
        TreeNode root3 = solution.buildTree(0, arr3.length - 1, arr3);
        printTreeInOrder(root3);  // Expected output: (no output)
        System.out.println();

        // Test case 4: Unbalanced tree
        int[] arr4 = {2, 3, 4, 5, 6, 7, 8, 9};
        TreeNode root4 = solution.buildTree(0, arr4.length - 1, arr4);
        printTreeInOrder(root4);  // Expected output: 2 3 4 5 6 7 8 9
        System.out.println();
    }

    // Helper method to print tree in-order
    public static void printTreeInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        printTreeInOrder(root.left);
        System.out.print(root.val + " ");
        printTreeInOrder(root.right);
    }
}
