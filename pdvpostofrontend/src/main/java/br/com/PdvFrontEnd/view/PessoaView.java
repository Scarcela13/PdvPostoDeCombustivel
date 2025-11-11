package br.com.PdvFrontEnd.view;

import br.com.PdvFrontEnd.service.PessoaService;

public class PessoaView {
    public PessoaView() {
        PessoaService pessoaService = new PessoaService();
        PessoaList pessoaList = new PessoaList(pessoaService);
        pessoaList.setVisible(true);
    }
}

