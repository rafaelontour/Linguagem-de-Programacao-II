package EstudoOO.roteiro8.parte3;

public class Principal {
    public static void main(String[] args) {

        VeiculoCarga v02 = new VeiculoCarga("22222-BA", 2011, 5000);
        VeiculoPasseio v03 = new VeiculoPasseio("33333-BA", 2012, 5);
        VeiculoPequeno v04 = new VeiculoPequeno("33333-BA", 2012, "moto");

        Cliente cliente = new Cliente("04357682510", "Rodolfo", "Rua 4", "rodolfo@gmail.com", "72999987764",v02);
        Cliente cliente02 = new Cliente("09357613540", "Arlindo", "Rua Branco Palmero", "arlindo@gmail.com", "74957987182");
        Cliente cliente03 = new Cliente("05657713290", "Mauro", "Rua Velho Brás ", "mauroRJ@hotmail.com", "79957980061");
        cliente.setVeiculo(v04);
        cliente02.setVeiculo(v02);
        cliente03.setVeiculo(v04);


        System.out.println("      Dados do cliente\n***************************");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf_cnpj());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Tipo de veículo: " + cliente.getVeiculo().tipoVeiculo());
        System.out.println("Valor a ser pago no pedágio: R$" + cliente.getVeiculo().calcPedagio());
        System.out.println("********************************\n");

        System.out.println("      Dados do cliente\n***************************");
        System.out.println("Nome: " + cliente02.getNome());
        System.out.println("CPF: " + cliente02.getCpf_cnpj());
        System.out.println("Endereço: " + cliente02.getEndereco());
        System.out.println("Telefone: " + cliente02.getTelefone());
        System.out.println("Email: " + cliente02.getEmail());
        System.out.println("Tipo de veículo: " + cliente02.getVeiculo().tipoVeiculo());
        System.out.println("Valor a ser pago no pedágio: R$" + cliente02.getVeiculo().calcPedagio());
        System.out.println("********************************\n");

        System.out.println("      Dados do cliente\n***************************");
        System.out.println("Nome: " + cliente03.getNome());
        System.out.println("CPF: " + cliente03.getCpf_cnpj());
        System.out.println("Endereço: " + cliente03.getEndereco());
        System.out.println("Telefone: " + cliente03.getTelefone());
        System.out.println("Email: " + cliente03.getEmail());
        System.out.println("Tipo de veículo: " + cliente03.getVeiculo().tipoVeiculo());
        System.out.println("Valor a ser pago no pedágio: R$" + cliente03.getVeiculo().calcPedagio());
        System.out.println("********************************\n");

        System.out.println("Pedágio v02 : " + v02.calcPedagio());
        System.out.println("Pedágio v03 : " + v03.calcPedagio());
        System.out.println("Pedágio v04 : " + v04.calcPedagio());
    }
}
