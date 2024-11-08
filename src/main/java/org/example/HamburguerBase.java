package org.example;

public class HamburguerBase implements Hamburguer {

    private float preco;

    public HamburguerBase(float preco) {
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getIngredientes() {
        return "Hambúrguer";
    }
}