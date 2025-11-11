package br.com.PdvFrontEnd.view;
import br.com.PdvFrontEnd.service.ProdutoService;
public class ProdutoView {
    public ProdutoView() {
        ProdutoService service = new ProdutoService();
        ProdutoList list = new ProdutoList(service);
        list.setVisible(true);
    }
}
