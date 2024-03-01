public class Linked {
   private Node head;
   private   Node tail;

    public Linked() {
        this.head =null;
        this.tail =null;
    }
    public void insertT(String last,String first,String no){
        Node node=new Node(last,first,no);

        if (this.head==null){
           head=node;
           tail=node;
        }else {
            tail.next=node;
            tail=node;
        }
    }

    public void insertH(String last,String first,String no){
        Node node=new Node(last,first,no);

        if (this.head==null) {
            head = node;
            tail = node;
        }else {
            node.next=head;
            head=node;
        }

    }
    public boolean exist(String last,String first,String no){
        Node current=this.head;

        while (current!=null){
            if (current.Lastname==last && current.Firstname==first && current.ContactNo==no){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public void remove(String last,String first,String no){
        Node temp=this.head;

        while (temp!= null){
            if (temp.next.Lastname==last && temp.next.Firstname==first && temp.next.ContactNo==no){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }

    public void New(String NLast,String NFirst,String NNo,String PLast,String PFirst){
        Node temp=this.head;

        while (temp!=null){
            if (temp.next.Lastname==PLast && temp.next.Firstname==PFirst){
                Node node2=new Node(NLast,NFirst,NNo);

                node2.next=temp.next;
                temp.next=node2;
                return;
            }
            temp=temp.next;
        }
    }

    public void print(){
        Node temp=this.head;

        while (temp!=null){
            System.out.println(temp.Lastname+"\n"+temp.Firstname+"\n"+temp.ContactNo);
            temp=temp.next;
            System.out.println( );
        }
    }

}
