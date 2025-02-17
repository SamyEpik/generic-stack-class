public class Stack<T> {
    private T[] stack;
    private int capacity;
    private int top;

    public Stack() {
        this(10);
    }

    public Stack(int capacity) {
        this.capacity = capacity;
        this.top = 0;
        this.stack = (T[]) new Object[capacity];
    }

    public void push(T item) {
        if (top >= capacity) throw new StackFullException("Stack is full!");
        stack[top++] = item;
    }

    public T pop() {
        if (top <= 0) throw new StackEmptyException("Stack is Empty!");
        T value = stack[--top];
        stack[top] = null;
        return value;
    }

    public T peek() {
        if (top <= 0) throw new StackEmptyException("Stack is Empty!");
        return stack[top - 1];
    }

    public String list() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < top; i++) {
            sb.append(stack[i]);
            if (i < top - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
