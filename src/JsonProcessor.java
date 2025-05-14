import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonProcessor {
    // Propiedades
    private Gson gson;
    private Double importe;

    // Constructor

    public JsonProcessor() {
        this.gson = new Gson();
        this.importe = importe;
    }

    // Metodos
    public void mostrarValores (String jsonString , Double importe) {
        JsonObject jsonObject = gson.fromJson(jsonString , JsonObject.class);
        String monedaBase = jsonObject.get("base_code").getAsString();
        String monedaTarget = jsonObject.get("target_code").getAsString();
        Double monedaCotiza = jsonObject.get("conversion_rate").getAsDouble();
        Double monedaResult = jsonObject.get("conversion_result").getAsDouble();
        System.out.println("La cotizacion de 1 [" + monedaBase + "] es ==> " + monedaCotiza + " [" + monedaTarget + "]");
        System.out.println("El valor de " + importe + "[" + monedaBase +
                           "] corresponde al valor final de ==> " + monedaResult +
                           " [" + monedaTarget + "]");
    }
}


