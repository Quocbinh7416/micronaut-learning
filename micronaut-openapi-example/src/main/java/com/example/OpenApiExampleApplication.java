package com.example;

import com.example.util.CombineYamlFile;
import com.example.util.MergeHashMap;
import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

import java.util.HashMap;

@OpenAPIDefinition(
        info = @Info(
                title = "micronaut-openapi-example",
                version = "${api.version}"
        )
)
public class OpenApiExampleApplication {
    public static void main(String[] args) {
//        MergeHashMap.doMergeHashMap2();
        CombineYamlFile.readSwagger();
        Micronaut.run(OpenApiExampleApplication.class, args);
    }

}
