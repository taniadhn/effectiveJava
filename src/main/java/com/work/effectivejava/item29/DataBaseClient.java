package com.work.effectivejava.item29;

public class DataBaseClient {


    ///Client
    public static void main(String[] args) {

        Column<Integer> integerColumn = new Column<Integer>(Integer.class);
        Column<String> stringColumn = new Column<String>(String.class);
        Column<String> stringColumn2 = new Column<String>(String.class);

        DataBaseRow dataBaseRow = new DataBaseRow();
        dataBaseRow.putColumn(integerColumn, 3);
        dataBaseRow.putColumn(stringColumn, "5");
        dataBaseRow.putColumn(stringColumn2, "4");


        System.out.println("The integer + 1: " + (dataBaseRow.getColumn(integerColumn) + 1));
        System.out.println("The string: " + dataBaseRow.getColumn(stringColumn));
        System.out.println("The String2: " + dataBaseRow.getColumn(stringColumn2));

    }


}
