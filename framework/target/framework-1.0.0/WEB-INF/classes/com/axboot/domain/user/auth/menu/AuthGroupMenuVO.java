package com.axboot.domain.user.auth.menu;

import lombok.Data;

import java.util.List;

import com.axboot.domain.program.Program;

@Data
public class AuthGroupMenuVO {

    private List<AuthGroupMenu> list;

    private Program program;
}
