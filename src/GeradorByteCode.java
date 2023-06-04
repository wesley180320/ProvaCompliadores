import java.util.Scanner;

public class GeradorByteCode {

	public GeradorByteCode() {
		// TODO Auto-generated constructor stub
	}
	
	public String gerar(String linha) {
		String[] token = linha.split(" ");
		
		if (token[0].equals("cely")){
			return "int " + token[1];
		}
		if (token[0].equals("int")) {
			return "int " + token[1];
		}
		
		if (token[0].equals("citat")) {
			return token[1].replace(";","") + "=teclado.nextInt();";
		}
		if (token[0].equals("pre"))
			return token[0] + " " + token[1] + " " + token[2] + " " + token[3] + " " + token[4] + " " + token[5] + " " + token[6];
		
		if (token[0].equals("ak"))
			return token[0] + " " + token[1] + " " + token[2] + " " + token[3] + " " + token[4];
		
		if (token[0].equals("vytlacit"))
			return token[0] + " " + token[1];
		
		if (token[0].equals("koniec"))
			return token[0] + " " + token[1];
		
		if (token[0].equals("koncovy"))
			return token[0] + " " + token[1];
		
		if (token[0].equals("tlacit"))
			return token[0] + " " + token[1];
		
		if (token[0].equals("navrat"))
			return token[0] + " " + token[1];
		
		
		return "";
	}

}
