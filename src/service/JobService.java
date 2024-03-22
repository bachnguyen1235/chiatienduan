package service;

import entity.Job;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class JobService {
    List<Job>jobs = new ArrayList<>();
    public void inputJobs(){
        System.out.println("ban muon them moi bn bank:");
        int bankNumber  ;
        while (true){
            try{
                bankNumber = new Scanner(System.in).nextInt();
                if (bankNumber>0){
                    break;
                }
                throw new InputMismatchException();
            }catch (InputMismatchException e){
                System.out.println("vui long nhap so duong, vui long nhap lai");

            }
        }
        for (int i = 0; i < bankNumber; i++) {
            System.out.println("nhap thong tin cho bank thu " + (i + 1));
            Job job = new Job();
            job.inputInfor();
            jobs.add(job);
        }
    }
    public void printJobs(){
        for (Job job : jobs){
            job.printInfor();
        }
    }
}
