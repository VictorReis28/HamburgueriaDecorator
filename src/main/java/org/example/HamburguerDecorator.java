package org.example;

public abstract class HamburguerDecorator implements Hamburguer {

    private Hamburguer hamburguer;

    public HamburguerDecorator(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    protected abstract float getPrecoAdicional();

    protected abstract String getNomeIngrediente();

    @Override
    public float getPreco() {
        return this.hamburguer.getPreco() + getPrecoAdicional();
    }

    @Override
    public String getIngredientes() {
        return this.hamburguer.getIngredientes() + ", " + getNomeIngrediente();
    }
}
