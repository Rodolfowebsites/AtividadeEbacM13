public class teset {

    public static void main(String[] args) {

        PessoaJuridica pj = new PessoaJuridica();
        pj.cnpj = 12312312;
        pj.nome = "Rodolfo";
        System.out.println(pj);

        PessoaFisica pf = new PessoaFisica();
        pf.cpf = 1231231.0;
        pf.nome = "Jubileu";
        System.out.println(pf);
    }
}
