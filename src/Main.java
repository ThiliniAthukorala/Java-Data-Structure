public class Main {
    public static void main(String[] args) {
        Linked l=new Linked();
        l.insertH("Jack","Adams","0123456678");
        l.insertH("Harry","Smith","0981234567");
        l.insertH("Irene","Pear","0123456789");
        l.insertH("Tom","Adams","0981212345");
        l.insertH("Paul","Victor","0786712345");

        l.print();

        System.out.println("----------------------------------- 1");
        l.remove("Harry","Smith","0981234567");
        l.print();

         System.out.println("----------------------------------- 2");

        l.insertH("Joe","Hardy","012398768");
        l.print();

        System.out.println("----------------------------------- 3");
        l.New("Sally","Potter","0981234578","Irene","Pear");
        l.print();



    }
}
