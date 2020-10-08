package com.hlf.books.config;



import com.coxautodev.graphql.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfig {

    @Bean
    GraphQLSchema graphqlString(SchemaParser parser) {
        return parser.makeExecutableSchema();
    }
}
