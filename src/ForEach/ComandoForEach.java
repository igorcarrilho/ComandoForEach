package ForEach;

public class ComandoForEach {
    public static void main(String[] args) {
        //Vamos criar um vetor, carregá-lo já inicializado e em seguida vamos ler os elementos dos vetores usando
        // um For Each

        int[] vetorNumeros = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //varrendo o vetor sem o For Each
        System.out.println("Varendo o vetor sem For Each");
        for(int i = 0; i < vetorNumeros.length; i++){
            System.out.println("Número: " + vetorNumeros[i]);
        }

        //varrendo o vetor usando o For Each
        System.out.println("Varendo o vetor com For Each");
        for (int listaNumeros : vetorNumeros) {
            System.out.println("Número: " + listaNumeros);
        }
    }
}
