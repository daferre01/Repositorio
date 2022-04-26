package sample;

public class Juego {
    int fichasColocadas;
    int turno;
    int[][] array=new int[3][3];
    public Juego() {
        this.turno = (int)(Math.random()*2)+1;
    }
    public int getTurno() {
        return turno;
    }
    public int[][] getArray() {
        return array;
    }
    public int getFichasColocadas() {
        return fichasColocadas;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    }
    public void cambiar(){
        if(turno==1){
            turno=2;
        }
        else if(turno==2){
            turno=1;
        }

    }
    public void principiopanel(){
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j]=0;
            }
        }

    }
    public void posicionarFicha(int fila,int columna){
                if(turno==1){
                    array[fila][columna]=1;//fichaazul
                }if(turno==2){
                    array[fila][columna]=2;//fichaamarilla
            }

    }
    public boolean comprobarFil(int fila){
        for (int i = 0; i < 3; i++) {
            if(turno==1){
                if(array[fila][i]!=1){
                    return false;
                }
            }if(turno==2){
                if(array[fila][i]!=2){
                    return false;
            }
        }

    }
        return true;
    }
    public boolean comprobarColumnas (int col){
            for (int i = 0; i < 3; i++) {
                if(turno==1){
                    if(array[i][col]!=1){
                        return false;
                    }
                }if(turno==2){
                    if(array[i][col]!=2){
                        return false;
                    }
                }}
                return true;

    }
    public boolean comprobarDiagonales(){
        for (int i = 0; i < 3; i++) {

                if(turno==1){
                    if(array[i][i]!=1){
                        return false;
                    }
                    if(array[i][3-1-i]!=1){
                        return false;
                    }
                }
                if(turno==2){
                    if(array[i][i]!=2){
                        return false;
                    }
                if(array[i][array.length-1-i]!=2){
                    return false;
                }
            }
        }
        return true;
    }

}

