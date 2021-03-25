package model.cidade;

import java.util.List;

import model.itens.Item;
import model.mercado.Mercado;
import model.monstro.Monstro;

public class Cidade {
    private String name;
    private Mercado mercado;
    private List<Npc> npcs;

    private List<Item> itens;
    private List<Monstro> monstros;
    private List<Aventura> aventuras;
}
