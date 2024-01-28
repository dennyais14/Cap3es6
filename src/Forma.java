enum TipoForma{
    Triangolo,
    Rettangolo
}


public class Forma {
    private int base;
    private int altezza;
    private TipoForma tipoForma;

    public Forma(int base, int altezza, TipoForma tipoForma){
        this.base = base;
        this.altezza = altezza;
        this.tipoForma = tipoForma;
    }

    public int getBase(){
        return base;
    }

    public int getAltezza(){
        return altezza;
    }

    public TipoForma getTipoForma() {
        return tipoForma;
    }

    public int calcolaArea(int base, int altezza, TipoForma tipoForma){
        if(tipoForma == TipoForma.Rettangolo) {
            return base * altezza;
        }
        else {
            return (base * altezza)/2;
            }
        }
    }

