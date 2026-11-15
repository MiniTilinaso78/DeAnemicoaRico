// CÓDIGO ANÉMICO (A EVITAR)
public class ProcesadorPagos {
    public void procesarRetiro(CuentaAhorros cuenta, double monto) {
        if (cuenta.getSaldo() &gt;= monto) {
            double nuevoSaldo = cuenta.getSaldo() - monto;
            cuenta.setSaldo(nuevoSaldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
