package view;

import entity.Member;
import service.JobService;
import service.MemberService;
import util.IOUtil;

public class MenuView {
    MemberService memberService = new MemberService();
    JobService jobService = new JobService();


    private void showMenu() {
        System.out.println("-------phan men quan li so tiet kiem--------");
        System.out.println("1. them moi member:");
        System.out.println("2. hien thi danh sach member dang co: ");
        System.out.println("3. them moi danh sach vi tri cong viec: ");
        System.out.println("4. hien thi danh sach ngan hang vi tri cong viec:");
        System.out.println("5. nhap danh sach phan cong cong viec");
        System.out.println("6. hien thi dang sach phan cong cong viec:");
        System.out.println("7. sap xep danh sach:");
        System.out.println("8. tinh tong tien thuong cua cac thanh vien:");
        System.out.println("9. exit");
    }

    private int chooseFeature() {
        System.out.println("xin moi chon chuc nang:");
        return IOUtil.inputIntNumber(1, 9, "chuc nang ko hop le, hay nhap lai");
    }

    public void menu() {
        while (true) {
            showMenu();
            int chooseFeature = chooseFeature();
            switch (chooseFeature) {
                case 1:
                    memberService.inputMembers();
                    break;
                case 2:
                    memberService.printMembers();
                    break;
                case 3:
                    jobService.inputJobs();
                    break;
                case 4:

                    jobService.printJobs();
                    break;
                case 5:

                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    return;
            }
        }
    }
}
