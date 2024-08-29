package com.example.daily_dictation.mapper;

import com.example.daily_dictation.dto.request.RoleRequest;
import com.example.daily_dictation.dto.response.RoleResponse;
import com.example.daily_dictation.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);
    RoleResponse toRoleResponse(Role role);
}
