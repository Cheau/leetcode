package test.base;

interface Unboxing {
    default Object unbox(Object result) {
        return result;
    }
}
