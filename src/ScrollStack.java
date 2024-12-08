import java.util.Stack;

public class ScrollStack {
    private Stack<String> stack;

    // Constructor
    public ScrollStack() {
        stack = new Stack<>();
    }

    // Push a scroll onto the stack
    public void pushScroll(String scroll) {
        stack.push(scroll);
        System.out.println("Added scroll: " + scroll);
    }

    // Pop the top scroll off the stack
    public String popScroll() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        String removedScroll = stack.pop();
        System.out.println("Removed scroll: " + removedScroll);
        return removedScroll;
    }

    // Peek at the top scroll without removing it
    public String peekScroll() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        System.out.println("Top scroll: " + stack.peek());
        return stack.peek();
    }

    // Check if a specific scroll exists in the stack
    public boolean containsScroll(String title) {
        boolean exists = stack.contains(title);
        System.out.println("Does the stack contain \"" + title + "\"? " + (exists ? "Yes" : "No"));
        return exists;
    }

    // Main method for testing
    public static void main(String[] args) {
        ScrollStack scrollStack = new ScrollStack();

        // Push scrolls onto the stack
        scrollStack.pushScroll("Scroll of Wisdom");
        scrollStack.pushScroll("Scroll of Power");
        scrollStack.pushScroll("Scroll of Secrets");

        // Peek at the top scroll
        System.out.println("\nPeeking at the top scroll:");
        scrollStack.peekScroll();

        // Check if a scroll exists
        System.out.println("\nChecking for scrolls:");
        scrollStack.containsScroll("Scroll of Power");
        scrollStack.containsScroll("Scroll of Time");

        // Pop a scroll from the stack
        System.out.println("\nPopping scrolls:");
        scrollStack.popScroll();
        scrollStack.popScroll();

        // Check the stack after popping
        System.out.println("\nPeeking after popping:");
        scrollStack.peekScroll();

        // Pop all scrolls to empty the stack
        System.out.println("\nPopping the remaining scroll:");
        scrollStack.popScroll();
        scrollStack.popScroll(); // Attempt to pop from an empty stack
    }
}
