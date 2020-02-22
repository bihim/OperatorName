package com.bihim.operatorname;

import androidx.annotation.NonNull;

public class OperatorAndCountry
{
    private String id;
    private String operator_name;

    public OperatorAndCountry(String id, String operator_name)
    {
        this.id = id;
        this.operator_name = operator_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name;
    }

    @NonNull
    @Override
    public String toString() {
        return operator_name;
    }
}
