import java.util.Map;

public record ExchangeRates(String base_code, Map<String, Double> conversion_rates) {
}
