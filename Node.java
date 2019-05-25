import java.util.*;
public class Node {
	String label;
	LinkedList<Node> children;

	public Node(String label) {
		this.label = label;
	}

	public void addChild(Node n) {
		if(children == null) {
			children = new LinkedList<Node>();
		}
		children.add(n);
	}
}
