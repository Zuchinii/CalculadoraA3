
public class Profissional {
   public String Nome;
   public double SalarioMensal;

   private int diasUteis = 20;
   private double fhd = 7;

   public double horasUteisMes = diasUteis * fhd;

   public double CalculaValorHora() {
      return ((SalarioMensal * 2) / horasUteisMes);
   }


   public void setNome(String nome) {
      Nome = nome;
   }


   public void setSalarioMensal(double salarioMensal) {
      SalarioMensal = salarioMensal;
   }
}