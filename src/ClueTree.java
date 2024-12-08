public class ClueTree {
    // Node class representing each clue in the tree
    private static class Node {
        String clue;
        Node left, right;

        Node(String clue) {
            this.clue = clue;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    // Insert a new clue into the tree
    public void insert(String clue) {
        root = insertRecursive(root, clue);
        System.out.println("Inserted clue: " + clue);
    }

    private Node insertRecursive(Node node, String clue) {
        if (node == null) {
            return new Node(clue);
        }
        if (clue.compareTo(node.clue) < 0) {
            node.left = insertRecursive(node.left, clue);
        } else if (clue.compareTo(node.clue) > 0) {
            node.right = insertRecursive(node.right, clue);
        }
        return node;
    }

    // Perform in-order traversal
    public void inOrderTraversal() {
        System.out.println("In-order traversal:");
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(Node node) {
        if (node != null) {
            inOrderRecursive(node.left);
            System.out.print(node.clue + " ");
            inOrderRecursive(node.right);
        }
    }

    // Perform pre-order traversal
    public void preOrderTraversal() {
        System.out.println("Pre-order traversal:");
        preOrderRecursive(root);
        System.out.println();
    }

    private void preOrderRecursive(Node node) {
        if (node != null) {
            System.out.print(node.clue + " ");
            preOrderRecursive(node.left);
            preOrderRecursive(node.right);
        }
    }

    // Perform post-order traversal
    public void postOrderTraversal() {
        System.out.println("Post-order traversal:");
        postOrderRecursive(root);
        System.out.println();
    }

    private void postOrderRecursive(Node node) {
        if (node != null) {
            postOrderRecursive(node.left);
            postOrderRecursive(node.right);
            System.out.print(node.clue + " ");
        }
    }

    // Find a specific clue in the tree
    public boolean findClue(String clue) {
        boolean found = findClueRecursive(root, clue);
        System.out.println("Clue \"" + clue + "\" " + (found ? "found" : "not found") + " in the tree.");
        return found;
    }

    private boolean findClueRecursive(Node node, String clue) {
        if (node == null) {
            return false;
        }
        if (node.clue.equals(clue)) {
            return true;
        }
        return clue.compareTo(node.clue) < 0
                ? findClueRecursive(node.left, clue)
                : findClueRecursive(node.right, clue);
    }

    // Count the total number of clues in the tree
    public int countClues() {
        int count = countCluesRecursive(root);
        System.out.println("Total number of clues: " + count);
        return count;
    }

    private int countCluesRecursive(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countCluesRecursive(node.left) + countCluesRecursive(node.right);
    }

    // Main method for testing
    public static void main(String[] args) {
        ClueTree clueTree = new ClueTree();

        // Insert clues into the tree
        clueTree.insert("Key");
        clueTree.insert("Map");
        clueTree.insert("Compass");
        clueTree.insert("Torch");
        clueTree.insert("Treasure");

        // Perform traversals
        System.out.println();
        clueTree.inOrderTraversal();
        clueTree.preOrderTraversal();
        clueTree.postOrderTraversal();

        // Find specific clues
        System.out.println();
        clueTree.findClue("Map");
        clueTree.findClue("Scroll");

        // Count total clues
        System.out.println();
        clueTree.countClues();
    }
}
