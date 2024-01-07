package org.tgco.algos;


import java.util.ArrayList;
import java.util.List;

public class NodeDept {

    int value;
    BinaryTree left;
    BinaryTree right;


    public NodeDept( int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public  static int nodeDepths( BinaryTree root ) {
        List<Integer> depths = new ArrayList<>();
        int currentDept = 0;
        calculateBranchDepts(root, depths, currentDept);

        return depths.stream().mapToInt(Integer::intValue).sum();
    }

    private static void calculateBranchDepts(BinaryTree root, List<Integer> depths, int currentDept) {

        depths.add(currentDept);
        currentDept++;
        if (root.left != null) {
            calculateBranchDepts(root.left, depths, currentDept);
        }
        if(root.right != null) {
            calculateBranchDepts(root.right, depths, currentDept);

        }
    }

}
