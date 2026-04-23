class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class demo{
    Node head;
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void cycledetect(){
       Node fast=head;
       Node slow=head;
       if(head==null){
        System.out.println("empty");
        return;
       }
       
       while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow){
            System.out.println("cycle detected");
            return;
        }
        
       }
       
     System.out.println("no cycle detected");
    }
    void traversee(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        demo cll=new demo();
        cll.insert(10);
        cll.insert(20);
        cll.insert(10);
        cll.insert(40);
        cll.insert(50);
        cll.traversee();
        cll.cycledetect();



    }
}