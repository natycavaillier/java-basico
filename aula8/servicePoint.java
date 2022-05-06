package aula8;

public class servicePoint {
    public static void main(String[] args) {

        Pessoa pessoaFisica = new Pessoa();

        pessoaFisica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pessoaFisica.setNumeroDocumento(pessoaFisica.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pessoaFisica);

        Pessoa pessoaJuridica = new Pessoa();
        
        pessoaJuridica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pessoaJuridica.setNumeroDocumento(pessoaJuridica.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pessoaJuridica);
    }
}
