/**
 *Representa una calculadora y varias de sus operaciones aritmeticas.
 *
 */
public class Carro {
    double peso;
    double altura;
    double ancho;
    double largo;
    int numeroPuerta;
    boolean encendido = false;


    //Contructor
    public Carro() {
        this.peso = 1000;
        this.altura = 1.90;
        this.ancho = 4;
    }

    //Metodos.
    public double optenerPeso(){
        return this.peso;
    }

    public void encender(){
        this.encendido = true;
        System.out.println("El carro esta encendido");
    }

    public void apagar(){
        this.encendido = false;
        System.out.println("El carro esta apagado");
    }

    public  void estado(){
        if (this.encendido ==true){
            System.out.println("El carro esta encendido");
        }else{
            System.out.println("El carro esta apagado");
        }
    }




}
