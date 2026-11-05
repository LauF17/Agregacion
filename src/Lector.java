public class Lector {
   private String nombre;
   private String cedula;
   private Libro libroActual;

   public Lector() {
   }

   public Lector(String var1, String var2) {
      this.nombre = var1;
      this.cedula = var2;
   }

   public String getNombre() {
      return this.nombre;
   }

   public String getCedula() {
      return this.cedula;
   }

   public Libro getLibroActual() {
      return this.libroActual;
   }

   public void setNombre(String var1) {
      this.nombre = var1;
   }

   public void setCedula(String var1) {
      this.cedula = var1;
   }

   public void tomarPrestado(Libro var1) {
      if (this.libroActual != null) {
         String var10001 = this.nombre;
         System.out.println(var10001 + "ya tiene el libro\"" + this.libroActual.getTitulo() + "\". Debe devolver primero.");
      } else if (var1.prestar()) {
         this.libroActual = var1;
      }

   }

   public void regresarLibro() {
      if (this.libroActual == null) {
         System.out.println(this.nombre + " no tiene ningun libro.");
      } else {
         this.libroActual.devolver();
         this.libroActual = null;
      }

   }

   public void mostrarEstado() {
      String var1 = this.libroActual != null ? this.libroActual.getTitulo() : "sin libro";
      System.out.println("Lector: " + this.nombre + "| Libro: " + var1);
   }
}

