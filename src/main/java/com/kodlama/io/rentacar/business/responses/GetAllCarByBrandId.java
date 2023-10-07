package com.kodlama.io.rentacar.business.responses;

import com.kodlama.io.rentacar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCarByBrandId {
   private String plate;
   private double dailyPrice;
   private String imageUrl;
   private int modelYear;
   private int state;
   private String modelName;
}
