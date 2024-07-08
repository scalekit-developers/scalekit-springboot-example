package controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class LoginRequest {

    private String connectionId;


    private String organizationId;

    private String email;
}
