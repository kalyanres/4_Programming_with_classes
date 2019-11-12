package by.epam.task424;

/*
 *      4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов. Вычисление
 * общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и
 * отрицательный балансы отдельно.
 *
 */
public class Main {

    public static void main(String[] args) {

        String[] customers = new String[10];
        customers[0] = new String("Lockheed Martin");
        customers[1] = new String("Boeing");
        customers[2] = new String("BAE Systems");
        customers[3] = new String("Raytheon");
        customers[4] = new String("Northrop Grumman");
        customers[5] = new String("General Dynamics");
        customers[6] = new String("EADS");
        customers[7] = new String("United Technologies");
        customers[8] = new String("Finmeccanica");
        customers[9] = new String("Thales");

        Account[] accounts = new Account[25];
        accounts[0] = new Account(customers[0], "3135 0000 0010 0000 0933", 5004733);
        accounts[1] = new Account(customers[1], "3135 0000 0010 0001 0902", 15035748);
        accounts[2] = new Account(customers[2], "3135 0000 1030 0001 0012", -507048);
        accounts[3] = new Account(customers[3], "3135 0000 0020 0101 3083", -748752);
        accounts[4] = new Account(customers[4], "3135 0000 3080 0133 1083", 7833252);
        accounts[5] = new Account(customers[5], "3135 0000 0133 7463 8333", -438429);
        accounts[6] = new Account(customers[6], "3135 0000 4763 4777 1122", 47000308);
        accounts[7] = new Account(customers[7], "3135 0000 4753 1053 8841", 8437327);
        accounts[8] = new Account(customers[8], "3135 0000 1053 5546 5547", 66677766);
        accounts[9] = new Account(customers[9], "3135 0000 5546 3382 3387", -88688);
        accounts[10] = new Account(customers[5], "3135 0000 3382 5546 2212", 55544212);
        accounts[11] = new Account(customers[1], "3135 0000 4421 5546 2212", 55533322);
        accounts[12] = new Account(customers[5], "3135 0000 5546 8778 2212", -55544);
        accounts[13] = new Account(customers[7], "3135 0000 5546 5532 5675", -773232);
        accounts[14] = new Account(customers[6], "3135 0000 5561 1111 3454", -100203);
        accounts[15] = new Account(customers[3], "3135 0000 9680 4068 2123", -3455643);
        accounts[16] = new Account(customers[8], "3135 0000 9932 3847 3859", -112232);
        accounts[17] = new Account(customers[1], "3135 0000 6643 3545 6641", -112232);
        accounts[18] = new Account(customers[2], "3135 0000 6924 7548 2458", 3834873);
        accounts[19] = new Account(customers[7], "3135 0000 1133 3183 5819", -323751);
        accounts[20] = new Account(customers[0], "3135 0000 6623 8293 8329", -112232);
        accounts[21] = new Account(customers[9], "3135 0000 6880 4939 4249", 1122323);
        accounts[22] = new Account(customers[0], "3135 0000 5892 2439 8572", 5667381);
        accounts[23] = new Account(customers[6], "3135 0000 6798 7215 8727", 65782292);
        accounts[24] = new Account(customers[8], "3135 0000 5378 2298 4729", -1126655);

        Bank bank = new Bank(accounts);
        BankView bankView = new BankView(bank);

        // вывод на экран
        bankView.showBank();
        // сортировка по имени клиентов
        System.out.println("Sort by name:");
        bank.sortCustomerNames();
        bankView.setBank(bank);
        bankView.showBank();

        // организовываем поиск счетов Lockheed Martin
        System.out.println("Accounts of 'Lockheed Martin'");
        Account[] accountLockMart = bank.searchName("Lockheed Martin");
        bankView.showAccounts(accountLockMart);

        // блокировка одного из счетов lockheed Martin
        System.out.println("Balance all accounts of 'Lockheed Martin'");
        System.out.println(bank.calcSomeBalance(accountLockMart));
        System.out.println("Block one account of 'Lockheed Martin'");
        accountLockMart[0].setBlockAccount();
        System.out.println("Balance all accounts after block one account of 'Lockheed Martin'");
        System.out.println(bank.calcSomeBalance(accountLockMart));

        // вычисление суммы всех счетов банка
        System.out.println("All money are in the bank");
        System.out.println(bank.calcBalance());
        // вычисление суммы всех отрицательных счетов банка
        System.out.println("All negative money are in the bank");
        System.out.println(bank.calcNegativeBalance());
        // вычисление суммы всех положительных счетов банка
        System.out.println("All positive money are in the bank");
        System.out.println(bank.calcPositiveBalance());
    }
}
