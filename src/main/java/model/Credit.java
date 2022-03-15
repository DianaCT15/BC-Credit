package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("credit")

public class Credit {
	@Id
    private String id;
    private String idCustomer;
    private String creditBalance;
    private String creditLimit;
    private CreditType creditType;

}
