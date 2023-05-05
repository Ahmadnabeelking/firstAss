package com.example.firstass.result;

public class result {
    String qestion,op, op2,op3;

    public result(String qestion, String op, String op2, String op3) {
        this.qestion = qestion;
        this.op = op;
        this.op2 = op2;
        this.op3 = op3;
    }

    public String getQestion() {
        return qestion;
    }

    public void setQestion(String qestion) {
        this.qestion = qestion;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }
}
