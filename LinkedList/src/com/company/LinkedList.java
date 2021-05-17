package com.company;

public class LinkedList {
    private Node head;// ссылка на первый элемент списка(объект типа Node)

    //  метод add добавляет элемент в конец списка

    public void add (int v){
        if (head == null){
            // создаем первый элемент списка
            Node n = new Node();
            n.value = v;
            head = n;
            return;// досрочный выход из метода void
        }
        Node last =head;
        // доходим до последнего элемента в списке( у которого next !=null {}
        while (last.next != null) {
            last =last.next;
        }
        // создаем последний элемент в списке
        Node n = new Node();
        n.value = v;
        last.next = n;
    }

    public void print(){
        Node elem = head;
        while (elem != null) {
            System.out.println(elem.value);// выводим занчение текущего узла
            elem = elem.next;

        }
    }

    //метод удаляет элемент списка
    public void remove (int index) throws NumberException{
        Node r = head;
        Node prev =null;

        if (index == 0 && r != null) {
            head = r.next;
            return;
        }
        int i = 0;
        while (r != null){
            if (i == index) {
                prev.next = r.next;
                break;
            } else {
                prev = r;
                r = r.next;
                i++;
                if (index > i) {
                    throw new NumberException();
                }

            }

            }

        }


    // НАДО НАПИСАТЬ ЭКСЕПШН, при вводе индекса больше длинны списка
    public int get(int index) throws NumberException{
        Node el = head;
        int k = 0;
        while (el != null) {
            if (k == index) {
                return el.value;
            }

            el = el.next;
            k++;
            if (index > k){
                throw new NumberException();
            }
        }return el.value;
    }

}
