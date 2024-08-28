package com.example.daily_dictation.mapper;

import com.example.daily_dictation.dto.request.PermissionRequest;
import com.example.daily_dictation.dto.response.PermissionResponse;
import com.example.daily_dictation.model.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
