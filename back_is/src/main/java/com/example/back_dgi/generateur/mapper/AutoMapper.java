package com.example.back_dgi.generateur.mapper;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AutoMapper<T, DTO> implements IAutoMapper<T, DTO> {
    protected Class<DTO> myDto;
    protected Class<T> myItem;

    public AutoMapper(Class<T> myItem, Class<DTO> myDto) {
        this.myDto = myDto;
        this.myItem = myItem;
    }


    @Override
    public DTO toDto(T item) {
        DTO dto = null;
        try {
            dto = this.myDto.getConstructor(null).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (dto != null)
            BeanUtils.copyProperties(item, dto);
        return dto;
    }


    @Override
    public List<DTO> toDtos(List<T> items) {
        if (items != null) {
            return items.stream().map(e -> toDto(e)).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }

    @Override
    public List<T> toItems(List<DTO> dtos) {
        if (dtos != null) {
            return dtos.stream().map(e -> toItem(e)).collect(Collectors.toList());
        }
        return new ArrayList<>();
    }


    @Override
    public T toItem(DTO dto) {
        T item = null;
        try {
            item = this.myItem.getConstructor(null).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (item != null)
            BeanUtils.copyProperties(dto, item);
        return item;
    }


}
