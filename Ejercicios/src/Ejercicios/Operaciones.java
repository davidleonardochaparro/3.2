package Ejercicios;

import Ejercicios.Principal;

public class Operaciones {
    
    private int a;
    private int sumatoria;
    private double varianza;
    private double desviacion;
   
     private int[]array;
    private double[]array2;
    
    public Operaciones(){}
    public Operaciones(int a, int sumatoria, double varianza, double desviacion){
        this.a=a;
        this.sumatoria=sumatoria;
        this.varianza=varianza;
        this.desviacion=desviacion;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(int sumatoria) {
        this.sumatoria = sumatoria;
    }

    public double getVarianza() {
        return varianza;
    }

    public void setVarianza(double varianza) {
        this.varianza = varianza;
    }

    public double getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(double desviacion) {
        this.desviacion = desviacion;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public double[] getArray2() {
        return array2;
    }

    public void setArray2(double[] array2) {
        this.array2 = array2;
    }
    
    String tam=String.valueOf(Principal.TamArreglo.getText());
    int size = Integer.parseInt(tam);
         public void Ejercicio1(int size){
             int array[]=new int[size], sumatoria=0;
             double sumatoria2=0, promedio=0, desviacion=0;
             double varianza=0;

             for(int i=0;i<size;i++){
                 
                 int numAleatorio=(int)(Math.random()*10+1);
                 array[i]=numAleatorio;
                 System.out.println(array[i]);
                 sumatoria=(array[i]+sumatoria);                 
                }
             promedio=(sumatoria/size);
             
             double []base=new double[size];
             
             for(int j=0;j<size;j++){
                 
                 base[j]=(Math.pow(array[j]-promedio,2))/a;
                 sumatoria2+=base[j];
             }
             
             desviacion=Math.sqrt(sumatoria2);
             varianza=Math.pow(desviacion,2);
         }    
         
          
         
         public void mostrar(){
             
             String info="";
             
             for(int i=0;i<size;i++){
  
                 info=info+" "+array[i];                 
             }
                Principal.Arreglo.setText(info);           
             
         }
}
