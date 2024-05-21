import java.util.ArrayList;
import java.util.List;

public class CodigosCuenta {
    private List<CuentaBancaria> codigocuenta;

    public CodigosCuenta() {
        this.codigocuenta = new ArrayList<>();

        this.codigocuenta.add(new CuentaBancaria("Juan Parez", "147852369G", "XXXX-XXXX-XX-XXXXXXXXXX", 500.0));
        this.codigocuenta.add(new CuentaBancaria("Juan hernandez", "147852229G", "XXXX-XXXX-XX-XXXXXXXXXX", 2500.0));
        this.codigocuenta.add(new CuentaBancaria("Juan pepito", "147800069G", "XXXX-XXXX-XX-XXXXXXXXXX", 1500.0));
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        if (buscarCuenta(cuenta.getCodigoCuenta()) != null) {
            System.out.println("La cuenta con el código " + cuenta.getCodigoCuenta() + " ya existe.");
        } else {
            this.codigocuenta.add(cuenta);
            System.out.println("Cuenta agregada correctamente.");
        }
    }

    public CuentaBancaria buscarCuenta(String codigo) {
        for (CuentaBancaria cuenta : this.codigocuenta) {
            if (cuenta.getCodigoCuenta().equals(codigo)) {
                return cuenta;
            }
        }
        return null;
    }
}