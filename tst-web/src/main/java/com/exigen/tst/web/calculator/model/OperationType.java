package com.exigen.tst.web.calculator.model;


public enum OperationType {
    MINUS("minus"), PLUS("plus") , MULTIPLY("multiply"),
    DIVIDE("divide"),SQRT("sqrt"),ABS("abs"), SIN("sin"),
    COS("cos"), TAN("tan"), POW("pow"), PROC("proc"),DIVIDEONE("divideONE");

    private String type;

    OperationType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
