public class Main {
    public static void main(String[] args) {
        Reverse list = new Reverse();
        list.add(5);
        list.add(2);
        list.add(0);
        list.add(11);
        list.add(-4);

        list.print();
        list.reverse();
        list.print();
    }
}