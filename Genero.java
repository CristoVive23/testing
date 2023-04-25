
package Systems;

public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    public String texto;

    private Genero() {
    }

    private Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
