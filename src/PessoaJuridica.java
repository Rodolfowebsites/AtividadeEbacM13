public class PessoaJuridica extends Pessoa{

   public double cnpj;

   public double getCnpj() {
      return cnpj;
   }

   public void setCnpj(double cnpj) {
      this.cnpj = cnpj;
   }

   @Override
   public String toString() {
      return "PessoaFisica{" +
              "cnpj=" + cnpj +
              ", nome='" + nome + '\'' +
              '}';
   }
}
