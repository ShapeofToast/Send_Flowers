package cn.com.java.experiment;

import cn.com.java.experiment.exception.RoseException;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try{
            System.out.print("你想送女朋友多少朵玫瑰花(数字):");
            int num = console.nextInt();
            new Rose().giveRose(num);
            //System.out.println("Total:"+Rose.getTotal());
        }catch(RoseException roseExceptione) {
            System.err.println(roseExceptione.getMessage());
        }catch(Exception exception) {
            System.err.println(exception.getMessage());
        }finally {
            System.out.println("无论如何，我都是爱你的。");
        }
    }
}
