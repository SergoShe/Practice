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

    public void push(String string) {
        if (!outputStack.isEmpty()) {
            swap(inputStack, outputStack);
        }
        inputStack.push(string);
    }

    public String peek() {
        if (!inputStack.isEmpty()) {
            swap(outputStack,inputStack);
        }
        return outputStack.peek();
    }

    public String poll() {
        if (!inputStack.isEmpty()) {
            swap(outputStack,inputStack);
        }
        return outputStack.pop();
    }
}