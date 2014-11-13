
public class Portiere {
    private final HtmlGenerator htmlGenerator;

    public Portiere(HtmlGenerator htmlGenerator) {
        this.htmlGenerator = htmlGenerator;
    }

    public String saluta(String nome) {
        return htmlGenerator.h1("Ciao " + nome);
    }
}
