package Lesson07.Array.PrimitiveDataTyper;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {

    // 1. Creating Arrays
    public int[] numbers;
    public String[] names;
    public char[] grades;

    public ArrayDemo() {
        numbers = new int[] {10, 20, 30, 40, 50};
        names = new String[] {"Alex", "Maria", "Jonas"};
        grades = new char[] {'A', 'B', 'C', 'A', 'B'};
    }

    // 2. Accessing elements
    public void accessElements() {
        System.out.println("First number: " + numbers[0]);
        System.out.println("First name: " + names[0]);
        System.out.println("First grade: " + grades[0]);
    }

    // 3. Enhanced for loop
    public void enhancedForLoop() {
        System.out.println("Numbers using enhanced for-loop:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // 4. Displaying Arrays
    public void displayArrays() {
        System.out.println("Numbers array: " + Arrays.toString(numbers));
        System.out.println("Names array: " + Arrays.toString(names));
        System.out.println("Grades array: " + Arrays.toString(grades));
    }

    // 5. Copying Arrays
    public void copyArray() {
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copy));
    }

    // 6. Array Length
    public void arrayLength() {
        System.out.println("Length of numbers array: " + numbers.length);
        System.out.println("Length of names array: " + names.length);
    }

    // 7. Array traversal (classic for-loop)
    public void traverseArray() {
        System.out.println("Traversing numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }

    // 8. Random Numbers
    public void randomNumbers() {
        Random random = new Random();
        int[] randomArray = new int[5];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100); // 0–99
        }

        System.out.println("Random numbers: " + Arrays.toString(randomArray));
    }

    // 9. Traverse and count
    public void traverseAndCount() {
        int countA = 0;

        for (char g : grades) {
            if (g == 'A') {
                countA++;
            }
        }

        System.out.println("Number of grade 'A': " + countA);
    }
}
