package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main (String[] args){
        String[] langs = {"Java", "C#", "Python", "PHP"};

        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");

        List<String> langs2 = Arrays.asList("Java", "C#", "Python", "PHP");

        for (int i=0; i<langs.length; i++){
            System.out.println("Я хочу выучить "+langs[i]);
        }

        for (String l : languages){
            System.out.println("Я хочу выучить "+l);
        }
    }
}
