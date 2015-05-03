import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by SMG on 1.5.2015.
 */
public class ManageScreen extends JFrame {
    private JList list1;
    private JButton newButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JTextField textField1;
    private JPanel rootPanel;

    public static void main(String[] args) {

    }
    public ManageScreen() {
        super("Hello world");
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(rootPanel);


        //adding new customer
        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("new");
                NewDialog mydialog = new NewDialog();
                mydialog.setVisible(true);
            }
        });
        //edit customer

        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("update");
                EditDialog secondmydialog =new EditDialog();
                secondmydialog.setVisible(true);
            }
        });

        //delete customer
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("delete");
                DeleteDialog thirdmydialog=new DeleteDialog();
                thirdmydialog.setVisible(true);
            }
        });

        setVisible(true);
    }



    }














