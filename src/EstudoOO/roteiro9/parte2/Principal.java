package EstudoOO.roteiro9.parte2;

public class Principal {
    public static void main(String[] args) {

        Circulo c = new Circulo(6);

        System.out.println("Nome da figura: " + c.getNomeFigura());
        System.out.println("Raio: " + c.getRaio());
        System.out.println("Área: " + c.getArea());
        System.out.println("Perímetro: " + c.getPerimetro());
    }
}
