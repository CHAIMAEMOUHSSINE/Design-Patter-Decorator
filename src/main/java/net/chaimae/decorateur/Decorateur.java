package net.chaimae.decorateur;

import net.chaimae.composants.Boisson;

public abstract class Decorateur extends Boisson {

    protected Boisson boisson;

    public Decorateur(Boisson boisson) {
        this.boisson = boisson;
    }
}
