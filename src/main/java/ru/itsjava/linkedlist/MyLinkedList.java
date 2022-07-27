package ru.itsjava.linkedlist;

public class MyLinkedList {
    private Node head;

    public int size() {
        int count = 0;
        if (head == null) {
            return count;
        } else {
            count = 1;
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                count++;
            }
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(Object o) {
        if (head == null) {
            return false;
        } else if (o.equals(head.getValue())) {
            return true;
        } else {
            Node curNode = head;
            while ((curNode = curNode.getNext()) != null) {
                if (o.equals(curNode.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
