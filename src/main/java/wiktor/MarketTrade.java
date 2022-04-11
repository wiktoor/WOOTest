package wiktor;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketTrade {
    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("side")
    private String side;

    @JsonProperty("executed_price")
    private int executed_price;

    @JsonProperty("executed_quantity")
    private double executed_quantity;

    @JsonProperty("executed_timestamp")
    private double executed_timestamp;

    @JsonProperty("symbol")
    public String getSymbol() {
        return this.symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("side")
    public String getSide() {
        return this.side;
    }

    @JsonProperty("side")
    public void setSide(String side) {
        this.side = side;
    }

    @JsonProperty("executed_price")
    public int getExecuted_price() {
        return this.executed_price;
    }

    @JsonProperty("executed_price")
    public void setExecuted_price(int executed_price) {
        this.executed_price = executed_price;
    }

    @JsonProperty("executed_quantity")
    public double getExecuted_quantity() {
        return this.executed_quantity;
    }

    @JsonProperty("executed_quantity")
    public void setExecuted_quantity(double executed_quantity) {
        this.executed_quantity = executed_quantity;
    }

    @JsonProperty("executed_timestamp")
    public double getExecuted_timestamp() {
        return this.executed_timestamp;
    }

    @JsonProperty("executed_timestamp")
    public void setExecuted_timestamp(double executed_timestamp) {
        this.executed_timestamp = executed_timestamp;
    }

    @Override
    public String toString() {
        return "{" +
            " symbol='" + getSymbol() + "'" +
            ", side='" + getSide() + "'" +
            ", executed_price='" + getExecuted_price() + "'" +
            ", executed_quantity='" + getExecuted_quantity() + "'" +
            ", executed_timestamp='" + getExecuted_timestamp() + "'" +
            "}";
    }
}
