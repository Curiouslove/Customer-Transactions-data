import java.math.BigDecimal;

public class CustomerTransactionResponse {
    private int id;
    private String name;
    private BigDecimal totalAmount;
    private String yearMonth;
    private static int count = 0;

    public CustomerTransactionResponse() {
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    @Override
    public String toString() {
        return "CustomerTransactionResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalAmount=" + totalAmount +
                ", yearMonth='" + yearMonth + '\'' +
                '}';
    }
}
