package com.devsuperior.dscommerce.dto;


import com.devsuperior.dscommerce.entities.Product;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;




public class ProductDTO {

    private Long id;

    @Size(min = 3, max = 80, message = "O nome precisa ter no mínimo 3 caracteres.")
    @NotBlank(message = "Campo requerido.")
    private String name;


    @NotBlank(message = "Campo requerido.")
    @Size(min = 10, message = "Descrição precisa ter no mínimo 10 caracteres.")
    private String description;

    @Positive(message = "O nome deve ser positivo.")
    private Double price;
    private String imgUrl;


    public ProductDTO() {}

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
