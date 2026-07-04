public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Rahul", 4500),
                new Order(102, "Amit", 1200),
                new Order(103, "Priya", 8200),
                new Order(104, "Karan", 3000),
                new Order(105, "Sneha", 6800)

        };

        System.out.println("Original Orders\n");
        SortOperations.display(orders);

        // Bubble Sort
        SortOperations.bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort\n");
        SortOperations.display(orders);

        // New array for Quick Sort

        Order[] orders2 = {

                new Order(101, "Rahul", 4500),
                new Order(102, "Amit", 1200),
                new Order(103, "Priya", 8200),
                new Order(104, "Karan", 3000),
                new Order(105, "Sneha", 6800)

        };

        SortOperations.quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nAfter Quick Sort\n");
        SortOperations.display(orders2);
    }
}