package com.splitwise.microservices.user_service.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginResponse {
    private String jwtToken;
    private Long userId;
    private String userName;
    private String fullUserName;
    //private List<String> roles;
}