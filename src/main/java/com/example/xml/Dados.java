package com.example.xml;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Dados {

    @JsonProperty("DADO-01")
    private String dado1;

    @JsonProperty("DADO-02")
    private String dado2;

    @JsonProperty("DADO-03")
    private String dado3;

}
