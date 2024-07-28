public class Test {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "Alice", 150.00),
                new Order(2, "Bob", 200.00),
                new Order(3, "Charlie", 50.00),
                new Order(4, "David", 100.00),
                new Order(5, "Eve", 250.00)
        };

//        System.out.println("Bubble Sort:");
//        BubbleSort.bubbleSort(orders);
//        for (Order order : orders) {
//            System.out.println(order);
//        }

        System.out.println("\nQuick Sort:");
        QuickSort.quickSort(orders, 0, orders.length - 1);
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
