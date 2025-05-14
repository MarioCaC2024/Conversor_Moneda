import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi  {
       ServicioApi buscaServicio(String base ,
                                 String target ,
                                 double importe) {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/fd6934cb362d44ef246a1ac0/pair/"+base+"/"+target+"/"+importe);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

           try {
               HttpResponse<String> response = client
                       .send(request, HttpResponse.BodyHandlers.ofString());
               return new Gson().fromJson(response.body(), ServicioApi.class);
           } catch (IOException | InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
}
