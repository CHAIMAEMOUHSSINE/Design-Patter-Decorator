package net.chaimae.decorateur;

import net.chaimae.composants.Boisson;

public class Noisette extends Decorateur{
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " à la Noisette";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.50;
    }
}
