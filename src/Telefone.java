public class Telefone {
    private Long id;
    private String ddd;
    private Long numero;

    //region Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    //endregion

    @Override
    public String toString() {
        return "(" + ddd + ")" + numero;
    }

}
