package br.com.PdvFrontEnd.view;
import br.com.PdvFrontEnd.service.EstoqueService;
public class EstoqueView {
    public EstoqueView() {
        EstoqueService service = new EstoqueService();
        EstoqueList list = new EstoqueList(service);
        list.setVisible(true);
    }
}
