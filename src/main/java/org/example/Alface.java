package org.example;

public class Alface extends HamburguerDecorator {

    public Alface(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    protected float getPrecoAdicional() {
        return 1.0f;
    }

    @Override
    protected String getNomeIngrediente() {
        return "Alface";
    }
}
