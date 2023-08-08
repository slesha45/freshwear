package com.system.freshWear_ecommerce_system.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    private int itemId;
    private String itemName;
    private double itemPrice;
    private String itemDescription;
    private int itemQuantity;
    private int categoryId;
    private MultipartFile itemImage;
}
