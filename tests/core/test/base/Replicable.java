package test.base;

import java.lang.reflect.Array;
import java.util.Arrays;

interface Replicable {

    default Object[] replicate(Object[] args) {
        return Arrays.stream(args).map(this::replicate).toArray();
    }

    private Object replicate(Object arg) {
        if (arg.getClass().isArray()) {
            int length = Array.getLength(arg);
            Object replica = Array.newInstance(arg.getClass().getComponentType(), length);
            for (int i = 0; i < length; i++) {
                Array.set(replica, i, replicate(Array.get(arg, i)));
            }
            return replica;
        }
        return arg;
    }
}
