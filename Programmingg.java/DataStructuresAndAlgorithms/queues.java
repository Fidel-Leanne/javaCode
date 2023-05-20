package DataStructuresAndAlgorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class queues {

    public static void main(String[] args) {

        // Ques uses FIFO

        Queue<String> queue = new LinkedList<String>();
        queue.offer("karen");
        queue.offer("chad");
        queue.offer("john");
        queue.offer("mary");

        System.out.println(queue.size());

        System.out.println("Enter name you want to search");
        Scanner random = new Scanner(System.in);

        System.out.println(queue.contains(random.nextLine()));
    }
}
