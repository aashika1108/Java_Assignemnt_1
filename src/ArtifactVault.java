import java.util.Arrays;

public class ArtifactVault {
    private String[] artifacts;
    private int size;

    // Constructor
    public ArtifactVault(int capacity) {
        artifacts = new String[capacity];
        size = 0;
    }

    // Add an artifact
    public void addArtifact(String artifact) {
        if (size < artifacts.length) {
            artifacts[size++] = artifact;
            System.out.println("Added artifact: " + artifact);
        } else {
            System.out.println("Vault is full!");
        }
    }

    // Remove an artifact by name
    public void removeArtifact(String name) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i].equals(name)) {
                artifacts[i] = artifacts[--size];
                artifacts[size] = null;
                System.out.println("Removed artifact: " + name);
                return;
            }
        }
        System.out.println("Artifact not found!");
    }

    // Find an artifact using linear search
    public int findArtifactLinear(String name) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Find an artifact using binary search
    public int findArtifactBinary(String name) {
        Arrays.sort(artifacts, 0, size); // Ensure the array is sorted
        return Arrays.binarySearch(artifacts, 0, size, name);
    }

    // Display all artifacts
    public void displayArtifacts() {
        System.out.println("Artifacts in the vault:");
        for (int i = 0; i < size; i++) {
            System.out.println("- " + artifacts[i]);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        ArtifactVault vault = new ArtifactVault(5);

        // Adding artifacts
        vault.addArtifact("Sword of Truth");
        vault.addArtifact("Shield of Valor");
        vault.addArtifact("Crown of Wisdom");
        vault.addArtifact("Orb of Power");
        vault.addArtifact("Ring of Eternity");

        // Attempt to add an extra artifact
        vault.addArtifact("Extra Artifact");

        // Display all artifacts
        vault.displayArtifacts();

        // Find artifacts
        System.out.println("\nFinding artifacts:");
        System.out.println("Index of 'Shield of Valor' (Linear Search): " + vault.findArtifactLinear("Shield of Valor"));
        System.out.println("Index of 'Orb of Power' (Binary Search): " + vault.findArtifactBinary("Orb of Power"));

        // Remove an artifact
        System.out.println("\nRemoving artifacts:");
        vault.removeArtifact("Shield of Valor");
        vault.displayArtifacts();

        // Attempt to remove a non-existent artifact
        vault.removeArtifact("Nonexistent Artifact");

        // Display all artifacts after operations
        System.out.println("\nFinal state of the vault:");
        vault.displayArtifacts();
    }
}
