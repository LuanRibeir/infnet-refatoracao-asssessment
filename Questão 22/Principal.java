public class Principal {
    public static void main(String[] args) {
        String[] nomes = { "Gabriel", "Heitor", "Fabio", "Breno" };
        double[] notas1 = { 9, 6, 6, 7 };
        double[] notas2 = { 6, 6, 5, 9 };
        double[] medias = new double[4];

        for (int i = 0; i < nomes.length; i++) {
            medias[i] = (notas1[i] + notas2[i]) / 2;
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Média: " + medias[i]);
        }
    }
}
