package com.example.daily_dictation.mapper;

import com.example.daily_dictation.dto.request.UserCreationRequest;
import com.example.daily_dictation.dto.request.UserUpdateRequest;
import com.example.daily_dictation.dto.response.UserResponse;
import com.example.daily_dictation.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
