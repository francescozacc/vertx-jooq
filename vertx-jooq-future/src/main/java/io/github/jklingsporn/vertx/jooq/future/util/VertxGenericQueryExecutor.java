package io.github.jklingsporn.vertx.jooq.future.util;

import io.vertx.core.Vertx;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/**
 * Created by jensklingsporn on 05.02.18.
 */
public class VertxGenericQueryExecutor {

    private final Vertx vertx;
    private final Configuration configuration;

    public VertxGenericQueryExecutor(Vertx vertx, Configuration configuration) {
        this.vertx = vertx;
        this.configuration = configuration;
    }

    public <X> CompletableFuture<X> executeAsync(Function<DSLContext, X> function){
        return FutureTool.executeBlocking(h -> h.complete(function.apply(DSL.using(configuration))),vertx);
    }
}
