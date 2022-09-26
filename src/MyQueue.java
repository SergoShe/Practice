import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;

public class MyQueue {
    private final Stack<String> inputStack;
    private final Stack<String> outputStack;

    public MyQueue(String[] input) {
        inputStack = new Stack<>();
        addAllElements(inputStack, input);
        outputStack = new Stack<>();
    }

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public MyQueue(String input) {
        inputStack = new Stack<>();
        inputStack.push(input);
        outputStack = new Stack<>();
    }

    public boolean add(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        try {
            if (!outputStack.empty()) {
                swap(inputStack, outputStack);
            }
            inputStack.push(string);
            return true;
        } catch (StackOverflowError e) {
            throw new IllegalStateException();
        }
    }

    public boolean offer(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        try {
            if (!outputStack.empty()) {
                swap(inputStack, outputStack);
            }
            inputStack.push(string);
            return true;
        } catch (StackOverflowError e) {
            return false;
        }
    }

    public String peek() {
        if (!inputStack.empty()) {
            swap(outputStack, inputStack);
        }
        try {
            return outputStack.peek();
        } catch (EmptyStackException e) {
            return null;
        }
    }

    public String element() {
        if (!inputStack.empty()) {
            swap(outputStack, inputStack);
        }
        try {
            return outputStack.peek();
        } catch (EmptyStackException e) {
            throw new NoSuchElementException();
        }
    }

    public String poll() {
        if (!inputStack.empty()) {
            swap(outputStack, inputStack);
        }
        try {
            return outputStack.pop();
        } catch (EmptyStackException e) {
            return null;
        }
    }

    public String remove() {
        if (!inputStack.empty()) {
            swap(outputStack, inputStack);
        }
        try {
            return outputStack.pop();
        } catch (EmptyStackException e) {
            throw new NoSuchElementException();
        }
    }

    private void addAllElements(Stack<String> inputStack, String[] input) {
        for (String elem : input) {
            inputStack.push(elem);
        }
    }

    private void swap(Stack<String> input, Stack<String> output) {
        while (!output.isEmpty()) {
            input.push(output.pop());
        }
    }
}