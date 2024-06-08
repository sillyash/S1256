//correct package - Emma
package JODES.vues;
import java.awt.BorderLayout;
import java.awt.Font;

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
    handleResponse();
  }

  protected void handleResponse() {
    switch (response) {
      case JOptionPane.YES_OPTION:
        System.out.println("Yes option selected.");
        break;
      case JOptionPane.NO_OPTION:
        System.out.println("No option selected.");
        break;
      case JOptionPane.CANCEL_OPTION:
        System.out.println("Cancel option selected.");
        break;
      case JOptionPane.CLOSED_OPTION:
        System.out.println("Dialog closed without selection.");
        break;
    }
  }

  protected int getResponse() {
    return response;
  }

  //Emma ESCOFFIER
  public MessageBox(String message, String title) {
	  this.message = message;
	  this.title = title;
  }
  
  public void showMessageBox() {
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
  
  public static void main(String[] args) {
    MessageBox messageBox = new MessageBox("Are you sure you want to delete?", "Confirm Deletion", JOptionPane.YES_NO_CANCEL_OPTION);
    messageBox.show();
  }
}
