package com.work.effectivejava.item34;

import java.util.Arrays;
import java.util.Collection;

public enum ExtentionalOperation implements Operation {
    EXP("^") {
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%") {
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private final String symbol;

    ExtentionalOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }


    @Override
    public double apply(double x, double y) {
        return 0;
    }

    // // Using an enum class object to represent a collection of extended enums (page 178)
// public static void main(String[] args) {
//     double x = Double.parseDouble(args[0]);
//     double y = Double.parseDouble(args[1]);
//     test(ExtendedOperation.class, x, y);
// }
// private static <T extends Enum<T> & Operation> void test(
//         Class<T> opEnumType, double x, double y) {
//     for (Operation op : opEnumType.getEnumConstants())
//         System.out.printf("%f %s %f = %f%n",
//                 x, op, y, op.apply(x, y));
// }

    // Using a collection instance to represent a collection of extended enums (page
    // 178)
    public static void main(String[] args) {

        double x = 2;
        double y = 4;
        test2(Arrays.asList(BasicOperation.values()), x, y);

    }

//	private static void test(Collection<? extends Operation> opSet, double x, double y) {
//		for (Operation op : opSet)
//			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
//	}

    private static void test2(Collection<Operation> opSet, double x, double y) {
        for (Operation op : opSet)
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }

}
