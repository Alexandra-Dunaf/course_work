package ru.dunaf.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JWTTokenSuccesResponse {

    private boolean succes;
    private String token;

}
