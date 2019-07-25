package com.aptech;

import java.util.*;

public class Customer {
    private String fullName, customerId;
    private Date dateOfBirth;
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private static Integer MAX_ACCOUNTS = 10;
    protected Boolean addBankAccount(BankAccount bankAccount){
        if(bankAccounts.size() >= 10){
            System.out.println("Cannot add more account");
            return false;
        }
        bankAccounts.add(bankAccount);
        Collections.sort(bankAccounts, (acc1, acc2)->{
            return (int)(acc1.getBalance() - acc2.getBalance());
        });
        return true;
    }

    public Customer(String fullName, String customerId, Date dateOfBirth) {
        this.fullName = fullName;
        this.customerId = customerId;
        this.dateOfBirth = dateOfBirth;
    }
    private Boolean checkWithdraw(Double amount) {
        for(BankAccount bankAccount: bankAccounts) {
            if(bankAccount instanceof CheckingAccount) {
                if(bankAccount.getBalance() - 100000.0 >= amount) {
                    return true;
                }else {
                    Double remains = amount - bankAccount.getBalance() + 100000.0;
                    for(BankAccount bankAccount1:bankAccounts) {
                        if(bankAccount1 instanceof SavingAccount) {
                            if(bankAccount1.getBalance() - 100000.0 >= remains) {
                                return true;
                            } else {
                                remains = remains - bankAccount1.getBalance() + 100000.0;
                            }
                        }
                    }
                }
                break;
            }
        }
        return false;
    }
    public Boolean withdraw(Double amount) {
        //withdraw CheckingAccount
        //withdraw SavingAccount
        if(!checkWithdraw(amount)) {
            System.out.println("Ko rut duoc");
            return false;
        }
        //Tien hanh rut
        System.out.println("Rut duoc");
        return true;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        if(bankAccounts == null) {
            bankAccounts = new ArrayList<>();//lazy
        }
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public String toString() {
        return "fullName: "+fullName+
                "\ncustomerId: "+customerId+
                "\ndateOfBirth: "+dateOfBirth+
                "\nbankAccounts: "+ this.getBankAccounts().toString();

    }
    //Input customer's info from your keyboard
    public static Customer input() {
        //Factory method
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter fullName:");
            String fullName = scanner.nextLine();
            System.out.println("Enter customerId: ");
            String customerId = scanner.nextLine();
            System.out.println("Enter DOB. Day: ");
            Integer day = scanner.nextInt();
            System.out.println("Enter DOB. Month: ");
            Integer month = scanner.nextInt();
            System.out.println("Enter DOB. Year: ");
            Integer year = scanner.nextInt();
            Customer newCustomer = new Customer(fullName, customerId,
                    new GregorianCalendar(year, month, day).getTime());
            return newCustomer;
        }catch (Exception e) {
            System.out.println("Cannot create customer object. Error:"+e);
            return null;
        }

    }
}
