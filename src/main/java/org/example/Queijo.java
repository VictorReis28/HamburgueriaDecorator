package org.example;

public class Queijo extends HamburguerDecorator {

    public Queijo(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    protected float getPrecoAdicional() {
        return 2.0f;
    }

    @Override
    protected String getNomeIngrediente() {
        return "Queijo";
    }
}
