package br.com.PdvFrontEnd.view;
import br.com.PdvFrontEnd.service.PrecoService;
public class PrecoView {
    public PrecoView() {
        PrecoService service = new PrecoService();
        PrecoList list = new PrecoList(service);
        list.setVisible(true);
    }
}
