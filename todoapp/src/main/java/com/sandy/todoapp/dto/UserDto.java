package com.sandy.todoapp.dto;

import com.sandy.todoapp.enums.Subscriptions;

public record UserDto (
        String userName,
        Subscriptions subscriptions,
        String email
){}