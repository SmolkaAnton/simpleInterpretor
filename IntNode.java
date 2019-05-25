public class IntNode extends Node {
	int value;
	public IntNode(String label) {
		super("INT");
		value = Integer.parseInt(label);
	}
}
