public class testeForma {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Circulo circulo = new Circulo(3);

        System.out.println("Área Quadrada: " + quadrado.calcularArea());
        System.out.println("Área Circulo: " + circulo.calcularArea());
    }
}
