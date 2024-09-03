package co.edu.uptc.models;

import java.util.*;

@SuppressWarnings("rawtypes")
public class SimpleListV2<T> implements List<T> {
    Node<T> header;
    Node<T> last;
    public int size = 0;
    private Node<T> lastget = null;

    public SimpleListV2() {
        header = null;
        last = null;
    }

    // TODO:  falta addionar mas de un elemento y que lo adiciona a la lista
    public void addv1(T value) {
        Node<T> node = new Node<T>();
        node.setInfo(value);
        node.setNext(null);
        header = node;
    }

    // @Override
    // // TODO: falta refactorizar
    // public boolean add(T value){
    //     Node newNode = new Node();
    //     newNode.setInfo(value);
    //     newNode.setNext(null);
    //     if (header== null) {
    //         header = newNode;
    //         last = header;
    //     } else {            
    //         last.setNext(newNode);
    //         last = newNode;
    //     }
    //     return true;
    //  }


    @Override
    public boolean add(T e) {
        Node<T> newNode = new Node<T>();
        newNode.setInfo(e);
        newNode.setNext(null);
        size = size + 1;
        if (header == null) {
            header = newNode;
            last = header;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        return true;
    }

    public void showList() {
        Node aux = header;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }

    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public T get(int index) {
        if (lastget != null && index >= size - 1) {
            return lastget.getInfo();
        }
        Node<T> aux = header;
        int conta = 0;
        while (aux.getNext() != null && conta <= index) {
            aux = aux.getNext();
            conta = conta + 1;
        }
        lastget = aux;
        return aux.getInfo();
    }

    // @Override
    // public T get(int index) {
    //   Node<T> aux = header;
    //   int conta=0;
    //   while (aux.getNext()!=null && conta <=index){      
    //      aux = aux.getNext();
    //      conta = conta +1;
    //   }
    //   return aux.getInfo();
    // }


    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public Object[] toArray(Object[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }


    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean containsAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> aux = header;
        for (int i = 0; i < index; i++) {
            aux = aux.getNext();
        }
        T oldValue = aux.getInfo();
        aux.setInfo(element);
        return oldValue;
    }

    @Override
    public void add(int index, Object element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public T remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }
    private void bubbleSort(Comparator<? super T> c) {
        if (header == null) return;
        boolean swapped;
        do {
            swapped = false;
            Node<T> current = header;
            while (current.getNext() != null) {
                if (c.compare(current.getInfo(), current.getNext().getInfo()) > 0) {
                    T temp = current.getInfo();
                    current.setInfo(current.getNext().getInfo());
                    current.getNext().setInfo(temp);
                    swapped = true;
                }
                current = current.getNext();
            }
        } while (swapped);
    }

    @Override
    public void sort(Comparator<? super T> c) {
        bubbleSort(c);
    }
}
