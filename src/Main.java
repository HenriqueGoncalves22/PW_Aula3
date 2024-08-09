public class Main {
    public static void main(String[] args) {
        //Criar um  Objeto = Instanciar um Objeto
        Editora Lafonte = new Editora();
        Lafonte.nome = "Lafonte";
        Lafonte.site = "https://www.lafonte.com.br/pt/index";
        Lafonte.email = "sac.assaabloy@assaabloy.com";

        Livro meuLivro = new Livro();
        meuLivro.titulo = "Harry Potter";
        meuLivro.autor = "J.K.";
        meuLivro.editora = Lafonte;
        meuLivro.paginas = 208;
        meuLivro.resumo = "É um bruxo...";
        meuLivro.tipoCapa = "Comum";
        meuLivro.valor = 35.99;
        System.out.println(meuLivro.titulo + " escrito por " + meuLivro.autor + " custa " + meuLivro.valor + "\nPublicado por:" + meuLivro.editora.nome);
        Livro melhorLivro = new Livro();
        melhorLivro.titulo = "O Príncipe - Edição de Luxo";
        melhorLivro.autor = "Nicolau Maquiavel";
        melhorLivro.editora = Lafonte;
        melhorLivro.paginas = 96;
        melhorLivro.resumo = "Publicado em 1532 pelo controverso e complexo filósofo Maquiavel, O Príncipe traz uma abordagem direta e desapaixonada acerca da natureza e do poder político.\n Neste tratado, o autor defende conceitos pragmáticos, entre os quais a ideia de um governante ser capaz de agir sem restrições morais \n para manter o controle de seu estado. Com base em exemplos históricos e em sua própria experiência como diplomata,Maquiavel também oferece conselhos \n práticos sobre como conquistar e manter o poder, reforçando, ainda, a importância de manter a lealdade do povo e dos aliados. \n Trata-se de um livro que oferece uma visão única e fascinante do mundo político de sua época, repleta de intrigas, conflitos e traições. Esta edição especial\n traz capa dura com acabamento almofadado, conferindo um toque de elegância e durabilidade à obra. Além disso, inclui um marcador de páginas de fitilho, \nproporcionando aos leitores uma experiência ainda mais prazerosa. Uma obra indispensável na biblioteca de qualquer leitor.";
        melhorLivro.tipoCapa = "Capa Dura";
        melhorLivro.valor = 19.90;
        System.out.println("\n" +melhorLivro.titulo + " escrito por " + melhorLivro.autor + " custa " + melhorLivro.valor + "\n"
                + "Resumo: \n" + melhorLivro.resumo);
        System.out.println("\n" +" Distribuída por " + Lafonte.nome +  "\n" + " Contato: " +  Lafonte.email + "\n"
                + " Visite a editora em: " + Lafonte.site);
    }
}