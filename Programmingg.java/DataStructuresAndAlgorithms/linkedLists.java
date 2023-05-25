package DataStructuresAndAlgorithms;

import java.net.SocketTimeoutException;
import java.util.LinkedList;

public class linkedLists {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.push("F");

        linkedList.add(0, "#");
        linkedList.remove("#");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        System.out.println(linkedList);

    }

}
