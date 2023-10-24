package test.base;

import java.lang.reflect.Array;
import java.util.Arrays;

interface Replicable {

    default Object[] replicate(Object[] args) {
        return Arrays.stream(args)
                .map(arg -> {
                    if (arg.getClass().isArray()) {
                        int length = Array.getLength(arg);
                        Object replica = Array.newInstance(arg.getClass().getComponentType(), length);
                        System.arraycopy(arg, 0, replica, 0, length);
                        return replica;
                    }
                    return arg;
                })
                .toArray();
    }
}
