package ru.practicum.explore.main.category.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class NewCategoryDto {
    @NotBlank(message = "Имя категории отсутствует или представлено пустым символом")
    @Size(max = 50)
    private String name;
}