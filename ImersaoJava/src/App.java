import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) throws Exception {


        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        
        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println("\u001b[44m\u001b[1mTítulo\u001b[m" + ": " + filme.get("title"));
            System.out.println("\u001b[42m\u001b[1mURL da Imagem\u001b[m"+ ": " +filme.get("image"));
            System.out.println("\u001b[43m\u001b[1mNota de Avaliação\u001b[m"+": "+filme.get("imDbRating"));
            double classificacao = Double.parseDouble(filme.get("imDbRating"));
            int numeroEstrelas = (int) classificacao;
            for (int n = 1; n <= numeroEstrelas; n++){
                System.out.print("⭐");    
            
            }

            System.out.println("\n");
            System.out.print("Teste");
        }

    }
}