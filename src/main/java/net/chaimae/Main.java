package net.chaimae;

import net.chaimae.composants.Boisson;
import net.chaimae.composants.Espresso;
import net.chaimae.composants.Sumatra;
import net.chaimae.decorateur.Caramel;
import net.chaimae.decorateur.Chocolat;

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


    }}