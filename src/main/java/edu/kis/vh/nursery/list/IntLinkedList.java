package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int PUSH_RETURN = -1;
    public static final int POP_RETURN = -1;
    Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return PUSH_RETURN;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return POP_RETURN;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
