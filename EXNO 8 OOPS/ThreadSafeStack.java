import java.util.Stack;

public class ThreadSafeStack<T> {
    private Stack<T> stack = new Stack<>();

    public synchronized void push(T item) {
        stack.push(item);
    }

    public synchronized T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stack.pop();
    }

    public synchronized T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stack.peek();
    }

    public synchronized boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ThreadSafeStack<Integer> stack = new ThreadSafeStack<>();

        Thread pushThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                stack.push(i);
                System.out.println("Pushed: " + i);
            }
        });

        Thread popThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                int item = stack.pop();
                System.out.println("Popped: " + item);
            }
        });

        pushThread.start();
        popThread.start();
    }
}
