
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;
class Simple extends Frame{
    // creating a button - create inside a constructor
    Simple(){
        setTitle("AWT Counter App");
        // need one textfield , 2 buttons - one for increment and
        // another one for reset

        // TextField
        TextField display  = new TextField("0");
        display.setBounds(250,150,200,40);
        add(display);

        //increment button
        Button increment = new Button("Increment");
        increment.setBounds(250,220,100,40);
        add(increment);
        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // we need to get number from the user
                // increment it by 1
                // and display it

                // getting input from the user
                int num =Integer.parseInt(display.getText());
                display.setText(String.valueOf(++num));
                /*
                🧠 Step-by-step Explanation:
1. display.getText()
Retrieves the current text in the TextField.
Example: "0", "5", etc.
2. Integer.parseInt(...)
Converts the String (e.g., "5") into an integer (5) so we can do math with it.
3. ++num
Increments the number by 1.
If it was 5, it becomes 6.
4. String.valueOf(...)
Converts the incremented integer back to a String.
5. display.setText(...)
Updates the TextField with the new incremented value as text.
                 */
            }
        });

        // reset button
        Button reset = new Button("Reset");
        reset.setBounds(370,220,80,40);
        add(reset);
        // whenever this button is clicked we need to display 0 in the textField
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //to display 0 in the testFiled
                display.setText("0");
            }
        });

        // set layout - style
        setLayout(null);
        setVisible(true);
        setSize(700,900);


    }



    public static void main(String[] args) {

        new Simple();
    }

}

