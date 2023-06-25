class Printer {
    public <T> void printArray(T[] array) {
        for (T elements : array) {
            System.out.println(elements);
        }
    }
}

public class JavaGenerics {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        Printer printer = new Printer();
        printer.printArray(intArray);
        printer.printArray(stringArray);
    }
}
