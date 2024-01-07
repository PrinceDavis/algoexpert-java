package org.tgco.algos;

import java.util.ArrayList;

public class BranchSums {

    public  static ArrayList<Integer> branchSums(BinaryTree root) {
        ArrayList<Integer> sums = new ArrayList<>();
        calculateSums(root, sums, 0);
        return  sums;
    }

    private static void calculateSums(BinaryTree root, ArrayList<Integer> sums, int currentTotal) {
        currentTotal += root.value;
        if (root.left == null && root.right == null) {
            sums.add(currentTotal);
        }
        if(root.left != null) {
            calculateSums(root.left, sums, currentTotal);
        }
        if (root.right != null) {
            calculateSums(root.right, sums, currentTotal);
        }

    }

}

class BinaryTree {
    public int value;
    public BinaryTree left;
    public  BinaryTree right;
    public BinaryTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
