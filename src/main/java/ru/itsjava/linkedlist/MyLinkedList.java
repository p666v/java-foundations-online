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
        head = null;
    }

    public Object get(int index) {
        checkIndex(index);
        if (index == 0) {
            Object resValue = head.getValue();
            return resValue;
        } else {
            int count = 0;
            Node curNode = head;
            while ((curNode = curNode.getNext()) != null) {
                count++;
                if (count == index) {
                    break;
                }
            }
            Object resValue = curNode.getValue();
            return resValue;
        }

    }

    public Object set(int index, Object element) {
        checkIndex(index);
        if (index == 0) {
            head.setValue(element);
        } else {
            int count = 0;
            Node curNode = head;
            while ((curNode = curNode.getNext()) != null) {
                count++;
                if (count == index) {
                    break;
                }
            }
            curNode.setValue(element);
        }
        return element;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        checkIndex(index); // проверяем кооректность индекса
        //В этом блоке условия для одного либо первого элемента
        if (index == 0) {  // проверка, если индекс равен 0, т.е первый элемент в списке, то
            Object resValue = head.getValue(); // создаём переменную и присваеваем ей значение хэда
            if (head.getNext() == null) { // проверка, есть ли след.элемент после хэда. если эл-та нет, то
                head = null; // удаляем хэд
            } else {  // иначе
                head = head.getNext(); //хэду присваеваем значение следующего эл-та
            }
            return resValue; // возвращае значение удалённого элемента
        }
        // В этом блоке условия для последующих элементов
        Node curNode = head; // текущему эл-ту присвоим хэд
        Node prevNode = head; // предыдущему присвоим хэд
        int count = 0; // cоздаём счётчик
        while ((curNode = curNode.getNext()) != null) { // бежим до тех пор пока не упремся в налл
            count++; // увеличиваем счётчик
            if (count == index) { // если есть совпадение, заканчиваем бежать
                break;
            }
            prevNode = prevNode.getNext(); // присваиваем значение элемента стоящего перед удаляемым элементом
        }
        if (curNode == null) return null; // проверка на налл
        Object resValue = curNode.getValue(); // создаём переменную и присваиваем ей значение удаляемого эл-та

        if (curNode.getNext() == null) { // если удаляемый элемент в конце списка, то
            prevNode.setNext(null); // приваиваем ему налл
        } else { // иначе
            prevNode.setNext(curNode.getNext()); // перенаправляем ссылку предыдущего элемента на следующий после удаляемого
            curNode.setNext(null); // удаляемому элементу присваиваем налл
        }

        return resValue; // возвращае значение удалённого элемента
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < size())) {
            return true;
        }
        return false;
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
