package beans;

public class CD extends Produto{
	private int totalFaixas;
	private String artista;
	private String gravadora;
	
	public void setAll(int codigo, String descricao, double valor, int tf, String a, String g){
		super.setAll(codigo, descricao, valor);
		totalFaixas = tf;
		artista = a;
		gravadora = g;
	}
	
	public String getAll(){
		// CUIDADO NO super.getAll
		return super.getAll() + totalFaixas + "\n" + artista + "\n" + gravadora;
	}
	
	public CD() {
	}

	public CD(int codigo, String descricao, double valor, int totalFaixas, String artista, String gravadora) {
		super(codigo, descricao, valor);
		this.totalFaixas = totalFaixas;
		this.artista = artista;
		this.gravadora = gravadora;
	}
	
	public int getTotalFaixas() {
		return totalFaixas;
	}
	public void setTotalFaixas(int totalFaixas) {
		this.totalFaixas = totalFaixas;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	
	
	
}
