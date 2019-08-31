package thekneeslim.experiments;

public class Node {

    private char operator;
    private Integer value;
    private Node left;
    private Node right;

    public Node(char operator, Node left, Node right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
    }

    public int compute() {
        switch(operator){
            case '+':
                return left.getValue() + right.getValue();
            case '-':
                return left.getValue() - right.getValue();
            case '*':
                return left.getValue() * right.getValue();
            case '/':
                return left.getValue() / right.getValue();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int getValue() {
        return value == null ? compute() : value;
    }

    public String display() {
        return value == null ? String.format("%s %s %s", left.display(), operator, right.display()) : String.valueOf(value);
    }
}
