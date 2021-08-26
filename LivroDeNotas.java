    public class LivroDeNotas {

       
        private String nomeCurso;

        public void setNomeCurso (String s){
            nomeCurso = s;
        }
        public String getNomeCurso(){
            return nomeCurso;
        }


        public void ExibirMensagem (){
            //System.out.println("Bem vindo ao seu livro de notas");
            System.out.printf("bem vindo ao livro de notas do curso %s!", getNomeCurso());

        }





}
