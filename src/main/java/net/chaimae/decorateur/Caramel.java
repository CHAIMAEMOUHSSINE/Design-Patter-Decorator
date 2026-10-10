package net.chaimae.decorateur;

import net.chaimae.composants.Boisson;


public class Caramel extends Decorateur {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Caramel";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.50;
    }
}
