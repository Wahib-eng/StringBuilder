package com.withWahib;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("أدخل النص 1 : ");
        String text1=in.nextLine();
        System.out.println("أدخل النص 2 : ");
        String text2=in.nextLine();
        StringBuilder sb=new StringBuilder(text1);// تعريف كلاس
        sb.append(text2);//دمج نصين
        System.out.println(sb);
        sb.insert(4, "من ");//اضافة نص من مكان محدد
        System.out.println(sb);
        sb.delete(1,5);//حذف جزء من النص من الى
        System.out.println(sb);
        sb.deleteCharAt(5);//حذف حرف من النص
        System.out.println(sb);
        sb.replace(1,4,"هو");//تغيير النص من الى بنص
        System.out.println(sb);
        sb.setCharAt(4, 'ن');//تغيير الحرف في المدخل رقم
        System.out.println(sb);
        sb.reverse();// قلب النص
        System.out.println(sb);

    }
}