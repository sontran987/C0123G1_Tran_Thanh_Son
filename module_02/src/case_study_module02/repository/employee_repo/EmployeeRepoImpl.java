package case_study_module02.repository.employee_repo;

import case_study_module02.models.Employee;
import case_study_module02.untils.ReadAndWriteFileEmployee;

import java.util.List;

public class EmployeeRepoImpl implements EmployeeRepo {
    static final String PATH_FILE_EMPLOYEE = "src\\case_study_module02\\data\\employee.csv";
    static List<Employee> employeeList = ReadAndWriteFileEmployee.readedFileEmployee(PATH_FILE_EMPLOYEE);

    @Override
    public List<Employee> displayEmploy() {
        return employeeList;
    }

    @Override
    public void addEmploy(List<Employee> arrayList) {
        ReadAndWriteFileEmployee.writeFileEmployee(PATH_FILE_EMPLOYEE, arrayList);
    }

    @Override
    public void editInformationEmploy(List<Employee> arrayList) {
        ReadAndWriteFileEmployee.writeFileEmployee(PATH_FILE_EMPLOYEE,arrayList);
    }
}
