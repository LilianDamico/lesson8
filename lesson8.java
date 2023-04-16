package curso_java;

import javax.swing.*;

public class lesson8 {
    public static void main(String[] args){
        double n1 = Double.parseDouble((JOptionPane.showInputDialog("Informe a primeira nota")));
        double n2 = Double.parseDouble((JOptionPane.showInputDialog("Informe a segunda nota")));
        double n3 = Double.parseDouble((JOptionPane.showInputDialog("Informe a terceira nota")));
        double n4 = Double.parseDouble((JOptionPane.showInputDialog("Informe a quarta nota")));
        double med = (n1 + n2 + n3 + n4) / 4;
        JOptionPane.showMessageDialog(null, " A média do aluno foi "+med);
        if (med < 6)

            JOptionPane.showMessageDialog(null, "Aluno reprovado");
        }
    }
