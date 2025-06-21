class StackBanao {
    int[] data;
    static final int size = 10;
    int ptr = -1;

    public StackBanao() {
        this(size);
    }

    public StackBanao(int sizeee) {
        this.data = new int[sizeee];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek empty stack");
        }
        return data[ptr];
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <= ptr; i++) {
            sb.append(data[i]);
            if (i < ptr)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}

public class customstack {
    public static void main(String[] args) throws Exception {
        StackBanao stack = new StackBanao();
        stack.push(1);
        stack.push(2);
        stack.pop();
        System.out.println(stack);
    }
}
