package exercicio03;

import java.math.BigDecimal;

public class Pedido {

	private Long codigo;
	private BigDecimal subtotal;
	private BigDecimal desconto;
	
    public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	
	public BigDecimal getDesconto() {
		return desconto;
	}
	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}
	
	public BigDecimal getTotal() {
		return subtotal.subtract(desconto);
	}
	
}
