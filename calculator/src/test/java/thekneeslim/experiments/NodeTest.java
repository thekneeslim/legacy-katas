package thekneeslim.experiments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NodeTest {

    @Test
    void shouldReturnTheComputedResultOfGivenValuesIfTheOperatorIsAddition() {
        Node node = new Node('+', new Node(9), new Node(9));
        assertEquals(18, node.compute());
    }

    @Test
    void shouldReturnTheComputedResultOfGivenValuesIfTheOperatorIsMinus() {
        Node node = new Node('-', new Node(9), new Node(7));
        assertEquals(2, node.compute());
    }

    @Test
    void shouldReturnTheComputedResultOfGivenValuesIfTheOperatorIsMultiplication() {
        Node node = new Node('*', new Node(9), new Node(9));
        assertEquals(81, node.compute());
    }

    @Test
    void shouldReturnTheComputedResultOfGivenValuesIfTheOperatorIsDivision() {
        Node node = new Node('/', new Node(18), new Node(9));
        assertEquals(2, node.compute());
    }

    @Test
    void shouldReturnTheComputedResultOfGivenNestedNodes() {
        Node node = new Node('+', new Node(2), new Node('*', new Node(3), new Node(5)));
        assertEquals(17, node.compute());
    }

    @Test
    void shouldThrowUnsupportedExceptionIfOperatorIsNotSupported() {
        assertThrows(UnsupportedOperationException.class, () -> {
            Node node = new Node('%', new Node(2), new Node(2));
            node.compute();
        });
    }

    @Test
    void shouldDisplayTheFullEquation() {
        Node node1 = new Node('+', new Node(9), new Node(9));
        assertEquals("9 + 9", node1.display());

        Node node2 = new Node('*', new Node(9), new Node(9));
        assertEquals("9 * 9", node2.display());

        Node node3 = new Node('+', new Node(2), new Node('*', new Node(3), new Node(5)));
        assertEquals("2 + 3 * 5", node3.display());
    }
}