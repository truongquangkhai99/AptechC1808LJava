package com.aptech;

import java.util.GregorianCalendar;

public class BankEmployee {
    public void supportCustomer() {
        Customer mrHoang = new Customer(
                "Nguyen Duc Hoang",
                "AB124568",
                new GregorianCalendar(1993,10,29).getTime()
        );
        CheckingAccount checkingAccount1 = new CheckingAccount(
                "CA01221",
                12000000.0,
                mrHoang
        );
        SavingAccount savingAccount1 = new SavingAccount(
                "SA1254",
                20000000.0,
                mrHoang,
                1.2f/100.0f
        );
        SavingAccount savingAccount2 = new SavingAccount(
                "SA5555",
                30000000.0,
                mrHoang,
                1.3f/100.0f
        );
        mrHoang.addBankAccount(checkingAccount1);
        mrHoang.addBankAccount(savingAccount1);
        mrHoang.addBankAccount(savingAccount2);
        mrHoang.withdraw(50000000.0);
    }
}
