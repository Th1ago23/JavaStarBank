package Models;

public class StarBank {
    private int id;
    private int agency;
    private String name;
    private double balance;

    public StarBank(int id, int agency, String name, double balance) {
        this.id = id;
        this.agency = agency;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getAgency() {
        return agency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void draw(double value) {
        if (balance >= value){
            balance -= value;
            System.out.println("Valor sacado. Saldo atual: " + balance);

        }else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public double deposit(double value){
        return balance + value;
    }

    public void payBill(double value){
        balance -= value;
        System.out.println("Boleto pago, seu saldo atual é: " + balance);
    }
}
