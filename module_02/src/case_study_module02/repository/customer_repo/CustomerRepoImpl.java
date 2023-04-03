package case_study_module02.repository.customer_repo;

import case_study_module02.models.Customer;
import case_study_module02.untils.ReadAndWriteFileCustomer;

import java.util.List;

public class CustomerRepoImpl implements CustomerRepo {
    static final String PATH_FILE_CUSTOMER="src\\case_study_module02\\data\\customer.csv";
   static List<Customer> list= ReadAndWriteFileCustomer.readerFileCustomer(PATH_FILE_CUSTOMER);

    @Override
    public List<Customer> displayCostomer() {
        return list;
    }

    @Override
    public void addCustomer(List<Customer> arrayList) {
        ReadAndWriteFileCustomer.writeFileCustomer(PATH_FILE_CUSTOMER,arrayList);
    }

    @Override
    public void editInformationCustomer(List<Customer> arrayList) {
        ReadAndWriteFileCustomer.writeFileCustomer(PATH_FILE_CUSTOMER,arrayList);

    }
}
