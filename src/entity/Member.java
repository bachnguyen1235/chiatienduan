package entity;

import java.util.Scanner;

public class Member extends Human implements Action {
    private static int idAuto = 100;
    private int id;
    private double wage;





    public void inputInfor(){
        System.out.println("nhap ten:");
        super.setName(new Scanner(System.in).nextLine());
        System.out.println("nhap dia chi:");
        super.setAddress(new Scanner(System.in).nextLine());
        System.out.println("nhap sdt:");
        super.setSdt(new Scanner((System.in)).nextInt());
        System.out.println("nhap muc luong:");
        wage = new Scanner(System.in).nextDouble();

    }
    public void printInfor(){
        System.out.println("ten thanh vien la: "+super.getName());
        System.out.println("dia chi thanh vien: "+super.getAddress());
        System.out.println("Sdt thanh vien: "+super.getSdt());
        System.out.println("Muc luong thanh vien: "+wage);
    }

    @Override
    public int getId() {
        return id;
    }
}
