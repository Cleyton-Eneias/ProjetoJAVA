import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;


class Veiculo {
    private final String marca;
    private final String modelo;
    private final int ano;
    private final String cor;
    private final String numeroChassi;

    public Veiculo(String marca, String modelo, int ano, String cor, String numeroChassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.numeroChassi = numeroChassi;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

