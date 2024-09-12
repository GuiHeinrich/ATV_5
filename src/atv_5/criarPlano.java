package atv_5;

import javax.swing.JOptionPane;

public class criarPlano{
    public static void  main (String[] args) {

        estudosPlano A = new estudosPlano("Matemática", "Logaritmos","Prova (A1+A2)","Fatec");
        A.mostraPlano();

        String Bmateria;
        String BcntProgramatico;
        String BcritAvaliacao;
        String Bbibliografia;

        Bmateria = JOptionPane.showInputDialog("Insira a materia");
        BcntProgramatico = JOptionPane.showInputDialog("Insira o conteúdo programático");
        BcritAvaliacao = JOptionPane.showInputDialog("Insira o critério de avaliação");
        Bbibliografia = JOptionPane.showInputDialog("Insira a bibliografia");

        estudosPlano B = new estudosPlano();
        B.setMateria(Bmateria);
        B.setCntProgramatico(BcntProgramatico);
        B.setCritAvaliacao(BcritAvaliacao);
        B.setBibliografia(Bbibliografia);

        JOptionPane.showMessageDialog(null, " Matéria: "+ Bmateria
                + "\n Conteúdo Programático: "+ BcntProgramatico
                + "\n Critério de Avaliação: "+ BcritAvaliacao
                + "\n Bibliografia: "+ Bbibliografia);
    }
}
