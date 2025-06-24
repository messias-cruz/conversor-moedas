import java.io.IOException;

public class Conversor {
    public static double converter(String de, String para, double valor) throws IOException, InterruptedException {
        double taxa = ApiCliente.buscarTaxa(de, para);
        return valor * taxa;
    }
}
