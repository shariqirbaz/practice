package com.practice.datastructure;

public class LinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;

        Node (int data)
        {
            this.data = data;
        }
    }

    private static Node reverseList(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    private static void printList(Node head)
    {
        while(head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }

    }

    private static void addNumber(Node head, int temp)
    {
        while(head != null)
        {
            if ((head.data + temp) > 9)
            {
                String result = String.valueOf((head.data + temp));
                temp = result.charAt(0) - '0';
                head.data = result.charAt(1) - '0';
                if (head.next == null)
                {
                    Node newNode = new Node(temp);
                    head.next = newNode;
                    break;
                }
            }
            else
            {
                head.data = head.data + temp;
                break;
            }
            head = head.next;
        }

    }

    public static void main(String[] args)
    {
        LinkedList node = new LinkedList();
        node.head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(8);

        node.head.next = node2;
        node2.next = node3;
        node3.next = node4;

        node.head = reverseList(node.head);
        printList(node.head);

//		addNumber(node.head, 2);
//		node.head = reverseList(node.head);
//		printList(node.head);


    }
}
