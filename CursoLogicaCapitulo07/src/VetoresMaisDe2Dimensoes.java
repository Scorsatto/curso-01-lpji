
public class VetoresMaisDe2Dimensoes {
	public static void main(String[] args) {

		Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1700.0 };
		Double[] faturamentoFevereiro = new Double[] { 1000.0, 2500.0, 1800.0 };

		Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro };
		
		Double[][][] faturamentoQuiquenal = new Double[][][] {faturamentoAnual};
		
		Double[][][][] faturamentoDecada = new Double[][][][] {faturamentoQuiquenal};
		

//		for (int i = 0; i < faturamentoAnual.length; i++) {
//			System.out.println("Mês: " + (i + 1));
//			
//			Double[] mes = faturamentoAnual[i];
//			
//			for (int j = 0; j < mes.length; j++) {
//				Double dia = mes[j];
//				
//				System.out.println("Dia " + (j + 1) + ": " + dia);
//			}
//		}
	}
}
