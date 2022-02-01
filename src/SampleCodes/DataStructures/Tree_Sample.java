package SampleCodes.DataStructures;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree_Sample extends JFrame {
    JTree tree;

    public Tree_Sample() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("B");
        DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("C");
        DefaultMutableTreeNode n3 = new DefaultMutableTreeNode("D");
        DefaultMutableTreeNode n4 = new DefaultMutableTreeNode("E");
        DefaultMutableTreeNode n5 = new DefaultMutableTreeNode("F");
        DefaultMutableTreeNode n6 = new DefaultMutableTreeNode("G");
        root.add(n1);
        root.add(n2);
        n1.add(n3);
        n1.add(n4);
        n2.add(n5);
        n5.add(n6);

        tree = new JTree(root);
        add(tree);
        this.setTitle("JTree Example");
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Tree_Sample();
    }
}
