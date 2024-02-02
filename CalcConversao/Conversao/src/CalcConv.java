import javax.swing.*; //gráfico
import java.awt.*; //gráfico
import java.awt.event.ActionEvent; //para eventos cliques ou coisas do tipo
import java.awt.event.ActionListener; //para ele ouvir, pegar valores

public class CalcConv extends JFrame {

    private JTextField valorTextField;
    private JComboBox<String> unidadeOrigemComboBox;
    private JComboBox<String> unidadeDestinoComboBox;
    private JLabel resultadoLabel;

    public CalcConv(){
        setTitle("Calculadora Conversao");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(4,2));

        JLabel valorLabel = new JLabel("Valor");
        valorTextField = new JTextField();

        JLabel unidOrigem = new JLabel("De: ");
        unidadeOrigemComboBox = new JComboBox<>(new String[]{"metros","km"});

        JLabel unidDestino = new JLabel("Para: ");
        unidadeDestinoComboBox = new JComboBox<>(new String[]{"metros","km"});

        JButton converterButton = new JButton("Converter");
        converterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                converter();
            }
        });

        resultadoLabel = new JLabel("Resultado");

        painel.add(valorLabel);
        painel.add(valorTextField);
        painel.add(unidOrigem);
        painel.add(unidadeOrigemComboBox);
        painel.add(unidDestino);
        painel.add(unidadeDestinoComboBox);
        painel.add(converterButton);
        painel.add(resultadoLabel);

        add(painel);
        setVisible(true);

    }
    
    private void converter () {
       

        try {
            double valor = Double.parseDouble(valorTextField.getText());
            String unidadeOrigem = (String) unidadeOrigemComboBox.getSelectedItem();
            String unidadeDestino = (String) unidadeDestinoComboBox.getSelectedItem();
            double resultado;

            if (unidadeOrigem.equals("metros") && unidadeDestino.equals("km")) {
                resultado = valor / 1000;
            } else if (unidadeOrigem.equals("km") && unidadeDestino.equals("metros")) {
                resultado = valor * 1000;
            } else {
                resultado = valor;
            }

            resultadoLabel.setText("Resultado: " + resultado + " " + unidadeDestino);
            
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,"Por favor, insira um valor número!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
      
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new CalcConv());}
}