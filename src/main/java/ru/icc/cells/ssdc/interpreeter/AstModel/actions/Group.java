package ru.icc.cells.ssdc.interpreeter.AstModel.actions;

import ru.icc.cells.ssdc.interpreeter.AstModel.Identifier;
import ru.icc.cells.ssdc.interpreeter.FieldAlias;

public class Group extends Action {

    public Group(String name) {
        super(name);
    }

    private Identifier identifier1;

    public Identifier getIdentifier1() {
        return identifier1;
    }

    public void setIdentifier1(Identifier identifier1) {
        this.identifier1 = identifier1;
    }

    private Identifier identifier2;

    public Identifier getIdentifier2() {
        return identifier2;
    }

    public void setIdentifier2(Identifier identifier2) {
        this.identifier2 = identifier2;
    }

    @Override
    public String toString() {
        return String.format("[ %s ( %s, %s ) ]", getName(), identifier1.toString(), identifier2.toString());
    }

    @Override
    public String fetchCode() {

        StringBuilder code = new StringBuilder();



        return code.toString();
    }

}
