package demoATM;

import java.util.Scanner;

     class TestATM  {
    public static void main(String[] args) {
        User atm = new User("NUYEN VAN A",1200000);
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            atm.ChoiceMenu();
            choice = scanner.next();
            switch (choice) {
                case "A":
                    atm.CheckAmount();
                    break;
                case "D":
                    atm.Recharge();
                    break;
                case "W":
                    atm.Withdrawal();
                    break;
                case "H":
                    atm.ViewHistory();
                    break;
                case "X":
                    atm.getExit();
                    break;
                default:
                    System.out.println("Ban nhap sai chuc nang\n" +
                            "Bam nut theo menu de tiep tuc giao dich");
                    break;
            }
        }while (choice != "X");
    }
}
