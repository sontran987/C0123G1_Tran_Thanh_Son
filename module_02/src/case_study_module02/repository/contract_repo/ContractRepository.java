package case_study_module02.repository.contract_repo;

import case_study_module02.models.Contract;

import java.util.Queue;

public interface ContractRepository {
    void createNewContract(Contract contract);
    Queue<Contract> displayListContracts();
    void editContracts(Queue<Contract> contract);
}
