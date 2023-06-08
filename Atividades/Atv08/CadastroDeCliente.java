public class CadastroDeClientes(args){
    public static void main(String[] args){
        Client cliente = new Client();

        cliente.cod = 01;
        cliente.nome = "joao pedroso";
        cliente.data_nascimento = "19/12/03";
        cliente.endereco = "rua dos quadrados,904";
        cliente.cidade = "cascacity";
        cliente.estado = "stop in the";
        cliente.cep = "8586078";
        cliente.email = "hackerdocsgo46@gmail.com";
        cliente.credito = "347";

        System.out.println(cliente.cod);
        System.out.println(cliente.nome);
        System.out.println(cliente.data_nascimento);
        System.out.println(cliente.endereco);
        System.out.println(cliente.cidade);
        System.out.println(cliente.estado);
        System.out.println(cliente.cep);
        System.out.println(cliente.email);
        System.out.println(cliente.credito);
    }
}