//Scrivere un programma che contenga una classe chiamata Forma
// ed un metodo chiamato calcolaArea()
// che stampi l'area della forma specifica.
//Crea poi due sottoclassi Triangolo e Rettangolo
// che estendono Forma e che abbiano un tipo
// che ne identifichi la Forma in maniera univoca usando una enum.
public class Main {
    public static void main(String[] args) {
        Triangolo triangle1 = new Triangolo(10, 5, TipoForma.Triangolo);
        System.out.println("Data la forma A: ");
        System.out.println("il tipo della forma e': " + triangle1.getTipoForma());
        System.out.println("Base " + triangle1.getBase());
        System.out.println("Altezza " + triangle1.getAltezza());
        System.out.print("l'area del triangolo e' pari a: ");
        System.out.println(triangle1.calcolaArea(triangle1.getBase(),triangle1.getAltezza(), triangle1.getTipoForma()));

        Rettangolo rectangle1 = new Rettangolo(10, 5, TipoForma.Rettangolo);
        System.out.println("Data la forma B: ");
        System.out.println("il tipo della forma e': " + rectangle1.getTipoForma());
        System.out.println("Base " + rectangle1.getBase());
        System.out.println("Altezza " + rectangle1.getAltezza());
        System.out.print("l'area del rettangolo e' pari a: ");
        System.out.println(rectangle1.calcolaArea(rectangle1.getBase(),rectangle1.getAltezza(), rectangle1.getTipoForma()));
    }
}