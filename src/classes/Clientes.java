package classes;

import java.util.ArrayList;
import java.util.List;

public class Clientes {

    private final List<String> listaClientes;

    public Clientes() {
        listaClientes = new ArrayList<>();
        listaClientes.add("Selecione um cliente para emitir o relatório");
    }

    public void adicionarCliente(String nome) {
        listaClientes.add(nome);
    }

    public List<String> getListaClientes() {
        return listaClientes;
    }
}
