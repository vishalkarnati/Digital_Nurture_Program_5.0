package Week1.DesignPatternsAndPrinciples.DependencyInjectionExample;

public interface CustomerRepository {
    String findCustomerById(int id);
}