package com.dio.publisher;
import com.dio.GetPath.GetPath;

public class Utils{

    private String directory;
    private String novoEmail;

    GetPath arquivo;

    public Utils(String directory, String novoEmail) {
        this.directory = directory;
        this.novoEmail = novoEmail;
        this.setNovoEmail(novoEmail);
    }

    public Utils(String nomeArquivo){
        arquivo = new GetPath();
        arquivo.setTabela(nomeArquivo);
        this.setDirectory(arquivo.tabelaExiste());
    }

    public String getNovoEmail() {
        return novoEmail;
    }

    public void setNovoEmail(String novoEmail) {
        this.novoEmail = novoEmail;
    }

    private void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getDirectory() {
        return directory;
    }


}
