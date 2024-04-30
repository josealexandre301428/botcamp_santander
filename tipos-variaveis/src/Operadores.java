public class Operadores {
    public static void main(String[] args) throws Exception {
        //Atribuição representado pelo =
        String nome = "José";
        int idade = 24;
        double peso = 84.5;
        char sexo = 'M';
        boolean doadorOrgao = true;

        //Aritiméticos, são +(adição), -(subtração), *(Multiplicação) e /(Divisão)
        double soma = 10.5 + 15.7;
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        int divisao = 10 / 5;
        int resto = 10 % 5;
        double resultado = (10 * 5) + (20 / 2);
        double potencia = 2 ^ 3;
        double raizQuadrada = Math.sqrt(25);
        double raizCubica = Math.cbrt(125);
        double logaritmo = Math.log(10);
        // operadores unarios, são ++ (incremento), -- (decremento) e positivo ou negativo;
        // por padrao o numero ja vem positivo
        int numeroPositivo = 10;
        int numeroNegativo = -10;
        numeroPositivo++;
        numeroNegativo--;        
        //operador ternario, são ? (se) : (senao)
        int numero = 10;
        String resultadoOperador = numero % 2 == 0 ? "Par" : "Impar";

        //operadores relacionais, são > (maior que), < (menor que), >= (maior ou igual a), <= (menor ou igual a), == (igual a), != (diferente de)
        int numero1 = 10;
        int numero2 = 20;
        boolean resultadoRelacional = numero1 > numero2;
        boolean resultadoRelacional2 = numero1 < numero2;


        //operadores logicos, são && (e), || (ou), ! (nao)
        boolean resultadoLogico = true && false;
        boolean resultadoLogico2 = true || false;
        boolean resultadoLogico3 = !true;
        boolean resultadoLogico4 = !false;
        boolean resultadoLogico5 = !(true && false);

    


    }
}
