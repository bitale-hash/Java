package Java.es10;

public class SecondConverter {
    int g,o,m,s;
    public SecondConverter(){
        g=0;
        o=0;
        m=0;
        s=0;
    }

    public SecondConverter(int g,int o,int m,int s){
        this.g=g;
        this.o=o;
        this.m=m;
        this.s=s;
    }
    public SecondConverter calcola(int s){
        int g,o,m;
        g=s/86400;
        System.out.println("sono passati "+g+" giorni" );
        o=(s%86400)/3600;
        System.out.println( o +" ore ");
        m=((s%86400)%3600)/60;
        System.out.println( m + " minuti e ");
        s=((s%86400)%3600)%60;
        System.out.println( s +" secondi");
        return new SecondConverter(g,o,m,s);
    }
}
