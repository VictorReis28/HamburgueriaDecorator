package org.example;

public class Cheddar extends HamburguerDecorator {

    public Cheddar(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    protected float getPrecoAdicional() {
        return 2.5f;
    }

    @Override
    protected String getNomeIngrediente() {
        return "Cheddar";
    }
}
