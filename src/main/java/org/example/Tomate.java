package org.example;

public class Tomate extends HamburguerDecorator {

    public Tomate(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    protected float getPrecoAdicional() {
        return 1.5f;
    }

    @Override
    protected String getNomeIngrediente() {
        return "Tomate";
    }
}
