package secao20;

    abstract class InnerInstrumentoMusical {
    
        protected String nome;

        public InnerInstrumentoMusical(String nome){
            this.nome = nome;
        }
        // Abstrato: Tem que ser implementado na subclasse
        public abstract void tocar();

        // Concreto pode ser herdado

        public void exibirDetalhes(){

          System.out.println("Instrumento: " + nome);  
        }

        
    }

