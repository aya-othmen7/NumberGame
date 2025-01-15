package geminiSol;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class InterfaceGraphiqueMoyenne {
		  public static void main(String[] args) {
		    JFrame frame = new JFrame("Resultat scolaire");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(400, 150);
		    frame.setLocationRelativeTo(null);

		    JPanel panel = new JPanel();
		    JLabel label = new JLabel("Entrez la moyenne : ");
		    JTextField textField = new JTextField(10);
		    JButton button = new JButton("Calculer");
		    JLabel resultLabel = new JLabel("");

		    panel.add(label);
		    panel.add(textField);
		    panel.add(button);
		    panel.add(resultLabel);

		    frame.getContentPane().add(panel);
		    frame.setVisible(true);

		    button.addActionListener(new ActionListener() {
		      @Override
		      public void actionPerformed(ActionEvent e) {
		        try {
		          double score = Double.parseDouble(textField.getText());
		          String resultat = calculateResult(score);
		          resultLabel.setText(resultat);
		        } catch (NumberFormatException exception) {
		          resultLabel.setText("Erreur : Veuillez entrer un nombre");
		        }
		      }
		    });
		  }

		  private static String calculateResult(double score) {
		    if (score < 0 || score > 20) {
		      return "Insérez une moyenne entre 0 et 20";
		    } else if (score < 10) {
		      return "RATTRAPAGE";
		    } else {
		      return "ADMIS";
		    }
		  }
		

    private static String calculerResultat(double moyenne) {
        if (moyenne < 0 || moyenne > 20) {
            return "Insérez une moyenne entre 0 et 20";
        } else if (moyenne < 10) {
            return "RATTRAPAGE";
        } else {
            return "ADMIS";
        }
    }
}

