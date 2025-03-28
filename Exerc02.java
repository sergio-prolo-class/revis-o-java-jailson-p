public class Exerc02 {
	private static String 	TEXTOERROArgs 	= " \t Faltou digitar as notas 1, 2 e participação nos argumentos! ";
	private static String[] TEXTOCF			= {Colorset.GREEN + "APROVADO",Colorset.RED+"REPROVADO"};
	private static int 		QUANTARGS 		= 3;
	private static int[]	W				= {2,3};

	public static void main(String[] args) {

			Double[] p 	= new Double[args.length];

			if (validaArgs(p,args,QUANTARGS)) {
				System.out.println(Colorset.RED + TEXTOERROArgs + Colorset.RESET);
				return;
			}

			//for (double notas : p) {System.out.println(notas);}

			Double conceitofinal = cf(p,W);
			System.out.print (conceitofinal + ((conceitofinal >= 6) ? TEXTOCF[0] : TEXTOCF[1]) + Colorset.RESET);
		}

	public static boolean validaArgs(Double[] flutuantes, String[] argumentos, int quantArgs){
			if (argumentos.length != quantArgs ) {
				return true;
			}
			try {
				for ( int indx = 0; indx < argumentos.length; indx++) {flutuantes[indx] = Double.parseDouble(argumentos[indx]);}
				return false;
			}catch (NumberFormatException e) {
				return true;
			}
	}
	public static Double cf (Double[] notas, int[] multiplicadores){
		Double dividendo = 0.0;
		Double divisor 	 = 0.0;
		Double particip  = notas[notas.length-1];
		for(int indx=0; indx < multiplicadores.length;indx++){
			dividendo 	+= notas[indx] * multiplicadores[indx];
			divisor 	+= multiplicadores[indx];
		}
		return (dividendo/divisor)*0.9 + particip*0.1;
	}

}