package service;

import entity.Member;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MemberService {
    List<Member>members = new ArrayList<>();
    public void inputMembers(){
        System.out.println("ban muon them moi bn member:");
        int customerNumber;
        while (true){
            try{
                customerNumber = new Scanner(System.in).nextInt();
                if (customerNumber>0){
                    break;
                }
                throw new InputMismatchException();
            }catch (InputMismatchException e){
                System.out.println("so luong kh la 1 so nguyen duong, vui long nhap lai");

            }
        }
        for (int i = 0; i < customerNumber; i++) {
            System.out.println("nhap thong tin cho member thu " + (i + 1));
            Member member = new Member();
            member.inputInfor();
            members.add(member);
        }
    }
    public void printMembers(){
        for (Member member : members) {
            member.printInfor();
        }
    }
}
