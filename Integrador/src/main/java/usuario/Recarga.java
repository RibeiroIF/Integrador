package usuario;

import java.time.LocalDate;

public class Recarga {

	private double valor;
	private LocalDate data, horario;
	
	public Recarga() {
		super();
	}

	public Recarga(double valor, LocalDate data, LocalDate hora) {
		super();
		this.valor = valor;
		this.data = data;
		this.horario = hora;
	}

	public double getValor() {
		return valor;
	}

	public LocalDate getData() {
		return data;
	}

	public LocalDate getHorario() {
		return horario;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void setHorario(LocalDate horario) {
		this.horario = horario;
	}
	
}
