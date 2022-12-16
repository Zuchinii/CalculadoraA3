
public class ItemSistema {

    public String nomeItem;
    private String tipoItem;
    public int complexidade = 1;
    public int qtdHoras;

    public int CalculaQtdHoras() {
         switch (complexidade) {
        
            case 1 ->
                qtdHoras = 24;
            case 2 ->
                qtdHoras = 48;
            case 3 ->
                qtdHoras = 72;
            default ->
                qtdHoras = 96;
        };

        return qtdHoras;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }

}
