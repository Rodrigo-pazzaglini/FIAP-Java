package modelo;

public class Telefone {
	private String numero;
	private int ddd;
	private int ramal;

	public String getAll(){
		return "("+ddd+") " + numero + " : Ramal:" + ramal;
	}
	public void setAll(String numero, int ddd, int ramal) {
		this.numero = numero;
		this.ddd = ddd;
		this.ramal = ramal;
	}

	public Telefone(String numero, int ddd, int ramal) {
		super();
		this.numero = numero;
		this.ddd = ddd;
		this.ramal = ramal;
	}
	public Telefone() {
		super();
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getRamal() {
		return ramal;
	}
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

}
