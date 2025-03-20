public class Main {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa ("Daniel", 'M');
        String nome = "Daniel";
        char sexo = 'M';

        public String sexoDescricao(){
            if (sexo == 'M') {
                return ("Masculino");
            } else if (sexo == 'F'){
                return ("Feminino");
            } else {
                return ("Sexo inválido.");
            }
        }

        System.out.println("Nome: " + nome + " Sexo: " + sexo);

    }
}