public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if (id == 101) {
            return "Ezhil";
        } else if (id == 102) {
            return "Arun";
        } else {
            return "Customer Not Found";
        }

    }
}