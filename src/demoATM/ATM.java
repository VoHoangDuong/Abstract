package demoATM;

public class ATM {
    private String name = "NGUYEN VAN A";
    private double amount = 1200000;

    public ATM(String name){
    this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ATM(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
    public void ChoiceMenu(){
        System.out.println("Ngan hang ABC kinh chao Quy khach " + this.getName());
        System.out.println("Menu: ");
        System.out.println("1. Nhan phim A de kiem tra tai khoan");
        System.out.println("2. Nhan phim D de nap tien");
        System.out.println("3. Nhan phim W de rut tien");
        System.out.println("4. Nhan phim H de xem lich su 3 lan");
        System.out.println("5. Nhan phim X de thoat");
    }
}
