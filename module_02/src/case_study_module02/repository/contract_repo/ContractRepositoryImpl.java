package case_study_module02.repository.contract_repo;

import case_study_module02.models.Contract;
import case_study_module02.untils.ReadAndWriteFlieContract;
import ss5_access_modifier_static_method_static_property.practices.StaticProperty;

import java.util.PriorityQueue;
import java.util.Queue;

public class ContractRepositoryImpl implements ContractRepository {
    static final String PATH_FILE_CONTRACT = "src\\case_study_module02\\data\\contract.csv";
    Queue<Contract> contracts = ReadAndWriteFlieContract.readerFileContract(PATH_FILE_CONTRACT);

    @Override
    public void createNewContract(Contract contract) {
        ReadAndWriteFlieContract.writeFileContract(PATH_FILE_CONTRACT, contract);
    }

    @Override
    public Queue<Contract> displayListContracts() {
        return contracts;
    }

    @Override
    public void editContracts(Queue<Contract> contract) {
        ReadAndWriteFlieContract.writeFileContractToList(PATH_FILE_CONTRACT, contracts);
    }
}
