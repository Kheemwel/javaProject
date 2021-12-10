package DataStructures;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Beller_HtmlTree extends JFrame {
    static JTree html_tree;
    static DefaultMutableTreeNode root, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;

    public Beller_HtmlTree() {
        root = new DefaultMutableTreeNode("Beller");
        n1 = new DefaultMutableTreeNode("head");
        n2 = new DefaultMutableTreeNode("body");
        n3 = new DefaultMutableTreeNode("meta");
        n4 = new DefaultMutableTreeNode("title");
        n5 = new DefaultMutableTreeNode("ul");
        n6 = new DefaultMutableTreeNode("h1");
        n7 = new DefaultMutableTreeNode("h2");
        n8 = new DefaultMutableTreeNode("li");
        n9 = new DefaultMutableTreeNode("li");
        n10 = new DefaultMutableTreeNode("a");

        root.add(n1);
        root.add(n2);
        n1.add(n3);
        n1.add(n4);
        n2.add(n5);
        n2.add(n6);
        n2.add(n7);
        n5.add(n8);
        n5.add(n9);
        n7.add(n10);

        html_tree = new JTree(root);
        add(html_tree);
        this.setTitle("JTree Example");
        this.setSize(300, 300);
        this.setVisible(true);

    }

    static ArrayList<Object> parentNodes() {
        ArrayList<Object> parent = new ArrayList<>();
        parent.add(n1.getParent());
        parent.add(n3.getParent());
        parent.add(n5.getParent());
        parent.add(n8.getParent());
        parent.add(n10.getParent());
        return parent;
    }

    static ArrayList<Object> Siblings() {
        ArrayList<Object> siblings = new ArrayList<>();
        siblings.add(Collections.list(root.children()));
        siblings.add(Collections.list(n1.children()));
        siblings.add(Collections.list(n2.children()));
        siblings.add(Collections.list(n5.children()));
        return siblings;
    }

    static HashMap<Object, Object> subTrees() {
        HashMap<Object, Object> subtrees = new HashMap<>();
        subtrees.put(n1.getParent(), Collections.list(root.children()));
        subtrees.put(n3.getParent(), Collections.list(n1.children()));
        subtrees.put(n5.getParent(), Collections.list(n2.children()));
        subtrees.put(n8.getParent(), Collections.list(n5.children()));
        subtrees.put(n10.getParent(), Collections.list(n7.children()));
        return subtrees;
    }

    static HashMap<String, String> perLevel() {
        HashMap<String, String> level = new HashMap<>();
        level.put("Level 0", "[Beller]");
        level.put("Level 1", "[head, body]");
        level.put("Level 2", "[meta, title, ul, h1, h2]");
        level.put("Level 3", "[li, li, a]");
        return level;
    }

    static HashMap<String, Integer> Degree() {
        HashMap<String, Integer> degree = new HashMap<>();
        degree.put("Subtree Beller", 2);
        degree.put("Subtree head", 2);
        degree.put("Subtree body", 3);
        degree.put("Subtree ul", 2);
        degree.put("Subtree h2", 1);
        return degree;
    }

    public static void main(String[] args) {
        new Beller_HtmlTree();

        System.out.println("Kimwel Lourence C. Beller" + "\n" + "BSIT 2.1A");
        System.out.println();
        System.out.println("Root node: " + root.getRoot());
        System.out.println("Parent nodes: " + parentNodes());
        System.out.println("Siblings: " + Siblings());
        System.out.println("One-level subtrees: " + subTrees());
        System.out.println("Nodes per level: " + perLevel());
        System.out.println("Depth: " + root.getDepth());
        System.out.println("Degree of each one-level subtree: " + Degree());
        System.out.println("Breadth-first: " + Collections.list(root.breadthFirstEnumeration()));
        System.out.println("Preorder: " + Collections.list(root.preorderEnumeration()));
        System.out.println("Postorder: " + Collections.list(root.postorderEnumeration()));
    }
}
