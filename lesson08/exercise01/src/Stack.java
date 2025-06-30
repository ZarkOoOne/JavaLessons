class Stack {
    private final int SIZE = 10;
    private int[] array;
    private int top;

    Stack(){
        array = new int[SIZE];
        top = -1;
    }

    public void push(int val){
        if (top<SIZE-1) {
            top++;
            array[top] = val;
        }
        else {
            System.out.println("Stack is full!");
        }
    }

    public int pop() {
        if (top>=0) {
            top--;
            return array[top+1];
        }
        else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public boolean empty(){
        if (top == -1)
            return true;
        else
            return false;
    }
}
