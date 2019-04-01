
public class TestaContaComExceptionChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c = new Conta();
		try {
			c.deposita();
		} catch(MinhaException ex) {
			System.out.println("Tratamento ...   ");
		}
		
	}

}
