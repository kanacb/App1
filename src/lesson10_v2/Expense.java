package lesson10_v2;

import java.sql.Date;

public class Expense {

    private int id;
    private String expense;
    private Date date;

    public Expense(int id, String expense, Date date) {

        this.id = id;
        this.expense = expense;
        this.date = date;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getExpense() {
        return expense;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
