package case_study_module02.repository.employee_repo;

import case_study_module02.models.Employee;

import java.util.List;

public interface EmployeeRepo {
    List<Employee>displayEmploy();

    void addEmploy(List<Employee> arrayList);

    void editInformationEmploy(List<Employee> arrayList);
}
