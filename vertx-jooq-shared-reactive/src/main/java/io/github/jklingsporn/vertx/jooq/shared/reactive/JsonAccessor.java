package io.github.jklingsporn.vertx.jooq.shared.reactive;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.sqlclient.Row;

/**
 * Created by jensklingsporn on 07.08.18.
 */
public class JsonAccessor {

    private JsonAccessor(){}

    public static JsonObject getJsonObject(Row row, String field){
        return row.get(JsonObject.class,row.getColumnIndex(field));
    }

    public static JsonArray getJsonArray(Row row, String field){
        return row.get(JsonArray.class,row.getColumnIndex(field));
    }

}
