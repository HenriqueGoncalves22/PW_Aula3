public class Livro{
    //Atributos

    public String titulo;
    public String autor;
    public double valor;
    public Editora editora;
    public int paginas;
    public String resumo;
    public String tipoCapa;

    //Métodos
    public void exibirDadosLivro(){
        System.out.println("------------------");
        System.out.println("Nome: " + titulo);
        System.out.println("Resumo: " + resumo);
        System.out.println("Preço: " + valor);
        System.out.println("Páginas: " + paginas);
        if(temEditora())
           editora.exibirEditora();
    }
    public boolean temEditora() {
        if (editora == null)
            return false;
        else
            return true;
    }

}
