package examen.negocio;

public class ModeloRiesgo {
    private String nombreModelo;
    private double riesgo;
    private double factorConfianza;

    public ModeloRiesgo(String nombreModelo, double factorConfianza) {
        this.nombreModelo = nombreModelo;
        setFactorConfianza(factorConfianza);
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public double getRiesgo() {
        return riesgo;
    }

    private void setRiesgo(double riesgo) {
        if(riesgo >= 0 && riesgo <= 1)
            this.riesgo = riesgo;
    }

    public double getFactorConfianza() {
        return factorConfianza;
    }

    public void setFactorConfianza(double factorConfianza) {
        if(factorConfianza >= 0 && factorConfianza <= 1)
            this.factorConfianza = factorConfianza;
    }
    public String evaluar(double entrada){
        double aux = (entrada * 0.6)+((1-factorConfianza)*0.4);
        setRiesgo(aux);
        if(riesgo >= 0.7)
            return "Alto riesgo";
        else if(riesgo >= 0.4)
            return "Riesgo moderado";
        else
            return "Riego bajo";
    }
    @Override
    public String toString(){
        return "Nombre: "+nombreModelo+"\nRiesgo: "+riesgo+"\nFactor de confianza: "+factorConfianza;
    }
}
