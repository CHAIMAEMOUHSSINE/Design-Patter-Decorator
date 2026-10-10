package net.chaimae;

import net.chaimae.composants.Boisson;
import net.chaimae.composants.Espresso;
import net.chaimae.composants.Sumatra;
import net.chaimae.decorateur.Caramel;
import net.chaimae.decorateur.Chocolat;
import net.chaimae.decorateur.Noisette;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson=new Sumatra();
        System.out.println(boisson.getDescription() +
                " $" + boisson.cout());
        boisson= new Chocolat(boisson);
        System.out.println(boisson.getDescription() +
                " $" + boisson.cout());
        boisson =new Caramel(boisson);
        System.out.println(boisson.getDescription() +
                " $" + boisson.cout());
        Boisson b;
        b=new Chocolat(new Caramel(new Chocolat(new Caramel(new Noisette(new Sumatra())))));
        System.out.println(b.getDescription() +
                " $" + b.cout());


    }}
