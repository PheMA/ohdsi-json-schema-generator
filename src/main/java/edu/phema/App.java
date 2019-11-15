package edu.phema;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;
import org.ohdsi.circe.cohortdefinition.CohortExpression;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        ObjectMapper mapper = new ObjectMapper();
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        JsonSchema schema = schemaGen.generateSchema(CohortExpression.class);

        System.out.println(mapper.writeValueAsString(schema));
    }
}
