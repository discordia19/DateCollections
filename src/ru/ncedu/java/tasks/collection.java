package ru.ncedu.java.tasks;
import java.util.*;

public class collection
{
    public static void main(String[] args) {
        Set newSet = new TreeSet();

        // i. Collection: set, list, queue || Map:
        /*
        Map: содержит пары ключ-значение
        Хэш таблицы:
        HashMap - c null, синхронизирован
        LinkedHashMap - порядок равен порядку добавления
        WeakHashMap
        Hashtable - без null, несинхронизирован

        Деревья:
        TreeMap - реализация на основе красно-черного дерева, упорядоченная

        ////

        Set - множество, неупорядоченное.
        hashSet
        LinkedHashSet
        TreeSet impl NavigableSet impl SortedSet - управление порядком

        List - упорядоченные коллекции.
        LinkedList - c null, двунаправленный список, fifo lifo
        ArrayList - c null, на основе массива, бысрое обращение по индексу
        Stack
        Vector


        Queue - FIFO:
        ArrayDeque - fifo + lifo, без null
        LinkedList
        PriorityQueue

         */

        newSet.add(4);
        newSet.add(1);
        newSet.add(3);
        newSet.add(2);
        newSet.add(1);
        //newSet.add(1.2);
        System.out.println(newSet);
        System.out.println(newSet.contains(3));
        System.out.println(newSet.size());
        System.out.println(newSet.remove(3));
        System.out.println(newSet.size());

        Set hash = new HashSet();
        hash.add(1);
        hash.add("set");
        hash.contains(2);
        System.out.println(hash);
        System.out.println();

    }
}
