public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertFirst(17);
        list.insertlast(99);
        list.Insert(101, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(4));
        list.display();

    }
}
