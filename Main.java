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
            textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel buttonPanel = new JPanel();

        JButton cadastrarButton = new JButton("Cadastrar Veículo");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarVeiculo();
            }
        });

        JButton visualizarButton = new JButton("Visualizar Veículo");
        visualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizarVeiculo();
            }
        });

        JButton sairButton = new JButton("Sair");
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonPanel.add(cadastrarButton);
        buttonPanel.add(visualizarButton);
        buttonPanel.add(sairButton);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private static void cadastrarVeiculo() {
        String marca = JOptionPane.showInputDialog(frame, "Marca:");
        String modelo = JOptionPane.showInputDialog(frame, "Modelo:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog(frame, "Ano:"));
        String cor = JOptionPane.showInputDialog(frame, "Cor:");
        String numeroChassi = JOptionPane.showInputDialog(frame, "Número de Chassi:");

        Veiculo veiculo = new Veiculo(marca, modelo, ano, cor, numeroChassi);
        veiculos.add(veiculo);

        textArea.append("Veículo cadastrado com sucesso!\n");
    }
