package pe.unjfsc.daw.entity;


public class CEPeajeDTOSalida {
	private int id;
	private String descripcion;
	private String ruc;
	private String direccion;
	private String ubicacion;
	private String fechaPeaje;
	private String horaPeaje;
	private String tipoComprobante;
	private String nroComprobante;
	private String categoria;
	private double importe;
	private double igv;
	private double totalIGV;
	private double totalDescuento;
	

	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getFechaPeaje() {
		return fechaPeaje;
	}
	public void setFechaPeaje(String fechaPeaje) {
		this.fechaPeaje = fechaPeaje;
	}
	public String getHoraPeaje() {
		return horaPeaje;
	}
	public void setHoraPeaje(String horaPeaje) {
		this.horaPeaje = horaPeaje;
	}
	public String getTipoComprobante() {
		return tipoComprobante;
	}
	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
	public String getNroComprobante() {
		return nroComprobante;
	}
	public void setNroComprobante(String nroComprobante) {
		this.nroComprobante = nroComprobante;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public double getIgv() {
		return igv;
	}
	public void setIgv(double igv) {
		this.igv = igv;
	}
	public double getTotalIGV() {
		return totalIGV;
	}
	public void setTotalIGV(double totalIGV) {
		this.totalIGV = totalIGV;
	}
	public double getTotalDescuento() {
		return totalDescuento;
	}
	public void setTotalDescuento(double totalDescuento) {
		this.totalDescuento = totalDescuento;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEPeajeDTOSalida [id=");
		builder.append(id);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", ruc=");
		builder.append(ruc);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", ubicacion=");
		builder.append(ubicacion);
		builder.append(", fechaPeaje=");
		builder.append(fechaPeaje);
		builder.append(", horaPeaje=");
		builder.append(horaPeaje);
		builder.append(", tipoComprobante=");
		builder.append(tipoComprobante);
		builder.append(", nroComprobante=");
		builder.append(nroComprobante);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", importe=");
		builder.append(importe);
		builder.append(", igv=");
		builder.append(igv);
		builder.append(", totalIGV=");
		builder.append(totalIGV);
		builder.append(", totalDescuento=");
		builder.append(totalDescuento);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
