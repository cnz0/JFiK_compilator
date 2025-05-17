package src;

import java.util.List;

public record Value(Type type, Object value) {

    public int asInt() {
        return (int) value;
    }

    public double asFloat() {
        return (double) value;
    }

    @SuppressWarnings("unchecked")
    public List<Value> asArray() {
        return (List<Value>) value;
    }

    public boolean isArray() {
        return type == Type.ARRAY;
    }

    public boolean isInt() {
        return type == Type.INT;
    }

    public boolean isFloat() {
        return type == Type.FLOAT;
    }
}