package com.servisoport.medical.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    int id;
    String username;
    String firstname;
    String lastname;
    String country;
}
