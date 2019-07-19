package com.example.xml;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.dataformat.xml.deser.XmlStringDeserializer;

import java.io.IOException;

public class CustomDeserializer extends JsonDeserializer<DataResponse> {


    @Override
    public DataResponse deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {

        ObjectCodec codec = jp.getCodec();
        TreeNode treeNode = codec.readTree(jp);

        DataResponse response = new DataResponse();

        response.setOrqArea(treeNode.get("ORG-AREA").toString());
        response.setChannelArea(treeNode.get("CANAL-AREA").toString());
        response.setBusinessData(treeNode.get("DADOS-NEGOCIO").toString());


        return response;
    }
}
