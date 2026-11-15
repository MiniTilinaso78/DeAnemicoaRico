public class CuentaAhorros {
    String nombre;
    double saldo;
    public void retirar(double monto){
        if (this.saldo>=monto && monto>0){
            this.saldo-=monto;
        } else if (monto<=0) {
            System.out.println("El monto no puede ser menor a cero");

        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
