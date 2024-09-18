package edu.kis.vh.nursery.list;

class Node {

    public int value;
    public Node prev, next;

    public Node(int i) {
        value = i;
    }
    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

