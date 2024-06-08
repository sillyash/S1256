//correct package - Emma
package JODES.vues;
import java.awt.BorderLayout;

import javax.swing.*;

/**
 * @author Kincy Saad
 */
public class MessageBox {
  protected String message;
  protected String title;
  protected int optionType;
  protected int response;

  public MessageBox(String message, String title, int optionType) {
    this.message = message;
    this.title = title;
    this.optionType = optionType;
  }
  

  public void show() {
    response = JOptionPane.showConfirmDialog(
        null, message, title, optionType);
  }

  protected int getResponse() {
    return response;
  }

  /**
   * @author Emma Escoffier
   */
  public MessageBox(String message, String title) {
	  this.message = message;
	  this.title = title;
  }
  
  /**
   * @author Emma Escoffier
   */
  public void showMessageBoxPlann() {
      JTextPane textPane = new JTextPane();
      textPane.setContentType("text/html");
      textPane.setText("<html><body style='text-align: center;'>" +
              "<h2 style = 'font-family: Comic Sans MS;'><u>Utilisation du planning JODES:</u></h2>" +
              "<ul style='text-align: left; font-family: Arial;'>" +
              "<li>Vous pouvez creer des sessions a travers l'onglet 'Sessions' du menu principal.</li>" +
              "<li>Ensuite, le planning se mettra a jour pour afficher la Session que vous venez de creer.</li>" +
              "<li>Une Session correspond au statut des Epreuves: cela peut etre une Finale, une demi-finale...</li>" +
              "<li>Vouz pouvez egalement creer des epreuves qui seront affectees a une session des leur creation.</li>"+
              "</ul></body></html>");
      
      textPane.setEditable(false);
      textPane.setOpaque(false);
      JPanel panel = new JPanel(new BorderLayout());
      panel.add(textPane, BorderLayout.CENTER);
      JOptionPane.showMessageDialog(null, panel, "Information", JOptionPane.INFORMATION_MESSAGE);
  }
}
