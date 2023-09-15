package edu.aldeny.primeirasemana;

public class Main {
    public static void main(String[] args) {
        String primeiroNome = "Aldeny";
        String segundoNome = "Junior";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segungoNome){
        return primeiroNome.concat(" ").concat(segungoNome);
    }
}