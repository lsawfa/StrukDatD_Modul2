package Kegiatan2;

public class Main {
    public static void main(String[] args) {
        Link list = new Link();

        list.add(9);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(3);

        System.out.print("Before : ");
        list.display();

        System.out.print("\nAfter : ");
        list.sortedValue(list::display);
    }
}
