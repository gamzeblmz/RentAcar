package com.kodlama.io.rentacar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCorporateCustomerResponse {

    private int id;
    private String mail;
    private String phoneNumber;
    private String taxNumber;
    private String companyName;
    private String contactName;

}
