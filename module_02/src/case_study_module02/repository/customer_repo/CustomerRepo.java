package case_study_module02.repository.customer_repo;

import case_study_module02.models.Customer;
import case_study_module02.models.Employee;

import java.util.List;

public interface CustomerRepo {
    List<Customer> displayCostomer();

    void addCustomer(List<Customer> arrayList);

    void editInformationCustomer(List<Customer> arrayList);
}
