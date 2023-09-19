package edu.aldeny.segundasemana.estruturasexcecoes;

public class FormatadorCepExemplo {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("4072001");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("O cep não corresponde com as regras de negocios");
        }


    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return cep;
    }
}
