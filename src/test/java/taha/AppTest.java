package taha;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(5, 3));
        assertEquals(-2, calculator.add(-5, 3));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-8, calculator.subtract(5, 13));
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-15, calculator.multiply(5, -3));
        assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 5));
        try {
            calculator.divide(5, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }

    // Integration Test
    @Test
    public void testIntegration() {
        // Placeholder for integration test
        // Perform integration testing between different components or modules
    }

    // Performance Test
    @Test
    public void testPerformance() {
        // Placeholder for performance test
        // Evaluate the performance characteristics of the Calculator class
    }

    // Security Test
    @Test
    public void testSecurity() {
        // Placeholder for security test
        // Assess the security posture of the Calculator class
    }
}
