package dominio;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;


public  class OPadron {
    private ArrayList<Habitante> habitantespadron = new ArrayList<>();
        public void add(Habitante habitante) {
            habitantespadron.add(0, habitante);  
            volcar(); 
        }
        public ArrayList<Habitante> gethabitantespadron() {
            return habitantespadron;
        }
        public int calcularHabitantes() {
            int suma = 0;
            for(Habitante habitante : habitantespadron) {
                suma++;
            }
            return suma;
        }

        private void cargarHabitantes(){
            try {
                File fichero = new File("padron.csv");
                fichero.createNewFile();
                Scanner sc = new Scanner(fichero);
                sc.useDelimiter(",|\n");
                while(sc.hasNext()) {
                    Habitante habitante = new Habitante(sc.next(), sc.next(), sc.next());
                    habitantespadron.add(habitante);
                }
                sc.close();
            }
            catch(IOException ex) {
                System.out.println("No hay habitantes inscritos :( ");
            }
        }
        public OPadron() {
            cargarHabitantes();
        }
        public void volcar(){
            try{
                FileWriter fw = new FileWriter("padron.csv");
                for(Habitante habitante: habitantespadron){
                    fw.write(habitante.getnombre()+","+habitante.getap1()+","+habitante.getap2()+"\n");
                }
            fw.close();
        }
        catch (IOException ex){
            System.err.println(ex);
        }
        }
        }


