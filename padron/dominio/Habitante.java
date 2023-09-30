package dominio;    
public class Habitante{

    private String nombre;
    private String ap1;
    private String ap2;

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public void setap1 (String ap1) {
        this.ap1 = ap1;
    }
    public void setap2 (String ap2) {
        this.ap2 = ap2;
    //para reducir confusión, los parametros de los setters se llaman igual que los atributos que actualizan, por lo que hay que usar la llamada al atributo del objeto mediante .this para no actualizar el parámetro incluido al ser de rango menor.
    }
    public String getnombre() {
        return this.nombre;
     } 
    public String getap1() {
        return this.ap1;
     }
    public String getap2() {
        return this.ap2;
    }
    public Habitante(String nombre, String ap1, String ap2) {
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
    }
    public static void main(String[] args) {
        //Habitante habitante1 = new Habitante("Pablo","Corzo", "Corella"); 
        //Método de asignacion sin constructor:
        //habitante1.setnombre("pablo");
        //habitante1.setap1("corzo");
        //habitante1.setap2("corella");
    }   
}