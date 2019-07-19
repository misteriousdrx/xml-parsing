package com.example.xml;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@JsonDeserialize(using = CustomDeserializer.class)
@XmlRootElement(name="MENS")
public class DataResponse {


    @JsonProperty("ORG-AREA")
    private String orqArea;

    @JsonProperty("CANAL-AREA")
    private String channelArea;

    @JsonProperty("DADOS-NEGOCIO")
    private String businessData;


}

