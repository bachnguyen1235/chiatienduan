package entity;

public class Member extends Human {
    private static int idAuto = 100;
    private int id;
    private double wage;

    public Member(String name, String address, int sdt,  double wage) {
        super(name, address, sdt);
        this.id = idAuto++;
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
