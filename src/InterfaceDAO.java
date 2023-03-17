import java.util.List;

public interface InterfaceDAO {

    public void salvar(String nome);
    public void atualizar(int id);
    public void deletar(int id);
    public List<Object> getAll();
}
