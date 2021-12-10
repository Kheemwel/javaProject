package DataStructures;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class HtmlTree extends JFrame {
    JTree html_tree;

    public HtmlTree() {
        DefaultMutableTreeNode html = new DefaultMutableTreeNode("Beller");
        DefaultMutableTreeNode head = new DefaultMutableTreeNode("head");
        DefaultMutableTreeNode body = new DefaultMutableTreeNode("body");
        DefaultMutableTreeNode meta = new DefaultMutableTreeNode("meta");
        DefaultMutableTreeNode title = new DefaultMutableTreeNode("title");
        DefaultMutableTreeNode ul = new DefaultMutableTreeNode("ul");
        DefaultMutableTreeNode h1 = new DefaultMutableTreeNode("h1");
        DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("h2");
        DefaultMutableTreeNode li1 = new DefaultMutableTreeNode("li");
        DefaultMutableTreeNode li2 = new DefaultMutableTreeNode("li");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("a");

        html.add(head);
        html.add(body);
        head.add(meta);
        head.add(title);
        body.add(ul);
        body.add(h1);
        body.add(h2);
        ul.add(li1);
        ul.add(li2);
        h2.add(a);

        html_tree = new JTree(html);
        add(html_tree);
        this.setTitle("JTree Example");
        this.setSize(300, 300);
        this.setVisible(true);

        Object[] parentNodes = {head.getParent(), meta.getParent(), ul.getParent(), li1.getParent(), a.getParent()};
        Object[] siblings = {Collections.list(html.children()), Collections.list(head.children()), Collections.list(body.children()), Collections.list(ul.children())};
        HashMap<String, Object> subtrees = new HashMap<>();
        subtrees.put("Subtree Beller", Collections.list(html.children()));
        subtrees.put("Subtree head", Collections.list(head.children()));
        subtrees.put("Subtree body", Collections.list(body.children()));
        subtrees.put("Subtree ul", Collections.list(ul.children()));
        subtrees.put("Subtree h2", Collections.list(h2.children()));
        HashMap<String, String> level = new HashMap<>();
        level.put("Level 0", "[Beller]");
        level.put("Level 1", "[head, body]");
        level.put("Level 2", "[meta, title, ul, h1, h2]");
        level.put("Level 3", "[li, li, a]");
        HashMap<String, Integer> degree = new HashMap<>();
        degree.put("Subtree Beller", 2);
        degree.put("Subtree head", 2);
        degree.put("Subtree body", 3);
        degree.put("Subtree ul", 2);
        degree.put("Subtree h2", 1);

        System.out.println("Kimwel Lourence C. Beller" + "\n" + "BSIT 2.1A");
        System.out.println();
        System.out.println("Root node: " + html.getRoot());
        System.out.println("Parent nodes: " + Arrays.toString(parentNodes));
        System.out.println("Siblings: " + Arrays.toString(siblings));
        System.out.println("One-level subtrees: " + subtrees);
        System.out.println("Nodes per level: " + level);
        System.out.println("Depth: " + html.getDepth());
        System.out.println("Degree of each one-level subtree: " + degree);
        System.out.println("Breadth-first: " + Collections.list(html.breadthFirstEnumeration()));
        System.out.println("Preorder: " + Collections.list(html.preorderEnumeration()));
        System.out.println("Postorder: " + Collections.list(html.postorderEnumeration()));
    }

    public static void main(String[] args) {
        new HtmlTree();
    }
}
