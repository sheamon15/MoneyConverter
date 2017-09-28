/**
 * @Author:SheaSalloum
 * @Date:9/28/17
 * @purpose:Convert $ into it's change values
 * @lisence:GNU
 */

import javafx.application.Application;
import javafx.stage.Stage;//imports javafx
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;
public class ViCents extends Application{

            public void start(Stage stage){
                final int Quarter = 25;
                final int Dime = 10;// int values of the coins
                final int Nickle = 5;
                final int Penny = 1;

                TextInputDialog input = new TextInputDialog();

                Optional <String> value = input.showAndWait();
                String amount = value.get();
                int qChange =  Integer.parseInt(amount)*100/Quarter;
                int dChange = Integer.parseInt(amount)*100/Dime;
                int nChange= Integer.parseInt(amount)*100/Nickle;
                int pChange = Integer.parseInt(amount)*100/Penny;

                Alert alert = new Alert(AlertType.INFORMATION);//creates the dialog pop up box
                alert.setTitle("Change amount");
                alert.setContentText("The change in quarters is " + qChange);
                alert.showAndWait();


                Alert hi = new Alert(AlertType.INFORMATION);
                hi.setTitle("Change amount ");
                hi.setContentText("The change in dimes is " + dChange);// adds the value to the string 
                hi.showAndWait();

                Alert how = new Alert(AlertType.INFORMATION);
                how.setTitle("Change amount");
                how.setContentText("The change in nickles is " + nChange);
                how.showAndWait();


                Alert are = new Alert(AlertType.INFORMATION);
                are.setTitle("Change amount");
                are.setContentText("The change in pennies is " + pChange);
                are.showAndWait();
            }



        }






