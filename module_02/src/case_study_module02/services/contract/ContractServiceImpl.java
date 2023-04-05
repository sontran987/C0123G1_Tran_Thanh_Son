package case_study_module02.services.contract;

import case_study_module02.models.Booking;
import case_study_module02.models.Contract;
import case_study_module02.repository.booking_repo.BookingRepoImpl;
import case_study_module02.repository.booking_repo.BookingRepository;
import case_study_module02.repository.contract_repo.ContractRepository;
import case_study_module02.repository.contract_repo.ContractRepositoryImpl;
import case_study_module02.services.booking.BookingService;
import case_study_module02.services.booking.BookingServiceImpl;
import case_study_module02.untils.ReadAndWriteFlieBooking;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    //    static String pathFile = "src/case_study_module02/data/booking.csv";
    static BookingRepository bookingRepository = new BookingRepoImpl();
    static ContractRepository contractRepository = new ContractRepositoryImpl();
    static Queue<Contract> contracts = contractRepository.displayListContracts();
    static Scanner scanner = new Scanner(System.in);
    //    static Set<Booking> bookings=ReadAndWriteFlieBooking.readFileBooking(pathFile);;
    static Set<Booking> bookingSet = bookingRepository.displayListBooking();
    static Queue<Booking> bookingQueue = new LinkedList<>();
    static List<Booking> bookingList = new ArrayList<>();

    static {
        bookingList.addAll(bookingSet);
        bookingQueue.addAll(bookingList);
    }

    @Override
//    int numberContract, int codeBooking, double advanceDepositAmount, double totalPaymentAmount, int codeCustomer
    public void createNewContract() {

        boolean flag;
        int numberContract, codeBooking = 0, codeCustomer = 0;
        double advanceDepositAmount, totalPaymentAmount;
        do {
            flag = true;
            System.out.print("Enter number contract: ");
            numberContract = Integer.parseInt(scanner.nextLine());
            for (Contract c : contracts) {
                if (c.getNumberContract() == numberContract) {
                    flag = false;
                }
            }
        } while (!flag);
        for (int i = 0; i < bookingQueue.size(); i++) {
            codeBooking = bookingQueue.peek().getCodeBooking();
            codeCustomer = bookingQueue.poll().getCodeCustomet();
            break;
        }
        System.out.print("Enter advance deposit amount: ");
        advanceDepositAmount = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter total payment amount: ");
        totalPaymentAmount = Double.parseDouble(scanner.nextLine());
        Contract contract = new Contract(numberContract, codeBooking, advanceDepositAmount, totalPaymentAmount, codeCustomer);
        contracts.add(contract);
        contractRepository.createNewContract(contract);
    }

    @Override
    public void displayListContracts() {
        for (Contract c : contracts) {
            System.out.println(c);
        }
    }

    @Override
    public void editContracts() {
        boolean flag;
        int numberContract, codeBooking = 0, codeCustomer = 0;
        double advanceDepositAmount, totalPaymentAmount;
        do {
            flag = true;
            System.out.print("Enter number contract edit: ");
            numberContract = Integer.parseInt(scanner.nextLine());
            for (Contract c : contracts) {
                if (c.getNumberContract() != numberContract) {
                    flag = false;
                }
            }
        } while (!flag);
        for (Contract c: contracts) {
            codeBooking = c.getCodeBooking();
            codeCustomer = c.getCodeCustomer();
            break;
        }
        System.out.print("Enter advance deposit amount: ");
        advanceDepositAmount = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter total payment amount: ");
        totalPaymentAmount = Double.parseDouble(scanner.nextLine());
        Contract contract = new Contract(numberContract, codeBooking, advanceDepositAmount, totalPaymentAmount, codeCustomer);
        contracts.remove();
        contractRepository.editContracts(contracts);
    }
}
