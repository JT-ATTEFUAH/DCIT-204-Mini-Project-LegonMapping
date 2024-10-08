 

public class Node {
    private String name;

    public Node(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node){
            Node other = (Node) obj;
            return other.getName().equals(getName());
            }
        return false;
    }
    
    @Override
    public String toString() {
        return this.name;
    }    
}
