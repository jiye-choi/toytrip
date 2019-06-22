package com.macaron.toytrip.domain.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.ToString;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ToString
@Getter
public enum YesNo {

    NO("아니오"),
    YES("네");

    private String name;

    private static Map<Integer, YesNo> tables;

    static {
        tables = Stream.of(values()).collect(Collectors.toMap(YesNo::getId, Function.identity()));
    }

    YesNo(String name) {
        this.name = name;
    }

    @JsonValue
    public int getId() {
        return ordinal();
    }

    @JsonCreator
    public static YesNo valueOfId(String key) {
        return tables.get(Integer.parseInt(key));
    }

    @Component
    public static class YesNoConverter implements Converter<String, YesNo> {

        @Override
        public YesNo convert(String source) {
            return YesNo.valueOfId(source);
        }
    }

    public boolean isYes() {
        return this == YES;
    }

    public boolean isNo() {
        return this == NO;
    }
}
