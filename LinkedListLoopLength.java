package com.practice.datastructure;

public class LinkedListLoopLength
{
    Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    int getLoopLength(Node head)
    {
        Node first = head;
        Node last = head;

        while(first != null && last != null && last.next != null)
        {
            first = first.next;
            last = last.next.next;

            if(first == last)
            {
                return getCount(first, last);
            }
        }
        return -1;
    }

    int getCount(Node first, Node last)
    {
        int count = 0;
        while(first != null && last != null && last.next != null)
        {
            first = first.next;
            last = last.next.next;

            if(first == last)
            {
                count++;
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String... args)
    {
        LinkedListLoopLength linkedListLoopLength = new LinkedListLoopLength();

        linkedListLoopLength.head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        linkedListLoopLength.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node6;

        int countOfNodesInLoop = linkedListLoopLength.getLoopLength(linkedListLoopLength.head);

        System.out.println(countOfNodesInLoop);
    }
}
