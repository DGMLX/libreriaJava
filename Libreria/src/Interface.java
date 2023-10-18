

public interface Interface {
   static final float IVA = 0.19f;
   static final float DESCUENTO_INFANTIL = 0.05f;
   static final float DESCUENTO_DEPORTE = 0.1f;
   
   // Calcular el total a pagar por impuesto sobre la venta
   public void totalAPagar();
   
      //Calcular el descuento según el tipo de libro
   public void calcularDescuento(String titulo);
}
