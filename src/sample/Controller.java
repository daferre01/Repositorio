package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Controller {
    public GridPane panel;
    public TextArea mensaje;
    public ImageView fichaazul;
    public ImageView fichaamarilla;
    Juego juego =new Juego();
    public void nuevapartida(ActionEvent actionEvent) {
        initialize();
    }
    public void initialize(){

        juego.principiopanel();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button();
                button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
                button.setOnAction(this::buttonClick); //asociar método
                panel.add(button, j, i); // coordenas del layout grid coumna fila
            }
    }
        boolean comp=true;
        if(juego.getTurno()==1){
            fichaamarilla.setVisible(!comp);
            fichaazul.setVisible(comp);
        }else if(juego.getTurno()==2){
            fichaamarilla.setVisible(comp);
            fichaazul.setVisible(!comp);
        }
    }

    private void buttonClick(ActionEvent actionEvent) {
        Button button =(Button) (actionEvent.getTarget());
        int colGrid =panel.getColumnIndex(button);
        int filGris =panel.getRowIndex(button);
        asignarImagen_Button(button);


    }
    public void asignarImagen_Button(Button button){
        Image image = new Image(getClass().getResourceAsStream("imagenes/ficha"+juego.getTurno()+".png" ), 50, 50, false, false);
        ImageView imageView = new ImageView(image);
        button.setGraphic(imageView);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        juego.cambiar();

    }


}
