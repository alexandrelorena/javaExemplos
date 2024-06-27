package POO.Iphone.Apps;

public abstract class AplicativoEscolhido {
	public abstract void escolherAplicativo();
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
    protected void verificarDados() {
        System.out.println("Verificando pacote de dados...");
    }	

}
