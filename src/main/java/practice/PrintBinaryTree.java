package practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LushWinter (ahbbhywmd@163.com)
 * @Description
 * @create 2020-04-09
 */
public class PrintBinaryTree {

    public static void printTree(List<Node> nodes) {
        if (nodes.size() == 0) {
            return;
        }

        List<Node> children = new ArrayList<>();
        for (Node node :nodes) {
            System.out.print(node.data);
            if (node.left != null) {
                children.add(node.left);
            }

            if (node.right != null) {
                children.add(node.right);
            }
        }
        System.out.println();
        printTree(children);
    }

    public static void main(String args[]) {
        Node root = new Node();
        root.data = 1;
        root.left = new Node();
        root.left.data = 2;
        root.right = new Node();
        root.right.data = 3;
        List<Node> nodes = new ArrayList<Node>();
        nodes.add(root);
        printTree(nodes);
    }
}
