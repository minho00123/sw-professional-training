package com.sts.userapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVo {
    int num;
    String name, email;

    // @JsonIgnore (X) - UserRequestVo
    // @JsonIgnore (O) - UserResponseVo
    String pw;
}
