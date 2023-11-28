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
    
    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }
}
    public class Main {
        private static List<Veiculo> veiculos = new ArrayList<>();
        private static JFrame frame;
        private static JTextArea textArea;

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                createAndShowGUI();
            });
        }

        private static void createAndShowGUI() {
            frame = new JFrame("Cadastro de Veículos");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

