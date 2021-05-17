package com.company;

public class Main {

    public static void main(String[] args) {
            LinkedList list = new LinkedList();
            list.add(12);
            list.add(15);
            list.add(-18);
            list.add(5);
            list.add(4);
            //list.print();
        try {
            list.remove(1);
        } catch (NumberException e) {
            System.out.println("Нет такого элемента в списке");
        }
        list.print();
        //try {
        //    System.out.println(list.get(5));
        //} catch (NumberException e) {
          //  System.out.println("Индекс не соответствует кол-ву элементов списка");
        //}


    }
    }

