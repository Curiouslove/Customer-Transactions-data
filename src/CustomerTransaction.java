import java.math.BigDecimal;
import java.time.LocalDate;

public record CustomerTransaction(int id, int customerId, BigDecimal amount, LocalDate dateCreated){
    public String getYearMonth(LocalDate date){
        return "" + date.getYear() + "-" + String.format("%02d", date.getMonthValue());
    }
}
