package com.digvijay.cartifyx.product.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
@Entity
public class ProductCategory {
    @Id
    @Column(name = "product_category_id")
    private UUID productCategoryId;
    @Column(name="category_name")
    private String categoryName;
}
