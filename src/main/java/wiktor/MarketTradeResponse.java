package wiktor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketTradeResponse {
    @JsonProperty("success")
    private boolean success;
    @JsonProperty("rows")
    private List<MarketTrade> rows;

    public int getSize() {
        return rows.size();
    }

    @JsonProperty("success")
    public boolean getSuccess() {
        return this.success;
    }

    @JsonProperty("success")
    public void setSuccess(boolean success) {
        this.success = success;
    }

    @JsonProperty("rows")
    public List<MarketTrade> getRows() {
        return this.rows;
    }

    @JsonProperty("rows")
    public void setRows(List<MarketTrade> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "{" +
            " success='" + success + "'" +
            ", rows='" + getRows() + "'" +
            "}";
    }
}
