import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pantallaNIF implements ActionListener {
    JFrame frame;
    JButton [] buttons;
    JTextField [] fields;

    public pantallaNIF(){
        frame = new JFrame("Calcul del NIF");
        buttons = new JButton[] {
                new JButton("Calcula NIF"),
                new JButton("Borra dades")
        };
        fields = new JTextField[] {
                new JTextField(),
                new JTextField()
        };
        buttons[0].addActionListener(this);
        buttons[1].addActionListener(this);
        frame.setContentPane(crearPanel());
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private JPanel crearPanel(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        JLabel [] labels = new JLabel[] {
                new JLabel("Nombre"),
                new JLabel("DNI"),
                new JLabel()
        };
        JPanel [] auxiliarPanels = new JPanel[] {
                new JPanel(),
                new JPanel(),
                new JPanel()
        };
        for (int i = 0; i < fields.length; i++) {
            auxiliarPanels[i].add(labels[i]);
            auxiliarPanels[i].add(fields[i]);
            mainPanel.add(auxiliarPanels[i]);
        }
        auxiliarPanels[2].add(buttons[0]);
        auxiliarPanels[2].add(buttons[1]);
        auxiliarPanels[2].add(labels[2]);
        mainPanel.add(auxiliarPanels[2]);
        return mainPanel;
    }

    public void run(){
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        switch (button.getText()){
            case "Calcula NIF":

                break;
            case "Borra Datos":
                fields[0].setText("");
                fields[0].setText("");
                break;
        }
    }

    public static void main(String[] args) {
        pantallaNIF p = new pantallaNIF();
        p.run();
    }

}
