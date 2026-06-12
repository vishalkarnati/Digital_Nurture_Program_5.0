package Week1.DesignPatternsAndPrinciples.DependencyInjectionExample;

public class CustomerService {

    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomer(int id) {
        System.out.println(repository.findCustomerById(id));
    }
}