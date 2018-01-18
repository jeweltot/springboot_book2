package com.jeweltot.spring.util;

import java.io.IOException;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonDateSerializer extends JsonSerializer
{
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void serialize(Object date, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException
    {
        String formatterDate = dateFormat.format(date);
        gen.writeString(formatterDate);
    }
}
