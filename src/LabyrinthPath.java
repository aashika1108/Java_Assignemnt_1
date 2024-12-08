public class LabyrinthPath {
    // Node class to represent each location in the path
    private static class Node {
        String location;
        Node next;

        Node(String location) {
            this.location = location;
            this.next = null;
        }
    }

    private Node head; // Start of the linked list

    // Add a new location to the path
    public void addLocation(String location) {
        Node newNode = new Node(location);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Added location: " + location);
    }

    // Remove the last visited location
    public void removeLastLocation() {
        if (head == null) {
            System.out.println("No locations to remove!");
            return;
        }

        if (head.next == null) {
            System.out.println("Removed location: " + head.location);
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Removed location: " + temp.next.location);
        temp.next = null;
    }

    // Check if the path contains a loop (trap)
    public boolean hasLoop() {
        if (head == null) return false;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    // Print the entire path
    public void printPath() {
        if (head == null) {
            System.out.println("Path is empty!");
            return;
        }

        System.out.println("Path:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.location + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    // Main method for testing
    public static void main(String[] args) {
        LabyrinthPath path = new LabyrinthPath();

        // Add locations
        path.addLocation("Entrance");
        path.addLocation("Hall of Mirrors");
        path.addLocation("Chamber of Secrets");
        path.addLocation("Treasure Room");

        // Print the path
        path.printPath();

        // Remove the last location
        System.out.println("\nRemoving the last visited location:");
        path.removeLastLocation();
        path.printPath();

        // Check for loops
        System.out.println("\nChecking for loops:");
        System.out.println("Does the path have a loop? " + (path.hasLoop() ? "Yes" : "No"));

        // Create a loop for testing
        System.out.println("\nCreating a loop for testing...");
        path.head.next.next.next = path.head; // Introduce a loop
        System.out.println("Does the path have a loop? " + (path.hasLoop() ? "Yes" : "No"));
    }
}
