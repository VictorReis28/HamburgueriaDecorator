package org.example;

public class Bacon extends HamburguerDecorator {

    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    protected float getPrecoAdicional() {
        return 3.0f;
    }

    @Override
    protected String getNomeIngrediente() {
        return "Bacon";
    }
}
