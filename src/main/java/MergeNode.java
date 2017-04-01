/**
 * Created by baranipek on 01/04/17.
 */
public class MergeNode {

    static Node merge(Node node1, Node node2) {

        Node temp;
        Node first;

        if (node1.data < node2.data) {
            temp = node1;
            first = node1;
            node1 = node1.next;
        } else {
            temp = node2;
            first = node2;
            node2 = node2.next;
        }


        while (node1 != null && node2 != null) {
            if (node1.data < node2.data) {
                temp.next = node1;
                temp = temp.next;
                node1 = node1.next;
            } else {
                temp.next = node2;
                temp = temp.next;
                node2 = node2.next;
            }
        }
        if (node1 != null) {
            temp.next = node1;
        } else if (node2 != null) {
            temp.next = node2;
        }

        return first;

    }


    static class Node {
        int data;
        Node next;

        Node(int input) {
            this.data = input;
            next = null;
        }

        @Override
        public String toString() {
            Node cur = this;
            String str = "";

            while (cur != null) {
                str += cur.data + "->";
                cur = cur.next;
            }

            return str;
        }
    }


}
