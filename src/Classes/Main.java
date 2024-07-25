package Classes;

public class Main {
    public static void main(String[] args) {
    PessoaFisica pf = new PessoaFisica("Deiner","(64)9949-9598","deinersouza.tmsi@gmail.com", "Rua Vinhedos 3/4 ", "000.000.000-00", 23, "Masculino");
    PessoaJuridica pj = new PessoaJuridica("(77)9954-6674","Comerciodeflores@dominio.com", "Rua Castelo branco",pf, "Comercio de FloresLTDA","0000.0000.0000/00001-1", "Floricultura Castelo");


    System.out.println(pf.toString());
    System.out.println(pj.toString());
    }
}