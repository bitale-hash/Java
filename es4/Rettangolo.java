package Java.es4_c;

public class Rettangolo{
    int base, altezza,  x,  y;

    public Rettangolo(int b, int a, int x, int y) {
        this.base = b;
        this.altezza = a;
        this.x = x;
        this.y = y;
    }
        //GET
    public int getBase() 
    { 
        return base; 
    } 
    public int getAltezza() 
    { 
        return altezza; 
    } 
    public int getAscissa() 
    { 
        return x; 
    }    
    public int getOrdinata() 
    { 
        return y;   
    } 
        //SET
    public void setBase(int nuovaBase) 
    { 
        this.base=nuovaBase;
    } 
    public void setAltezza(int nuovaAltezza) 
    { 
         this.altezza=nuovaAltezza;
    } 
    public void setAscissa(int nuovaAscissa) 
    { 
        this.x=nuovaAscissa;
    }    
    public void setOrdinata(int nuovaOrdinata) 
    { 
        this.y=nuovaOrdinata;   
    } 
    public void stampa(){
        System.out.println("La dimensione della base è: "+base);
        System.out.println("La dimensione dell'altezza è: "+altezza);
        System.out.println("La dimensione dell'ascissa è: "+x);
        System.out.println("La dimensione dell'ordinata è: "+y);
    }
    public void traslazione(int trX, int trY) 
    { 
        x = x + trX; 
        y = y + trY; 
    } 
 
    public int getPerimetro() 
    { 
        return (base + altezza)*2; 
    } 

    public int getArea() 
    { 
        return base * altezza; 
    }

    //disegna un piano cartesiano e il rettangolo
    //PS: l ascissa e l ordinata date non sono il centro del rettangolo ma il punto 
    //in basso a sinistra del rettangolo nel piano.
    public void disegna(){
        String[][] matrice = new String[20][20];
       
        //crea gli assi del piano cartesiano
        for(int i = 0; i < 20; i++){
            for(int j=0; j < 20; j++)
                if(i == 9 && j == 9){
                    matrice[i][j] = "O";   // origine

                }else if(i == 9){
                    matrice[i][j] = "-";   // asse X

                }else if(j == 9){
                    matrice[i][j] = "|";   // asse Y

                }else{
                    matrice[i][j] = " ";   // spazio vuoto
                }
        }
        //crea il rettangolo/quadrato nel piano
        if((base!=0)&&(altezza!=0)){
                int a = x + 9; // ascissa → colonne
                int b = 8 - y; // ordinata → righe (grafica invertita)

                for(int i = b; i < b + altezza; i++){
                    for(int j = a; j < a + base; j++){
                    // controllo per non uscire dalla matrice
                        if(i >= 0 && i < 20 && j >= 0 && j < 20){
                            matrice[i][j] = "@";
                        }
                    }
                }
        }
        //stampa la matrice (il piano cartesiano + il rettangolo) 
        for(int i = 0; i < 20; i++){
            for(int j=0; j < 20; j++){
                System.out.printf("%3s",matrice[i][j]);  //quel %3s dice che ogni cella stampata e lunga 3 caratteri
            }
            System.out.println(); 
        }
    }

}
