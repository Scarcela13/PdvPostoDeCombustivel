package br.com.PdvFrontEnd.view;
import br.com.PdvFrontEnd.service.CustoService;
public class CustoView {
    public CustoView() {
        CustoService service = new CustoService();
        CustoList list = new CustoList(service);
        list.setVisible(true);
    }
}
