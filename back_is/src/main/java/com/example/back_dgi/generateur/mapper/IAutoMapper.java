package com.example.back_dgi.generateur.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface IAutoMapper<T, DTO> {
    DTO toDto(T item);

    List<DTO> toDtos(List<T> items);

    List<T> toItems(List<DTO> dtos);

    T toItem(DTO dto);
}
