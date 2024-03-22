package entity;

import java.util.Scanner;

public class Job implements Action{
    private static int idAuto =100;
    private int id;
    private String name;
    private double reward;

    public Job() {
        this.id = idAuto++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    @Override
    public void inputInfor() {
        System.out.println("Nhap ten vi tri cong viec: ");
        name = new Scanner(System.in).nextLine();
        System.out.println("nhap muc thuong:");
        reward = new Scanner(System.in).nextDouble();
    }

    @Override
    public void printInfor() {
        System.out.println("ten vi tri la: "+name);
        System.out.println("muc thuong la: "+reward);
    }
}
