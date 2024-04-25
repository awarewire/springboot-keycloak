package com.awarewire.api.rest.controller.dto;

import lombok.Builder;

import java.io.Serializable;
import java.util.Set;

@Builder
public record UserDTO(String username, String email, String firstName, String lastName, String password,
                      Set<String> roles) implements Serializable {

}
