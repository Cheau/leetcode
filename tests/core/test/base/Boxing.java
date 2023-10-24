package test.base;

interface Boxing {
    default Object box(int index, Object arg) {
        return arg;
    }
}
