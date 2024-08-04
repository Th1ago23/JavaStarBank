package Models;


public class CurrentAccount extends StarBank{
    private boolean lifeSecurity;
    private int points;

    public CurrentAccount(int id, int agency, String name, double balance, boolean lifeSecurity, int points) {
        super(id, agency, name, balance);
        this.lifeSecurity = lifeSecurity;
        this.points = 0;
    }


    public void buyInsurance(boolean lifeSecurity){
        this.lifeSecurity = lifeSecurity;
        points += 15;
    }

    @Override
    public double deposit(double value) {
        value = (value * 0.15) + value;
        points += 15;
        return super.deposit(value);
    }
    

}
