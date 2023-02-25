package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;
    
    //Constructor
    public TV(Marca marca, boolean estado) {
    	this.marca = marca;
        this.estado = estado;
        numTV++;
    }
    
    //Marca
    public Marca getMarca() {
        return marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    //Control
    public Control getControl() {
        return control;
    }
    
    public void setControl(Control control) {
        this.control = control;
    }
    
    //Precio
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //Volumen
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (estado == true && canal > 0 && canal < 7) {
            this.volumen = volumen;
        }
    }
    
    //Canal
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(estado == true && canal >= 1 && canal <= 120) {
            this.canal = canal;
        }
    }
    
    //numTV
    public static int getNumTV() {
        return numTV;
    }
    
    public static void setNumTv(int numTV) {
    	TV.numTV = numTV;
    }
    
    //Estado
    public boolean getEstado() {
        return estado;
    }

    public void turnOn() {
        estado = true;
    }

    public void turnOff() {
        estado = false;
    }
    
    //Modificar canales
    public void canalUp() {
        if(estado && canal < 120) {
            canal++;
        }
    }

    public void canalDown() {
        if(estado && canal > 1) {
            canal--;
        }
    }
    
    //Modificar volumen
    public void volumenUp() {
        if(estado == true && volumen < 7) {
            volumen++;
        }
    }
    
    public void volumenDown() {
        if(estado == true && volumen > 1) {
            volumen--;
        }
    }

}