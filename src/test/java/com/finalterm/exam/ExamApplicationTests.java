package com.finalterm.exam;

import com.finalterm.exam.FactoryPattern.Circle;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static assertEquals;

@SpringBootTest
class ExamApplicationTests {



	/**
	 * This class contains unit tests for the Circle class.
	 */
    @Nested
    class CircleTest {

		/**
		 * Test the draw method of the Circle class.
		 * It verifies that the correct message is printed when draw is called.
		 */
		@Test
		public void testDraw() {
			// Arrange
			Circle circle = new Circle();
			ByteArrayOutputStream outContent = new ByteArrayOutputStream();
			System.setOut(new PrintStream(outContent));

			// Act
			circle.draw();

			// Assert
			assertEquals("Circle shape" + System.lineSeparator(), outContent.toString());

			// Reset System.out
			System.setOut(System.out);
		}
	}

}


