package media;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Media media = new Media();
        double med = 0;

        String item = JOptionPane.showInputDialog(null, "Entre com a nota da Avaliação: ");
        double nota_Ava = item == null ? -0.1 : Double.parseDouble(item);
        media.setNotaAva(nota_Ava);

        if((nota_Ava <= 0) || (nota_Ava > 10)){
            JOptionPane.showMessageDialog(null,"Erro");
            return;
        }

        String item2 = JOptionPane.showInputDialog(null, "Entre com a nota de Laboratório: ");
        double nota_Lab = item2 == null ? -0.1 : Double.parseDouble(item2);
        media.setNotaLab(nota_Lab);

        if((nota_Lab <= 0) || (nota_Lab > 10)){
            JOptionPane.showMessageDialog(null,"Erro");
            return;
        }

        String item3 = JOptionPane.showInputDialog(null, "Entre com a nota do Exame Final: ");
        double nota_Exame = item3 == null ? -0.1 : Double.parseDouble(item3);
        media.setNotaExame(nota_Exame);

        if((nota_Exame <= 0) || (nota_Exame > 10)){
            JOptionPane.showMessageDialog(null,"Erro");
            return;
        }

        med = media.calcMedia();
        JOptionPane.showMessageDialog(null, "A nota do aluno é: "
                                            + media.calcConceito(med));
    }

}
