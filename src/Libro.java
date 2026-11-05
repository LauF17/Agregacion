public class Libro {
   private String titulo;
   private String autor;
   private boolean disponible;

   public Libro() {
      this.disponible = true;
   }

   public Libro(String var1, String var2) {
      this.titulo = var1;
      this.autor = var2;
      this.disponible = true;
   }

   public Libro(String var1, String var2, boolean var3) {
      this.titulo = var1;
      this.autor = var2;
      this.disponible = var3;
   }

   public String getTitulo() {
      return this.titulo;
   }

   public String getAutor() {
      return this.autor;
   }

   public boolean isDisponible() {
      return this.disponible;
   }

   public void setTitulo(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.titulo = var1;
      } else {
         System.out.println("Error: el titulo no puede estar vacio.");
      }

   }

   public void setAutor(String var1) {
      this.autor = var1;
   }

   public void setDisponible(boolean var1) {
      this.disponible = var1;
   }

   public void mostrarInfo() {
      System.out.println("---- Libro----");
      String var10001 = this.titulo;
      System.out.println("Titulo  :" + var10001);
      var10001 = this.autor;
      System.out.println("Autor  :" + var10001);
      System.out.println("Disponible :" + (this.disponible ? "Si" : "No"));
   }

   public boolean prestar() {
      if (this.disponible) {
         this.disponible = false;
         System.out.println("El libro\"" + this.titulo + "\"fue prestado.");
         return true;
      } else {
         System.out.println("El libro \"" + this.titulo + "\"ya esta prestado");
         return false;
      }
   }

   public void devolver() {
      this.disponible = true;
      System.out.println("El libro \"" + this.titulo + "\"fue devuelto.");
   }
}


