public class CartaoVirtual implements Cloneable {
    private Integer numero;
    private Integer codigoSeguranca;
    private String vencimento;

    private Usuario usuario;

    public CartaoVirtual(Integer numero, Integer codigoSeguranca, String vencimento, Usuario usuario) {
        super();
        this.numero = numero;
        this.codigoSeguranca = codigoSeguranca;
        this.vencimento = vencimento;
        this.usuario = usuario;
    }

    public Integer getNumero() {
        return numero;
    }

    public CartaoVirtual setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }

    public Integer getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public CartaoVirtual setCodigoSeguranca(Integer codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
        return this;
    }

    public String getVencimento() {
        return vencimento;
    }

    public CartaoVirtual setVencimento(String vencimento) {
        this.vencimento = vencimento;
        return this;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public CartaoVirtual setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    @Override
    public CartaoVirtual clone() throws CloneNotSupportedException {
        CartaoVirtual cartaoVirtual = (CartaoVirtual) super.clone();
        return cartaoVirtual;
    }

    @Override
    public String toString() {
        return "Cartao Virtual{" +
                "numero=" + numero +
                ", codigo seguranca=" + codigoSeguranca +
                ", vencimento='" + vencimento + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
