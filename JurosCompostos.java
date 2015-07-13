import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class JurosCompostos{
	public float montante;
	public double tempo;
	public double taxaJuros;
	public double totalJurosCompostos;

	public void jurosCompostos(){
	     
     try{
     montante = Float.parseFloat(JOptionPane.showInputDialog("Digite os valor total de quando você tem"));
     tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de meses que você guardará o dinheiro"));
     taxaJuros = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de juros")); 
     DecimalFormat df = new DecimalFormat ("##.00"); 
     totalJurosCompostos = montante*(Math.pow((1 + taxaJuros/100), tempo));
     JOptionPane.showMessageDialog(null,"O valor " +montante + ",após " +tempo + "mes(es),com a taxa de juros " +taxaJuros + " equivale a: " + df.format(totalJurosCompostos));
     }
     catch(NumberFormatException ex){
     	JOptionPane.showMessageDialog(null,"Por favor experimente em vez de digitar ',' digite '.' quando for colocar um número");

     }
     
	}

	public static void main(String args[]){
		JurosCompostos jc = new JurosCompostos();
		jc.jurosCompostos();


	}
}