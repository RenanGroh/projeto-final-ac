import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Contato {
    private long id;
    private String nome;
    private String sobreNome;
    private List<Telefone> telefones;


    //region Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }


    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    //endregion

    public Contato() {
        telefones = new ArrayList<>();
    }

    // Método para mostrar os telefones no menu ao lado no nome
    public String getTelefonesFormatados() {
        return telefones.stream()
                .map(t -> "(" + t.getDdd() + ")" + t.getNumero())
                .collect(Collectors.joining(", "));
    }

}
