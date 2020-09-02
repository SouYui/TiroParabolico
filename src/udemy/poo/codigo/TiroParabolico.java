/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

/**
 *
 * @author luisangelcuriel
 */
public class TiroParabolico {
    private float velocidadInicial;
    private int grado;
    private final float gravedad = 9.81f;

    public TiroParabolico(float velocidadInicial, int grado) {
        this.velocidadInicial = velocidadInicial;
        this.grado = grado;
    }
    
    public float alturaMaxima() {
        float v0y = (float) (this.velocidadInicial 
                * Math.sin(Math.toRadians(grado)));
        float tiempo = v0y / this.gravedad;
        float y = (float) (v0y * tiempo 
                - (4.9f * Math.pow(tiempo, 2)));
        return y;
    }
    
    public float alcance() {
        float v0x = (float) (this.velocidadInicial 
                * Math.cos(Math.toRadians(grado)));
        float tiempo = (float) (2 * ((this.velocidadInicial 
                * Math.sin(Math.toRadians(grado))) / this.gravedad));
        float x = (v0x * tiempo);
        return x;
    }
    
    public Componentes[] calculoComponentes(int t) {
        int elementos = (int) (t / 0.1);
        Componentes[] valores = new Componentes[elementos + 1];
        int indice = 0;
        float x = 0.0f;
        float y = 0.0f;
        
        for (float i = 0; i < t; i += 0.1) {
            x = (float) (velocidadInicial * Math.cos(Math.toRadians(grado)) * i);
            y = (float) (velocidadInicial * Math.sin(Math.toRadians(grado) * i) 
                    + 0.5 * -gravedad * Math.pow(i, 2));
            
            Componentes obj = new Componentes(i, x, y);
            valores[indice] = obj;
            indice ++;
        }
        
        return valores;
    }

    public float getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(float velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
    
}
