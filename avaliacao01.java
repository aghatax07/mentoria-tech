public class avaliacao01 {
    public static void main(String[] args) {
        double n1 = 6.5;
        double n2 = 2.5;
        double n3 = 7.8;
        double n4 = 3.9;
        double n5 = 10.0;
        double n6 = 4.8;
        double n7 = 9.4;
        double n8 = 4.8;

        double mediaBimestre1 = (n1 + n2) / 2;
        double mediaBimestre2 = (n3 + n4) / 2;
        double mediaBimestre3 = (n5 + n6) / 2;
        double mediaBimestre4 = (n7 + n8) / 2;

        double semestre1 = (mediaBimestre1 + mediaBimestre2) / 2;
        double semestre2 = (mediaBimestre3 + mediaBimestre4) / 2;
        System.out.println("Resultado Escolar");
        System.out.printf(" 1º Bimestre: %.2f/n", mediaBimestre1);
        System.out.printf(" 2° Bimestre: %.2f/n", mediaBimestre2);
        System.out.printf(" 1° semestre: %.2f/n", semestre1);

        System.out.printf(" 3° Bimestre: %.2f/n", mediaBimestre3);
        System.out.printf(" 4° Bimestre: %.2f/n", mediaBimestre4);
        System.out.printf(" 2° Semestre: %.2f/n", semestre2);

}
}




