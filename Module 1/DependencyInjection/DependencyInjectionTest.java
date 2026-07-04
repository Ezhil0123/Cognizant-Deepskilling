public class DependencyInjectionTest {

    public static void main(String[] args) {

        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        service.getCustomer(101);

        System.out.println();

        service.getCustomer(102);

        System.out.println();

        service.getCustomer(999);
    }
}