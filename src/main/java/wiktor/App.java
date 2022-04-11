package wiktor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.client.utils.URIBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        testAvailableSymbols();
        testMarketTrades();
        // testAccountInformation();
    }

    public static void testAvailableSymbols() throws Exception {
        final String AVAILABLE_SYMBOLS_URL = "https://api.woo.org/v1/public/info";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create(AVAILABLE_SYMBOLS_URL))
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    public static void testMarketTrades() throws Exception {
        final String MARKET_TRADES_URL = "https://api.woo.org/v1/public/market_trades";
        HttpClient client = HttpClient.newHttpClient();
        URI uri = new URIBuilder(MARKET_TRADES_URL)
            .addParameter("symbol", "SPOT_BTC_USDT")
            .addParameter("limit", "2")
            .build();
        System.out.println(uri);
        HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(uri)
            .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper mapper = new ObjectMapper();
        MarketTradeResponse mtr = mapper.readValue(response.body(), MarketTradeResponse.class);
        for (int i = 0; i < mtr.getSize(); i++) {
            MarketTrade mt = mtr.getRows().get(i);
            System.out.println(mt.getSide() + " " + String.valueOf(mt.getExecuted_price()));
        }
    }

    public static void testAccountInformation() throws Exception {
        final String ACCOUNT_INFORMATION_URL = "https://api.woo.org/v1/client/info";
        long timestamp = System.currentTimeMillis() / 1000L;

        URI uri = new URIBuilder(ACCOUNT_INFORMATION_URL)
            .setCustomQuery("|" + String.valueOf(timestamp))
            .build();
        System.out.println(uri);
    }
}