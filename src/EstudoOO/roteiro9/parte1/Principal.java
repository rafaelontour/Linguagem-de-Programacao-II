package EstudoOO.roteiro9.parte1;

public class Principal {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(5);
        Retangulo r = new Retangulo(2, 4);

        System.out.println("Nome da figura: " + q.getNomeFigura());
        System.out.println("Área: " + q.getArea() + " m²");
        System.out.println("Lado: " + q.getLado());
        System.out.println("Perímetro: " + q.getPerimetro());

        System.out.println("\nNome da figura: " + r.getNomeFigura());
        System.out.println("Área: " + r.getArea() + " m²");
        System.out.println("Largura: " + r.getLargura());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Perímetro: " +r.getPerimetro());
    }
}
