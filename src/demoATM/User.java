package demoATM;

import java.util.ArrayList;
import java.util.Scanner;

public class User extends ATM implements ChoiceMenu {

    ArrayList<String>history = new ArrayList<String >();
    public User(String name) {
        super(name);
    }

    public User(String name, double amount) {
        super(name, amount);
    }

    @Override
    public void CheckAmount() {
        System.out.println("So du tai khoan khach hang la: " + getAmount());
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
    }

    @Override
    public void Recharge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giao dich Nap tien");
        System.out.println("Vui long nhap so tien:");
        double sotien = scanner.nextDouble();
        history.add("1. Nap tien: " + sotien);
        System.out.println("Giao dich thanh cong. Ban vua nap " + sotien + " thanh cong");
        setAmount(getAmount()+sotien);
        System.out.println("So du tai khoan khach hang la: " + getAmount() + "VND");
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
    }

    @Override
    public void Withdrawal() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Giao dich Rut tien:");
        System.out.println("Vui long nhap so tien:");
        double sotienrut = scanner.nextDouble();
        if (sotienrut < getAmount()){
            System.out.println("Giao dich thanh cong. Ban vua rut : " + sotienrut + " thanh cong");
            System.out.println("So du tai khoan khach hang la: " + (getAmount()-sotienrut) + " VND");
            System.out.println("Bam nut theo menu de tiep tuc giao dich");
            history.add("2. Rut tien: " + sotienrut);
        }else {
            System.out.println("Giao dich khong thanh cong.");
            System.out.println("So du tai khoan khach hang la:" + getAmount() + " VND");
            System.out.println("Ban khong the rut so tien hon so du tai khoan\n");
        }
    }

    @Override
    public void ViewHistory() {
        System.out.println("Lich su giao dich:");
        for (int i = 0; i < history.size(); i++){
            System.out.println(history.get(i));
        }

    }

    @Override
    public void getExit() {
        System.out.println("Cam on ban da su dung dich vu ATM");
        System.exit(0);
    }
}
