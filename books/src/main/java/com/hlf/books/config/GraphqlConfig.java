package com.hlf.books.config;



import com.coxautodev.graphql.tools.SchemaParser;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static graphql.Scalars.GraphQLLong;

@Configuration
public class GraphqlConfig {

    @Bean
    public GraphQLScalarType registerLongType() {
        return GraphQLLong;
    }

    @Bean
    GraphQLSchema graphqlString(SchemaParser parser) {
        return parser.makeExecutableSchema();
    }
}
