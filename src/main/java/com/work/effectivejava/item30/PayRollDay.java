package com.work.effectivejava.item30;

import static com.work.effectivejava.item30.PayRollDay.PayType.WEEKDAY;
import static com.work.effectivejava.item30.PayRollDay.PayType.WEEKEND;

public enum PayRollDay {

    MONDAY(WEEKDAY), TUESDAY(WEEKDAY), WEDNESDAY(WEEKDAY), THURSDAY(WEEKDAY), FRIDAY(WEEKDAY), SATURDAY(WEEKEND),
    SUNDAY(WEEKEND);

    private final PayType payType; //para ödemek için bir payType ihtiyacımız var bunun içinde bir payType enum oluşturuyoruz

    PayRollDay(PayType payType) {
        this.payType = payType;
    }

    int pay(int minutesWorked, int payRate) {
        return payType.pay(minutesWorked, payRate);
    }

    enum PayType{

        WEEKDAY{
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked <= MINS_PER_SHIFT ? 0 : (minsWorked - MINS_PER_SHIFT) * payRate / 2;
            }

        },
        WEEKEND{

            int overtimePay(int minsWorked, int payRate) {
                return minsWorked * payRate / 2;
            }

        };

        //Buna bir tane Abstract Method yazıyorum çünkü ikiside farkı implement etmek zorunda
        abstract int overtimePay(int mins, int payRate);

        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minsWorked, int payRate) {
            int basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked, payRate);
        }
    }

    public static void main(String[] args) {
        for (PayRollDay day : values())
            System.out.printf("%-10s%d%n", day, day.pay(8 * 60, 1));
    }



}









