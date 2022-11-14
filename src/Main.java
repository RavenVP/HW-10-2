public class Main {
    public static void main(String[] args) {
        Task1.printMap();

        Task3.addToMap3("s1", 1);
        Task3.addToMap3("s2", 2);
        Task3.addToMap3("s1", 2);
        Task3.addToMap3("s1", 3);
        System.out.println(Task3.map2);

        Task2_2.printLinkedMap4();
    }
}