package EstudoOO.roteiro1.parte2;

public class calculoSalario {
    public static void main(String[] args) {
        double salario = 2500;
        int horasExtras = 10;

        System.out.println("Salário base: R$" + salario);
        System.out.println("Horas extras feitas: " + horasExtras);
        System.out.println("Salário com extra: R$" + (salario + (horasExtras * 625)));
    }
}
