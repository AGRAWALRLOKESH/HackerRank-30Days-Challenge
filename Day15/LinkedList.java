

public static  Node insert(Node head,int data) {
        //Complete this method
        Node current = head;
        Node newNode = new Node(data);
        if(current == null)
        {
            head = newNode;
        }
        else
        {
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }
