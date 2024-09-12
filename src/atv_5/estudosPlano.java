package atv_5;

public class estudosPlano {

    private String materia;
    private String cntProgramatico;
    private String critAvaliacao;
    private String bibliografia;

    estudosPlano() {
    }

    public estudosPlano(String materia, String cntProgramatico, String critAvaliacao, String bibliografia) {
        this.materia = materia;
        this.cntProgramatico = cntProgramatico;
        this.critAvaliacao = critAvaliacao;
        this.bibliografia = bibliografia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCntProgramatico(String cntProgramatico) {
        this.cntProgramatico = cntProgramatico;
    }

    public void setCritAvaliacao(String critAvaliacao) {
        this.critAvaliacao = critAvaliacao;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public String getMateria() {
        return materia;
    }

    public String getCntProgramatico() {
        return cntProgramatico;
    }

    public String getCritAvaliacao() {
        return critAvaliacao;
    }

    public String getBibliografia() {
        return bibliografia;
    }
//* Usei o get set junto de contrutores para testar a funcionalidade de ambos, principalmente se funcionam ao mesmo tempo, com os "mesmos objetivos".
    public void mostraPlano() {
        System.out.println("Matéria: " + materia);
        System.out.println("Conteudo Programatico: " + cntProgramatico);
        System.out.println("Critério de avaliação: "+ critAvaliacao);
        System.out.println("Bibliografia: " + bibliografia);
    }

}

