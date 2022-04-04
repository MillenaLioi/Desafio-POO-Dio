
public class mentoria extends Conteudo {
    private LocalDate data;

   public LocalDate getData() {
       return data;
   }

   public void setData(LocalDate data) {
       this.data = data;
   } 

   @Override
   public double calcularXp() {
       return XP_PADRAO + 20d;
   }

   @Override
   public String toString() {
       return "Mentoria{" +
       "titulo='" + getTitulo() + '\'' +
       ", descricao='" + getDescricao() + '\'' +
       ", data=" + data +
       '}';
   }
}