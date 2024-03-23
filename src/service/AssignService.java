package service;

import entity.Assign;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssignService {
    List<Assign> assigns = new ArrayList<>();
    public void showSavingAccountManagements() {
        savingAccountManagements.forEach(System.out::println);
    }

    public SavingAccoutManagementsService(CustomerService customerService, BankService bankService) {
        this.customerService = customerService;
        this.bankService = bankService;
    }

    public void creatSavingAccount() {
        System.out.println("co bao nhieu kh muon gui tiet kiem: ");
        int customerNumber = new Scanner(System.in).nextInt();

        for (int i = 0; i < customerNumber; i++) {
            System.out.println("nhap thong tin gui tiet kiem cho kh thu: " + (i + 1));
            Customer customer = inputCustomer();
            List<SavingAccount> savingAccounts = savingAccounts();
            SavingAccountManagement savingAccountManagement = new SavingAccountManagement(customer, savingAccounts);
        }
    }

    private Customer inputCustomer() {
        System.out.println("nhap ma kh:");
        Customer customer = null;
        int customerID;
        while (true) {
            customerID = new Scanner(System.in).nextInt();
            customer= customerService.findById(customerID);
            if (customer != null) {
                break;
            }
            System.out.println("ma kh ko ton tai, hay nhap lai");
        }

        return customer;
    }

    private List<SavingAccount> savingAccounts(){
        System.out.println("nhap so luong ngan hang gui tiet kiem:");
        int bankNumber = new Scanner(System.in).nextInt();
        List<SavingAccount> savingAccounts = new ArrayList<>();
        for (int j = 0; j < bankNumber; j++) {
            System.out.println("nhap thong tin cho so: " + (j + 1));
            System.out.println("nhap ma ngan hang muon gui:");
            Bank bank = null;
            int bankID;
            while (true) {
                bankID = new Scanner(System.in).nextInt();
                bank= bankService.findByID(bankID);
                if (bank != null) {
                    break;
                }
                System.out.println("ma bank ko ton tai, hay nhap lai");
            }

            System.out.println(" nhap so tien muon gui o ngan hang nay");
            double money = new Scanner(System.in).nextInt();
            SavingAccount savingAccount = new SavingAccount(bank, money);
            savingAccounts.add(savingAccount);
        }
        return savingAccounts;
    }
}
