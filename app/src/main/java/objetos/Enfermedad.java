package objetos;

public class Enfermedad {

    private int Enfermedad;
    private int id;
    private String[] enfermedad = {"Brucelosis", "Fiebre Aftosa", "Salmonella", "Rabia"};
    private int costoenfer[] = {75000, 22500, 35000,54000};


    public Enfermedad()
    {
        id = 1;

    }

    public Enfermedad(int id, String[] enfermedad) {
        this.id = id;
        this.enfermedad = enfermedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String[] enfermedad) {
        this.enfermedad = enfermedad;
    }

    public void calcularenfermedad(int valor, int cantidad) {
    }
}