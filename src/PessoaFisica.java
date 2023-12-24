public class PessoaFisica extends Pessoa {
   public Double cpf;

   public Double getCpf() {
      return cpf;
   }

   public void setCpf(Double cpf) {
      this.cpf = cpf;
   }

   @Override
   public String toString() {
      return "PessoaFisica{" +
              "cpf=" + cpf +
              ", nome='" + nome + '\'' +
              '}';
   }
}
