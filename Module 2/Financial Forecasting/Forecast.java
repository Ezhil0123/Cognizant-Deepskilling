public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Operating Systems", "Galvin"),
                new Book(104, "Computer Networks", "Forouzan"),
                new Book(105, "Database Systems", "Korth")

        };

        // Linear Search
        System.out.println("LINEAR SEARCH\n");

        Book result1 = SearchOperations.linearSearch(books,
                "Operating Systems");

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Book Not Found.");

        // Sort before Binary Search
        SearchOperations.sortBooks(books);

        System.out.println("\nBINARY SEARCH\n");

        Book result2 = SearchOperations.binarySearch(books,
                "Operating Systems");

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Book Not Found.");
    }
}