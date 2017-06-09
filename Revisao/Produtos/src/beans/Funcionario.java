package beans;

public class Funcionario {
	private String sexo;
	private double rm;
	
	public Funcionario() {
		super();
	}

	public Funcionario(String sexo, double rm) {
		super();
		this.setSexo(sexo);
		this.rm = rm;
	}

	public String getAll() {
		return "\nSexo:" + sexo + "\nRM:" + rm;
	}
	
	public void setAll(String sexo, double rm) {
		this.sexo = sexo;
		this.rm = rm;
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		sexo = sexo.toUpperCase();
		if (sexo.equals("M")){
			this.sexo = "Masculino";
		}
		else {
			this.sexo = "Feminino";
		}
			
	}
	public double getRm() {
		return rm;
	}
	public void setRm(double rm) {
		this.rm = rm;
	}
	
}
