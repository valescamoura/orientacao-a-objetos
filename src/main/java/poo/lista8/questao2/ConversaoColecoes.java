package poo.lista8.questao2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ConversaoColecoes {
    public static <T> HashSet<T> toHashSet(Collection<T> collection){
        HashSet<T> hashSet = new HashSet<>(collection);
        return hashSet;
    }

    public static <T> PriorityQueue<T> toPriorityQueue(Collection<T> collection){
        PriorityQueue<T> priorityQueue = new PriorityQueue<>(collection);
        return priorityQueue;
    }

    public static <T> ArrayDeque<T> toArrayDeque(Collection<T> collection){
        ArrayDeque<T> arrayDeque = new ArrayDeque<>(collection);
        return arrayDeque;
    }

    public static <T> TreeSet<T> toTreeSet(Collection<T> collection){
        TreeSet<T> treeSet = new TreeSet<>(collection);
        return treeSet;
    }
    
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Ana");
        arrayList.add("Maria");
        arrayList.add("Bruna");
        arrayList.add("José");
        arrayList.add("João");
        arrayList.add("Pedro");
        arrayList.add("Ana");
        System.out.println("ArrayList: " + arrayList.toString());
        
        HashSet<String> hashSet = toHashSet(arrayList);
        System.out.println("HashSet: " + hashSet.toString());

        PriorityQueue<String> priorityQueue = toPriorityQueue(hashSet);
        System.out.println("PriorityQueue: " + priorityQueue.toString());

        ArrayDeque<String> arrayDeque = toArrayDeque(priorityQueue);
        System.out.println("ArrayDeque: " + arrayDeque.toString());

        TreeSet<String> treeSet = toTreeSet(arrayDeque);
        System.out.println("TreeSet: " + treeSet.toString());


        //Pergunta: Ainda que todos os Collections contenham as mesmas strings, você deve vê-los sendo exibidos 
        //em ordens diferentes em alguns deles. Por quê? 
        //Resposta: os Collections são exibidos em ordens distintas entre si porque
        //cada uma destas classes trata a ordem (qual elemento vem primeiro e assim por diante) e critérios (um elemento
        //pode se repetir na estrututa ou não pode etc) de inserção dos elementos na estrutura de maneira distinta.
    }
}
