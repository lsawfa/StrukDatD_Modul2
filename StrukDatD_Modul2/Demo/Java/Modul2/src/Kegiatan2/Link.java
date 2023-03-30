package Kegiatan2;

public class Link {
    Node head;

    public void add(int data){
        if(head==null){
            head=new Node(data);
        }
        Node current_node = head;
        while (current_node.next!=null){
            current_node=current_node.next;
        }
        current_node.next=new Node(data);
    }

    public void display(){
        if(head==null){
            System.out.println("Linklist is empty");
            return;
        }
        Node current_node = head;
        while (current_node.next!=null){
            current_node=current_node.next;
            int data = current_node.data;
            System.out.print(data+" ");
        }
    }

    public void sortedValue(Runnable callback){
        Node current_node = head;
        while (current_node!=null){
            Node index = current_node.next;
            while (index!=null){
                if (current_node.data> index.data){
                    int temp = current_node.data;
                    current_node.data= index.data;
                    index.data=temp;
                }
                index=index.next;
            }
            current_node=current_node.next;
        }
        callback.run();
    }
}
