package tp_4;

public class ExcecaoDivisaoResultadoZero extends Exception {

	@Override
	public String getMessage() {
		return "O resultado desta divisão é 0!";
	}
}
