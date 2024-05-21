public class CuentaBancaria {

	private String nombreTitular;
    private String dniTitular;
    private String codigoCuenta;
    private double saldo;

    public CuentaBancaria(String nombreTitular, String dniTitular, String codigoCuenta, double saldoInicial) {
        this.nombreTitular = nombreTitular;
        this.dniTitular = dniTitular;
        this.codigoCuenta = codigoCuenta;
        this.saldo = saldoInicial;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public String getCodigoCuenta() {
        return codigoCuenta;
    }

    public String getCodigoEntidad() {
        return codigoCuenta.substring(0, 4);
    }

    public String getCodigoSucursal() {
        return codigoCuenta.substring(4, 8);
    }

    public String getNumeroCuenta() {
        return codigoCuenta.substring(8, 20);
    }

    public String getDigitosControl() {
        return codigoCuenta.substring(18, 20);
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }
}
