public class StackDemo17 {
    public static void main(String[] args) {
        Stack17 stack = new Stack17(10); // Menggunakan konstruktor dengan parameter size
        stack.push(8); // Menggunakan nilai langsung tanpa label
        stack.push(12); // Menggunakan nilai langsung tanpa label
        stack.push(18); // Menggunakan nilai langsung tanpa label
        stack.print();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.push(-5);
        stack.print();
    }
}
