package ru.stqa.pft.sandbox;

public class Equality {
    public static void main(String[] args){
        String s1 = "firefox";
        String s2 = s1; // новый объект не создается, появлдяется ссылка на объект
        String s3 = new String(s1); // создается новый объект, содержащий

        System.out.println(s1==s2); // сравниваются две ссылки
        System.out.println(s1.equals(s2)); // сравниваются перемнные логически, содержимое объектов

        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}
