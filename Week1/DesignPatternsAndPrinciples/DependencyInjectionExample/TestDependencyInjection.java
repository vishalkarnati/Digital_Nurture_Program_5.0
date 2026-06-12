package Week1.DesignPatternsAndPrinciples.DependencyInjectionExample;

public class TestDependencyInjection {
    public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repository);

        service.getCustomer(101);
    }
}
