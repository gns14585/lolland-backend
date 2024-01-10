package com.example.lollandback.member.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
    private String member_login_id;
    private String member_password;
    private String member_name;
    private String member_phone_number;
    private String member_email;
    private String member_type;
}
